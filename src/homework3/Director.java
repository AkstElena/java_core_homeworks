package homework3;


/*
Опишите класс руководителя, наследник от сотрудника.
Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом,
чтобы он мог поднять заработную плату всем, кроме руководителей.
В основной программе создайте руководителя и поместите его в общий массив сотрудников.
Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 */
public class Director extends Employee {
    public Director(String name, String midName, String surName, String position, String phone, int salary, int birthYear) {
        super(name, midName, surName, position, phone, salary, birthYear);
    }

    static void raiseSalary(Employee employee, int sumRaise, int ageRaise) {
        if ((employee.getAge() > ageRaise) && (employee instanceof Director == false)) {
            employee.setSalary(employee.getSalary() + sumRaise);
        }
    }

    static void raiseSalary(Employee employee, int sumRaise) {
        if (employee instanceof Director == false) {
            employee.setSalary(employee.getSalary() + sumRaise);
        }
    }

    @Override
    public String toString() {
        return String.format("Директор: %s %s %s, %s, телефон=%s, зарплата=%d, возраст=%d",
                surName, name, midName, position, phone, salary, getAge());
    }
}
