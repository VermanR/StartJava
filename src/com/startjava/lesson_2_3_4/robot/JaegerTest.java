package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();
		jaegerOne.setModelName("Gipsy Danger");
		jaegerOne.setMark("Mark-3");
		jaegerOne.setOrigin("USA");
		jaegerOne.setHeight(79.25f);
		jaegerOne.setWeight(1.98f);
		jaegerOne.setSpeed(7);
		jaegerOne.setStrenght(8);
		jaegerOne.setArmor(6);

		System.out.println(jaegerOne.getModelName());
		System.out.println(jaegerOne.getMark());
		System.out.println(jaegerOne.getOrigin());
		System.out.println(jaegerOne.getHeight());
		System.out.println(jaegerOne.getWeight());
		System.out.println(jaegerOne.getSpeed());
		System.out.println(jaegerOne.getStrenght());
		System.out.println(jaegerOne.getArmor());

		jaegerOne.drift();
		jaegerOne.move();
		jaegerOne.scanKaiju();
		jaegerOne.useVortexCannon();

		Jaeger jaegerTwo = new Jaeger();
		jaegerTwo.setModelName("Cherno Alpha");
		jaegerTwo.setMark("Mark-1");
		jaegerTwo.setOrigin("Russia");
		jaegerTwo.setHeight(85.34f);
		jaegerTwo.setWeight(2.412f);
		jaegerTwo.setSpeed(3);
		jaegerTwo.setStrenght(10);
		jaegerTwo.setArmor(10);

		System.out.println(jaegerTwo.getModelName());
		System.out.println(jaegerTwo.getMark());
		System.out.println(jaegerTwo.getOrigin());
		System.out.println(jaegerTwo.getHeight());
		System.out.println(jaegerTwo.getWeight());
		System.out.println(jaegerTwo.getSpeed());
		System.out.println(jaegerTwo.getStrenght());
		System.out.println(jaegerTwo.getArmor());

		jaegerTwo.drift();
		jaegerTwo.move();
		jaegerTwo.scanKaiju();
		jaegerTwo.useVortexCannon();
	}
} 