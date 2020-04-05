package ru.geekbrains.lesson1;

import java.util.Scanner;

public class FirstApp
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("1. Введите число: ");
        int i1 = in.nextInt();
        System.out.print("1. Введите число: ");
        int i2 = in.nextInt();
        System.out.print("1. Введите число: ");
        int i3 = in.nextInt();
        System.out.print("1. Введите число: ");
        int i4 = in.nextInt();
        System.out.println(task_1(i1, i2, i3, i4));
        System.out.print("2. Введите число: ");
        int a = in.nextInt();
        System.out.print("2. Введите число: ");
        int b = in.nextInt();
        System.out.println(task_2(a, b));
        System.out.print("3. Введите число: ");
        int c = in.nextInt();
        task_3(c);
        System.out.print("4. Введите имя: ");
        String name = in.next();
        System.out.println(task_4(name));
        System.out.print("5. Введите год: ");
        int d = in.nextInt();
        System.out.println(task_5(d));
    }
    /*
        1. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
    где a, b, c, d – целочисленные входные параметры этого метода;
     */
    private static float task_1 (int a, int b, int c, int d)
    {
        return a * (b + (c / (float) d));
    }
    /*
        2. Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах
    от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
     */
    private static boolean task_2 (int a, int b)
    {
        int c = a + b;

        if (c >= 10 && c <= 20)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /*
        3. Написать метод, которому в качестве параметра передается целое число, метод должен проверить
    положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом.
    Результат работы метода вывести в консоль
     */
    private static void task_3 (int a)
    {
        if (a >= 0)
        {
            System.out.println("Введённое число положительное");
        }
        else
        {
            System.out.println("Введённое число отрицательное");
        }
    }
    /*
        4. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен
    вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.
     */
    private static String task_4 (String name)
    {
        return "Привет, " + name + "!";
    }
    /*
        5. Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным,
     кроме каждого 100-го, при этом каждый 400-й – високосный. Для проверки работы вывести результаты
     работы метода в консоль
     */
    private static String task_5 (int age)
    {
        if ((age % 4) == 0 && !((age % 100) == 0))
            return "Високосный год!";
        else if ((age % 400) == 0)
            return "Високосный год!";
        else if (age > 0)
            return "Невисокосный год!";
        return "Неверное значение";
    }
}