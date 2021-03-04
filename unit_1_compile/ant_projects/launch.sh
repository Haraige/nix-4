bold=$(tput bold)
normal=$(tput sgr0)

which ant || (echo "${bold}Installing ant...${normal}"; sudo apt install ant) || (echo "${bold}Installing ant...${normal}"; yum install ant -y) || (echo "Something went wrong"; exit)

ant clean
echo "${bold}Start compile ant projects...${normal}"
sleep 1s

ant jar || (echo "${bold}Cannot compile project or create jar file!${normal}"; exit)
echo "${bold}Compilation success!${normal}"

echo "${bold}Start program...${normal}"
sleep 1s
ant run