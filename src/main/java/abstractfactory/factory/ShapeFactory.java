package abstractfactory.factory;

import abstractfactory.inte.Color;
import abstractfactory.inte.Shape;
import abstractfactory.model.Circle;
import abstractfactory.model.Rectangle;
import abstractfactory.model.Square;

/**
 * 形状类的具体工厂
 *
 * @author lj
 */
public class ShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shape) {
		if ("CIRCLE".equalsIgnoreCase(shape)) {
			return new Circle();
		} else if ("RECTANGLE".equalsIgnoreCase(shape)) {
			return new Rectangle();
		} else if ("SQUARE".equalsIgnoreCase(shape)) {
			return new Square();
		} else {
			return null;
		}
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
}
