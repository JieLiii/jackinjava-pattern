package abstractfactory;

import abstractfactory.factory.AbstractFactory;
import abstractfactory.factory.ColorFactory;
import abstractfactory.factory.ShapeFactory;

/**
 * 工厂生成器
 * 通过传递形状或颜色信息来获取工厂
 *
 * @author lj
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String factory) {
		if ("COLOR".equalsIgnoreCase(factory)) {
			return new ColorFactory();
		} else if ("SHAPE".equalsIgnoreCase(factory)) {
			return new ShapeFactory();
		} else {
			return null;
		}
	}
}
