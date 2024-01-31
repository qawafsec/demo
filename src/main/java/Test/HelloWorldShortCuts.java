package Test;

import javafx.scene.layout.BorderImage;

import java.util.List;

public class HelloWorldShortCuts {
    public static void main(String[] args) {

            // Типы с плавающей точкой
            float aFloat = 0.0F;
            double ml = 0.5;
            Double doubleWrapper = 9.1;
            // Символьный тип
            char aChar = 'a';
            Character characterWrapper = 'a';
            // Целочисленные типы
            byte aByte = 0; // 8b -128 + 127
            short aShort = 0; // 16b -32768 + 32767
            int aInt = 0; // 32b (-2^32) ... (+2^32 -1)
            Integer intWrapper = 0;
            long aLong = 0L; //64b
            String colour = "transparent";
           // Логический тип
            boolean hasCap = true;
            Boolean booleanWraper = true;
            List<String> compound = List.of("Glass", "Water", "Sugar"); // только объекты листить

            // Операторы
            // Операторы присвоения = присваивает то что справа в переменную слева
            String nameFirst = "Petya";
            int age = 26;
            String nameSecond = "Petya";
            // Арифмитические операторы (для работы с числами) + - / * % ++ --
            int result = aInt;

            // Операторы сравнения <, >, >=, <=, !=(не равно), ==("true" equal) - (всегда возвращают тип boolean)
            // System.out.println(3 == 3);
            // Логические операторы &(and), |(or), &&(short and), ||(short or), !(inversion), ^(analog !=)
            System.out.println(!(nameFirst.equals("Pet12ya") || age == 26));
            //if (nameFirst != null && nameFirst.length() == 6) {
              //  System.out.println("Luck");


            // Оператор instanceof
           // System.out.println(nameFirst instanceof String);


            // Тернарный оператотр (аналог if)

            char sex = 'm';

            String childName = sex == 'm'
                    ? "Valentin"
                    : "Valentina";

            // Управляющая конструкция if
            if (sex == 'm') {
                childName = "Valentin";
            } else if (sex == 'w')  {
                childName = "Valentina";
            } else {
                System.out.println(":((");
            }

            // Keyword new (чтобы создавать объекты, объект-это непосрдетсвенно значение,
            // в которое будут хранить в себе данные, который описаны в каком-то в классе
        char[] original;
        String name = new String(original:"Dima");
            String name = "Dima";



            }





    }









