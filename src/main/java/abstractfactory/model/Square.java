package abstractfactory.model;

import abstractfactory.inte.Shape;

/**
 * 正方形类
 *
 * @author lj
 *
 */
public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
