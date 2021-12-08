package com.company;

public class Square extends Shape {
    @Override
    public void draw() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
