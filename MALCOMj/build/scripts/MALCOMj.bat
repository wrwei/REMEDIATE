@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem
@rem SPDX-License-Identifier: Apache-2.0
@rem

@if "%DEBUG%"=="" @echo off
@rem ##########################################################################
@rem
@rem  MALCOMj startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%"=="" set DIRNAME=.
@rem This is normally unused
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and MALCO_MJ_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if %ERRORLEVEL% equ 0 goto execute

echo. 1>&2
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH. 1>&2
echo. 1>&2
echo Please set the JAVA_HOME variable in your environment to match the 1>&2
echo location of your Java installation. 1>&2

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo. 1>&2
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME% 1>&2
echo. 1>&2
echo Please set the JAVA_HOME variable in your environment to match the 1>&2
echo location of your Java installation. 1>&2

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\MALCOMj.jar;%APP_HOME%\lib\org.eclipse.epsilon.emc.emf-2.8.0.jar;%APP_HOME%\lib\org.eclipse.epsilon.emc.json-2.8.0.jar;%APP_HOME%\lib\org.eclipse.epsilon.evl.engine-2.8.0.jar;%APP_HOME%\lib\org.eclipse.epsilon.egl.engine-2.8.0.jar;%APP_HOME%\lib\org.eclipse.epsilon.erl.engine-2.8.0.jar;%APP_HOME%\lib\org.eclipse.epsilon.eol.engine-2.8.0.jar;%APP_HOME%\lib\org.eclipse.epsilon.common-2.8.0.jar;%APP_HOME%\lib\guava-27.1-jre.jar;%APP_HOME%\lib\org.eclipse.emf.ecore.change-2.14.0.jar;%APP_HOME%\lib\org.eclipse.emf.ecore.xmi-2.16.0.jar;%APP_HOME%\lib\org.eclipse.emf.ecore-2.23.0.jar;%APP_HOME%\lib\httpclient-4.5.14.jar;%APP_HOME%\lib\commons-logging-1.2.jar;%APP_HOME%\lib\json-simple-1.1.1.jar;%APP_HOME%\lib\commons-collections-3.2.2.jar;%APP_HOME%\lib\commons-codec-1.14.jar;%APP_HOME%\lib\httpcore-4.4.16.jar;%APP_HOME%\lib\antlr-runtime-3.5.2.jar;%APP_HOME%\lib\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;%APP_HOME%\lib\org.eclipse.emf.common-2.44.0.jar;%APP_HOME%\lib\junit-4.10.jar;%APP_HOME%\lib\hamcrest-core-1.1.jar


@rem Execute MALCOMj
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %MALCO_MJ_OPTS%  -classpath "%CLASSPATH%" org.sawg.malcomj.TransformationRunner %*

:end
@rem End local scope for the variables with windows NT shell
if %ERRORLEVEL% equ 0 goto mainEnd

:fail
rem Set variable MALCO_MJ_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
set EXIT_CODE=%ERRORLEVEL%
if %EXIT_CODE% equ 0 set EXIT_CODE=1
if not ""=="%MALCO_MJ_EXIT_CONSOLE%" exit %EXIT_CODE%
exit /b %EXIT_CODE%

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
