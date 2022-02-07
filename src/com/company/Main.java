package com.company;

public class Main {

    public static void main(String[] args) {
        SomeThread test = new SomeThread();
        test.start();

        SomeThread test1 = new SomeThread();
        test1.start();
    }
}
