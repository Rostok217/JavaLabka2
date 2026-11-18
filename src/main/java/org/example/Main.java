package org.example;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        // 1. Створюємо початковий об'єкт Person
        Person person1 = new Person("Іваненко", "Іван", 20);

        System.out.println("Початковий об'єкт:");
        System.out.println(person1);

        // 2. Створюємо об'єкт Gson
        Gson gson = new Gson();

        // 3. Перетворюємо об'єкт у JSON
        String json = gson.toJson(person1);

        System.out.println("\nОб'єкт у форматі JSON:");
        System.out.println(json);

        // 4. Перетворюємо JSON назад у об'єкт
        Person person2 = gson.fromJson(json, Person.class);

        System.out.println("\nВідновлений об'єкт:");
        System.out.println(person2);

        // 5. Порівнюємо початковий та відновлений об'єкти
        System.out.println("\nРезультат порівняння equals:");
        System.out.println(person1.equals(person2));
    }
}
