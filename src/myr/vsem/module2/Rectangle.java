package myr.vsem.module2;

import java.util.Objects;

/**
 * @author User
 * @version 1.0.0
 * @project vsem
 * @class Rectangle
 * @since 20.03.2021 - 16.49
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

        /*Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle();
        int l1 = r1.getLength();
        System.out.println(l1);
        r2.setLength(12);
        r2.setWidth(21);
        int l2 = r2.getLength();
        System.out.println(l2);
        System.out.println(r2.toString());
        Rectangle r3 = new Rectangle(12,21);
        System.out.println(r3.equals(r2));
        System.out.println(r3.equals(r1));
        System.out.println(r1.hashCode());
        System.out.println(r2.hashCode());
        System.out.println(r1.getArea());*/