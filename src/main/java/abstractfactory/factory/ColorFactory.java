package abstractfactory.factory;

import abstractfactory.inte.Color;
import abstractfactory.inte.Shape;
import abstractfactory.model.Blue;
import abstractfactory.model.Green;
import abstractfactory.model.Red;

/**
 * 颜色类的具体工厂
 *
 * @author lj
 *
 */
public class ColorFactory extends AbstractFactory {
	@Override
	public Color getColor(String color) {
		if ("BLUE".equalsIgnoreCase(color)) {
			return new Blue();
		} else if ("RED".equalsIgnoreCase(color)) {
			return new Red();
		} else if ("GREEN".equalsIgnoreCase(color)) {
			return new Green();
		} else {
			return null;
		}
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}
}
