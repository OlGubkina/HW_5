package com.company;

public class Main {

    public static void main(String[] args) {
	//  Создать 5 конкретных объектов класса Box.
    //  Задать конкретное состояние этих объектов (конкретные величины ширины, высоты и длины).

        Box defaultBox = new Box();
        Box smallCube = new Box(3);
        Box bigCube = new Box(30);
        Box littleBox = new Box(1,2,3);
        Box longBox = new Box(20,3,4);

// Вывести на экран объемы этих коробок
        defaultBox.printBoxVolume(defaultBox); //?
        smallCube.printBoxVolume(smallCube);
        bigCube.printBoxVolume(bigCube);
        littleBox.printBoxVolume(littleBox);
        longBox.printBoxVolume(longBox);
    }
}
