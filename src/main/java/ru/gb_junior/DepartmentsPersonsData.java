package ru.gb_junior;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Functions {

    static List<Department> departments = new ArrayList<>();
    static List<Person> persons = new ArrayList<>();

    public static List<Department> DepartmentsList() {
        for (int i = 0; i < 10; i++) {
            departments.add(new Department("№" + i));
        }
        return departments;
    }

    public static List<Person> PersonsList() {
        DepartmentsList();
        String[] names = {"Илья", "Валерия", "Максим", "Алексей", "Юля", "Никита", "Александр", "Сергей", "Иван"};
        for (String s: names) {
            persons.add(new Person(
                    s,
                    ThreadLocalRandom.current().nextInt(20, 61),
                    ThreadLocalRandom.current().nextInt(20_000, 100_000) * 1.0,
                    departments.get(ThreadLocalRandom.current().nextInt(departments.size()))
            ));
        }
        return persons;
    }

      ///  persons.stream()
      //          .max(Comparator.comparing(Person::getSalary))
      //      .ifPresent(System.out::println);

}
