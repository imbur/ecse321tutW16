package Decorator;

public class DecoratorDemo {

	public static void main(String[] args){
		//make a new basic ship
		BasicShip basic = new BasicShip();
		basic.FireLasers();
		System.out.println();

		
		//make the basic ship faster
		FastShip fast = new FastShip(basic);
		fast.PowerUP();
		fast.FireLasers();
		
		System.out.println();
		
		//this is how you can make something awesome!
		DefensiveShip boss = new DefensiveShip(new DefensiveShip(new FastShip(new BasicShip())));
		boss.PowerUP();
		boss.FireLasers();
		
		boss=  new DefensiveShip(boss);
		
		
	}
}
