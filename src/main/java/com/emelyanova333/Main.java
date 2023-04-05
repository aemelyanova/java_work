package com.emelyanova333;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Long.MIN_VALUE;

public class Main {
    public static void main(String[] args) {

        byte varByte = 127;
        short varShort = -136;
        int varInt = 33562;
        long varLong = 1_236_548_855;
        float varFloat = 0.9F;
        double varDouble = 0.7;

        System.out.println("Арифметические операции" + "\n");

        System.out.println("Cложение: " + (varByte + varShort));
        System.out.println("Вычитание: " + (varLong - varInt));
        System.out.println("Умножение: " + (varByte * varShort));
        System.out.println("Деление: " + (varInt / varByte));
        System.out.println("Добавить +1: " + (++varInt));
        System.out.println("Добавить +1: " + (varInt++));
        System.out.println("Уменьшить на 1: " + (varShort--));
        System.out.println("Остаток от деления: " + (varInt % varByte));
        System.out.println("*".repeat(25));

        System.out.println("Операторы сравнения" + "\n");

        System.out.println("33562 больше 127?: " + (varInt > varByte));
        System.out.println("33562 равно 127?: " + (varInt == varByte));
        System.out.println("33562 не равно 1_236_548_855: " + (varInt != varLong));
        System.out.println("33562 больше или равно 0.7?: " + (varInt >= varDouble));
        System.out.println("-136 меньше или равно 0.9?: " + (varShort >= varFloat));
        System.out.println("*".repeat(25));

        System.out.println("Логические операторы" + "\n");

        int timeHour = 19;
        int timeMinute = 59;
        String dayWeekMonday = "Понедельник";
        String dayWeekThursday = "Четверг";

        if ((dayWeekMonday.equals("Понедельник")) || (dayWeekThursday.equals("Четверг"))) {
            if ((timeHour == 19) && (timeMinute == 59))
                System.out.println("Пришло время смотреть новый урок");
        } else {
            System.out.println("Пока можно отдыхать");
        }
        System.out.println("*".repeat(25));

        System.out.println("Переполнение в вычисления" + "\n");
        byte varByteMax = 127;
        short varShortMin = -32768;
        int varIntMax = MAX_VALUE;
        long varLongMin = MIN_VALUE;

        // byte resultByte = varByteMax + 1000; -> ошибка несовместимые типы
        // System.out.println(resultByte);
        System.out.println("varByteMax + varIntMax = " + (varByteMax + varIntMax));

        //short resultShort = varShortMin - 100; -> ошибка:несовместимые типы
        // System.out.println(resultShort);
        System.out.println("varShortMin - 100 = " + (varShortMin - 100));

        System.out.println(varLongMin + varShortMin);
        System.out.println(varLongMin - 1);
        System.out.println("*".repeat(25));

        System.out.println("Вычисление комбинаций int и double" + "\n");
        System.out.println("int_max + double: " + (varIntMax + varDouble));
        System.out.println("int_max - double: " + (varIntMax - varDouble));
        System.out.println("int * double: " + (varInt * varDouble));
        System.out.println("int / double: " + (varInt / varDouble));
        System.out.println("*".repeat(25));
    }
}
