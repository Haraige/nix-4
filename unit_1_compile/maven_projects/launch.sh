bold=$(tput bold)
normal=$(tput sgr0)

cd app || exit

mvn -v || (echo "${bold}Need to install Maven! Maven destination folder /usr/local/""${normal}";
sudo tar -C "/usr/local/" xzvf maven_install/apache-maven-3.6.3-bin.tar.gz && echo "${bold}Maven has been installed!${normal}";
 export PATH=/usr/local/apache-maven-3.6.3/bin:$PATH)

mvn clean

echo "${bold}Compile project and installing maven repositories...${normal}"
mvn install

echo "${bold}Creating jar file...${normal}"
mvn package

echo "${bold}Start program...${normal}"
java -jar target/app-*.jar
