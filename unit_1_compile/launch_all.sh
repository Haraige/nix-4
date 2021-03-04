if [ -z "$JAVA_HOME" ]
then (echo "Install JAVA_HOME variable please!"; exit)
fi

echo "Compile from terminal:"; echo ""
cd compile_from_terminal || exit
sh launch.sh
cd ../

echo "Ant projects: "; echo ""
cd ant_projects || exit
sh launch.sh
cd ../

echo "Maven projects: "; echo ""
cd maven_projects || exit
sh launch.sh
