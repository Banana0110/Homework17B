package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Какую фигуру желает пользователь? ");
        Scanner scanner = new Scanner(System.in);
        Shape shape1 = new Square();
        Shape shape2 = new Triangle();
        shape1.draw(scanner.nextLine());
        shape1.draw();
        shape2.draw(scanner.nextLine());
        shape2.draw();
        System.out.println("Square" + scanner.nextLine());
        scanner.close(); //не получилось вывести только одну фигуру
    }
}







