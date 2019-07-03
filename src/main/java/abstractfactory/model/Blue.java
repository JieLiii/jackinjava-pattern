package abstractfactory.model;

import abstractfactory.inte.Color;

/**
 * 蓝色类
 *
 * @author lj
 *
 */
public class Blue implements Color {
	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
}
