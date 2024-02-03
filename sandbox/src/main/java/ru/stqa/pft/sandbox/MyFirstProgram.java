package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	public static void main(String[] args) {
		
		Square s = new Square(5);

		Rectangle r = new Rectangle(10, 2);


		System.out.println("функция квадрат - " + s.area());
		System.out.println("функция площадь - " + r.rectangle());

	}

	public static void hello(String some){
		System.out.println("hello, " + some + " !");
	}

	public static double area(Square s){
		return s.l * s.l;
	}


	
	
}