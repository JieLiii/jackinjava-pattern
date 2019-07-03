package abstractfactory.model;

import abstractfactory.inte.Shape;

/**
 * 长方形类
 *
 * @author lj
 *
 */
public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
