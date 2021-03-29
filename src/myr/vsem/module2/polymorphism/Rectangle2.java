package myr.vsem.module2.polymorphism;

import myr.vsem.module2.polymorphism.interfaces.iGeometry1;
import myr.vsem.module2.polymorphism.interfaces.iPacking1;

import java.util.Objects;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class Rectangle
 * @since 21.03.2021 - 12.55
 */
public class Rectangle2 implements iGeometry1, iPacking1 {
    private int length;//создаем поля
    private int width;//создаем поля

    public Rectangle2() { //пустой конструктор
    }

    public Rectangle2(int length, int width) { //заполненый конструктор
        this.length = length;
        this.width = width;
    }

    public int getLength() { //находим значение высоты
        return length;
    }

    public void setLength(int length) {  //добавлять если был пустой экземпляр
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() { //с помощью метода выводим все значения
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle2 rectangle = (Rectangle2) o;
        return getLength() == rectangle.getLength() && getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.getLength() + this.getWidth());
    }

    @Override
    public double getArea() {
        return this.getWidth() * this.getLength();
    }

    @Override
    public String toJSON() {
        String json = "Rectangle2" + "{" + "\"" + "length" + "\"" + ":" + this.getLength() +
                "," +
                "\"" + "width" + "\"" + ":" + this.getWidth() +
                "}";
        return json;
    }

    @Override
    public String toXML() {
        String xml = "<Rectangle2>" +
                " + <length> " + this.getLength() + "</length>" +
                " + <width> " + this.getWidth() + "</width>" +
                "</Rectangle2>";
        return xml;
    }
}

