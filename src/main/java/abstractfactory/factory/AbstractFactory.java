package abstractfactory.factory;

import abstractfactory.inte.Color;
import abstractfactory.inte.Shape;

/**
 * 抽象工厂
 *
 * @author lj
 */
public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}
