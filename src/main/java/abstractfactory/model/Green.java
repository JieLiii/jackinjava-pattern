package abstractfactory.model;

import abstractfactory.inte.Color;

public class Green implements Color {
	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}
}
