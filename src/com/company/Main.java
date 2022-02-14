package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namesA = new ArrayList<>();
        System.out.println("Введите 5 имен");
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();
        String name4 = scanner.nextLine();
        String name5 = scanner.nextLine();

        String[] names = {name1,name2,name3,name4,name5};
        for (int i = 0; i < names.length; i++) {
            namesA.add(names[i]);
        }
        System.out.println(namesA);

        ArrayList<String> namesB = new ArrayList<>();

        System.out.println("Введите 5 имен");

        String name6 = scanner.nextLine();
        String name7 = scanner.nextLine();
        String name8 = scanner.nextLine();
        String name9 = scanner.nextLine();
        String name10 = scanner.nextLine();

        String[] names1 = {name6,name7,name8,name9,name10};
        for (int i = 0; i < names.length; i++) {
            namesB.add(names1[i]);
        }
        System.out.println(namesB);

        ArrayList<String> namesC = new ArrayList<>();

        namesC.add(0,name1);
        namesC.add(1,name10);
        namesC.add(2,name2);
        namesC.add(3,name9);
        namesC.add(4,name3);
        namesC.add(5,name8);
        namesC.add(6,name4);
        namesC.add(7,name7);
        namesC.add(8,name5);
        namesC.add(9,name6);
        System.out.println(namesC);

        namesC.sort(Comparator.comparing(String::length));
        System.out.println(namesC);









    }
}
