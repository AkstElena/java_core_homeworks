package homework3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Ivan", "Petrovich", "Kozlov", "constructor",
                "89178885544", 130000, 1996);
        Employee employee2 = new Employee("Lily", "Ivanovna", "Kozlova", "manager",
                "89600552144", 86000, 2001);
        Employee employee3 = new Employee("Olga", "Alexanrovna", "Ivanova", "cleaner",
                "8887235566", 60000, 1957);
        Employee employee4 = new Employee("Olga", "Ivanovna", "Petrova", "accountant",
                "89067743455", 90000, 1991);
        Director director1 = new Director("Petr", "Alexanrovich", "Ivanov", "director",
                "89271641144", 310000, 1975);
        Employee[] company = {employee1, employee2, employee3, employee4, director1};
        System.out.println("Исходные данные по персоналу: \n" + Arrays.toString(company));
//        for (int i = 0; i < company.length; i++) {
//            Director.raiseSalary(company[i], 5000, 45);
//
//        }
        for (int i = 0; i < company.length; i++) {
            Director.raiseSalary(company[i], 5000);
        }

//        System.out.println("Данные после повышения заработной платы работникам старше 45 лет, кроме директора: \n" + Arrays.toString(company));
        System.out.println("Данные после повышения заработной платы всем работникам, кроме директора: \n" + Arrays.toString(company));

//        System.out.println("Средний возраст работников: " + Employee.averageAge(company));
//        System.out.println("Средняя заработная плата работников: " + Employee.averageSalary(company));

        System.out.println(employee3.comparator(25, 12, 2022));

    }
}


