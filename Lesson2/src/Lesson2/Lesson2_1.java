package Lesson2;

public class Lesson2_1 {
String  name;
String surname;

public void doSmth(){
	System.out.println(name + " "+ surname);
}

public static void main(String[] args) {
 Lesson2_1 l = new Lesson2_1();
 l.name = "Prince";
 l.surname = "Persia";
 l.doSmth();	  
}
}

