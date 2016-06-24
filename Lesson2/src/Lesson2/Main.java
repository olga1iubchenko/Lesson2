package Lesson2;

public class Main {
	
	public static void main(String[] args) {
		 Cat cat = new Cat();
		 cat.kind = "Devonshirskiy Reks";
		 cat.eyesColor = "Green";
		 cat.name = "Nephrete";
		 cat.isItHasFure();	  
		 
		 Dog dog = new Dog();
		 dog.size = "Big";
		 dog.weight = "70 kg";
		 dog.name = "Doggie";
		 dog.eat();	
		 
		 Bird b = new Bird();
		 b.move();
		 
		 Snake s = new Snake();
		 s.move();
		 
		 Creature c = new Bird();
		 c.move();
		 
		 Creature c1 = new Snake();
		 c1.move();
		 
		 Move m = new Move();
		 m.moveIt(s);
		 m.moveIt(b);
		}
	

}
