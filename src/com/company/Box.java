package com.company;

// Создать класс Box с полями ширина, высота, длина.
public class Box {
    private int length; //длина
    private int width; //ширина
    private int height; //высота

// Конструктор
    public Box(int length, int width, int height) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

// Конструктор Default (поля = 1,2,3)
    public Box() {
        this.length = 1;
        this.height = 2;
        this.width = 3;
    }

// Конструктор для кубика
    public Box(int cube) {
        this.length = cube;
        this.height = cube;
        this.width = cube;
    }

// Добавить геттеры и сеттеры на каждое поле.
    public int getLength() {return length;} // для получения полей
    public int getWidth() {return width;}
    public int getHeight() {return height;}

    public void setLength(int length) {this.length = length;} // для установки полей
    public void setWidth(int width) {this.width = width;}
    public void setHeight(int height) {this.height = height;}

// Определить метод класса, который вычисляет объем коробки
    public int volumeBox(Box box) {
        return box.length * box.width * box.height;
    }

// Вывести на экран объемы этих коробок
    public void printBoxVolume(Box box) {
        System.out.println("The volume of the " + this.toString() + " = " + volumeBox(box) + " (cm^3)"); // <имя коробки>
    }

    // изменить вервию Java

}