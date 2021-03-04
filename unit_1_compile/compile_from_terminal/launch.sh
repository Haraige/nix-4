bold=$(tput bold)
normal=$(tput sgr0)

echo "${bold}Start compile project from terminal...${normal}"
sleep 1s
javac -sourcepath ./src -d ./build/classes -cp ./libs/commons-io-2.8.0.jar:./libs/commons-lang3-3.11.jar:./libs/commons-logging-1.2.jar ./src/ua/org/code/Fruits.java ./src/ua/org/code/Main.java ./src/ua/org/code/Cars.java ./src/ua/org/code/Computers.java || (echo "${bold}Compilation failed!${normal}"; exit)
echo "${bold}Compilation success!${normal}"

echo "${bold}Start program...${normal}"
sleep 1s
java -cp build/classes:./libs/commons-io-2.8.0.jar:./libs/commons-lang3-3.11.jar:./libs/commons-logging-1.2.jar: ua/org/code/Main || echo "${bold}Cannot start the program!${normal}"