@echo off
setlocal
cd /d "%~dp0"

echo ============================================
echo   FOICE DO AGOURO - Forge 1.20.1
echo   Compilador automatico
echo ============================================

echo.
echo Verificando Java e Gradle...
java -version
if errorlevel 1 (
  echo ERRO: Java/JDK nao encontrado. Instale o JDK 17 x64.
  pause
  exit /b 1
)
gradle -v
if errorlevel 1 (
  echo ERRO: Gradle nao encontrado. Instale o Gradle 8.8 e adicione ao PATH.
  pause
  exit /b 1
)

echo.
echo Criando Gradle Wrapper 8.8...
gradle wrapper --gradle-version 8.8 --distribution-type bin
if errorlevel 1 (
  echo ERRO ao criar o Gradle Wrapper.
  pause
  exit /b 1
)

echo.
echo Compilando o mod. A primeira compilacao pode demorar e precisa de internet...
call gradlew.bat build
if errorlevel 1 (
  echo.
  echo A compilacao falhou. Copie o erro acima para obter ajuda.
  pause
  exit /b 1
)

echo.
echo ============================================
echo COMPILACAO CONCLUIDA!
echo JAR: build\libs\FoiceDoAgouro-Forge-1.20.1-1.0.0.jar
echo ============================================
pause
