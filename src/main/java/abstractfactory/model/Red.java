package abstractfactory.model;

import abstractfactory.inte.Color;

/**
 * 红色类
 *
 * @author lj
 */
public class Red implements Color {
	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}
}
