"""Unified entry point for the MALCOMp pipeline."""
import argparse
import logging
import sys
import os

# Ensure the MALCOMp directory is on the path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

from stages import (
    TermExtraction,
    DSLExtraction,
    EMFModelCreation,
    StateMachineExtraction,
)

STAGES = {
    "term": TermExtraction,
    "dsl": DSLExtraction,
    "model": EMFModelCreation,
    "statemachine": StateMachineExtraction,
}


def main():
    parser = argparse.ArgumentParser(
        description="MALCOMp — Multi-Agent LLM pipeline for Model-Driven Engineering"
    )
    parser.add_argument(
        "stages",
        nargs="*",
        default=list(STAGES.keys()),
        choices=list(STAGES.keys()),
        help="Pipeline stages to run (default: all in order)",
    )
    parser.add_argument(
        "--config",
        default="config.yaml",
        help="Path to config.yaml (default: config.yaml)",
    )
    parser.add_argument(
        "--repeat",
        type=int,
        default=1,
        help="Number of times to repeat term extraction (only applies to 'term' stage)",
    )
    args = parser.parse_args()

    logging.basicConfig(
        level=logging.INFO,
        format="%(asctime)s %(name)s %(levelname)s %(message)s",
    )

    for stage_name in args.stages:
        logging.info("Running stage: %s", stage_name)
        cls = STAGES[stage_name]
        stage = cls(config_path=args.config)

        if stage_name == "term" and args.repeat > 1:
            stage.run_multiple(args.repeat)
        else:
            stage.run()

        logging.info("Completed stage: %s", stage_name)


if __name__ == "__main__":
    main()
