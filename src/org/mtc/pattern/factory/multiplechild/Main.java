package org.mtc.pattern.factory.multiplechild;

/*
 * 	工厂模式不易理解的好处：对多种子类的按需创建
 * 
 * 	这个好处基于面向接口编程，假设有一个接口，他有一大堆的实现类用于应对各种情况，那么要使用这个接口必然要面临判断该使用哪个实现类的情况，这些判断必然复杂曲折，丢进工厂类里就成了好选择
 * 	一般来说如果整个项目全部自写是很难发现工厂模式的这个优点的，但现在很少有不与外界联系的项目了，一旦项目需要连接数据库，马上就会看出工厂模式的这个优点
 */
public class Main {

}
