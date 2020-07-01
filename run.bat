@echo off

IF NOT EXIST build (
    MKDIR build
)

RD /S /Q .\build\io
DIR /b /s .\src\*.java > sources.txt

javac -d .\build @sources.txt
DEL sources.txt

CD build
jar -cvfe TicTacToe.jar io.summet.tictactoe.TicTacToe * > log.txt
DEL log.txt

CD ..

java -jar build/TicTacToe.jar