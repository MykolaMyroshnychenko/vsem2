package myr.vsem.module2;

import java.util.Objects;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project vsem
 * @class Rectangle
 * @since 21.03.2021 - 12.55
 */
public class Rectangle {
    private int length;//создаем поля
    private int width;//создаем поля

    public Rectangle() { //пустой конструктор
    }

    public Rectangle(int length, int width) { //заполненый конструктор
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
        Rectangle rectangle = (Rectangle) o;
        return getLength() == rectangle.getLength() && getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }

    public int getArea(){
        return this.length * this.width;
    }
}

