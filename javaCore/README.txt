//Without a Build Tool (Raw JDK)
//Compile
javac -d bin src/jcore/oop/basics/*.java
javac -d bin -sourcepath src src/jcore/oop/additional/Main.java

//Run
java -cp bin jcore.oop.basics.Main
java -cp bin jcore.oop.additional.Main

// cmd list all files
dir /s /b