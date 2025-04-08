package homework4;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/*
В класс покупателя добавить перечисление с гендерами, добавить в сотрудника свойство «пол» со значением
созданного перечисления. Добавить геттеры, сеттеры.
Добавить в основную программу перечисление с праздниками (нет праздника, Новый Год, 8 марта, 23 февраля),
написать метод, принимающий массив сотрудников, поздравляющий всех сотрудников с Новым Годом, женщин с 8 марта,
а мужчин с 23 февраля, если сегодня соответствующий день.
 */

public class Main {

    private final static Customer[] customers = {
            new Customer("Elena", 31, "89012225554", Gender.MAN),
            new Customer("Renat", 27, "89178899551", Gender.WOMAN),
    };

    private final static Product[] products = {
            new Product("milk", 140),
            new Product("banana", 160),
            new Product("bread", 55),
            new Product("juice", 185),
            new Product("meat", 540),
    };

    private final static Employee[] employees = {
            new Employee("Mark", 25, "89012225554", Gender.MAN, "seller"),
            new Employee("Kate", 27, "89175599551", Gender.WOMAN, "seller"),
            new Employee("Mila", 19, "85521899551", Gender.WOMAN, "intern"),
            new Employee("Petr", 39, "89856421133", Gender.MAN, "manager"),
    };

    private static Order[] orders = new Order[5];

    public enum Holiday {NewYear, March8, February23, OrdinaryDay}


    public static void congratulation(Employee[] employees){
        LocalDate today = LocalDate.now();
        for (Employee employee:employees) {
            if (today.getDayOfMonth() == 1 && today.getMonthValue() == 1){
                System.out.printf("%s, c новым годом!", employee.getName());
            }
            if (today.getDayOfMonth() == 23 && today.getMonthValue() == 2 && employee.getGender() == Gender.MAN){
                System.out.printf("%s, c 23 февраля!", employee.getName());
            }
            if (today.getDayOfMonth() == 8 && today.getMonthValue() == 3 && employee.getGender() == Gender.WOMAN){
                System.out.printf("%s, c 8 марта!", employee.getName());
            }
        }
        System.out.println("Хорошего дня!");
    }

    public static void congratulation(Employee[] employees, LocalDate today){
//        LocalDate today = LocalDate.now();
        for (Employee employee:employees) {
            if (today.getDayOfMonth() == 1 && today.getMonthValue() == 1){
                System.out.printf("%s, c новым годом!\n", employee.getName());
            }
            if (today.getDayOfMonth() == 23 && today.getMonthValue() == 2 && employee.getGender() == Gender.MAN){
                System.out.printf("%s, c 23 февраля!\n", employee.getName());
            }
            if (today.getDayOfMonth() == 8 && today.getMonthValue() == 3 && employee.getGender() == Gender.WOMAN){
                System.out.printf("%s, c 8 марта!\n", employee.getName());
            }
        }
        System.out.println("Хорошего дня!");
    }




    private static boolean isInArray(Object[] arr, Object o) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(o)) return true;
        return false;
    }

    public static Order makeOrder(Customer customer, Product product, Integer quantity)
            throws AmountException, CustomerException, ProductException {
        if (!isInArray(customers, customer)) {
            throw new CustomerException("Данного покупателя нет в списке");
        }
        if (!isInArray(products, product)) {
            throw new ProductException("Данного продукта нет в списке");
        }
        if (quantity > 100 || quantity < 0) {
            throw new AmountException("Количество продукции не может быть орицательно или более 100 штук");
        }
        Order order = new Order(customer, product, quantity);
        return order;


    }

    public static void main(String[] args) throws CustomerException, AmountException, ProductException {

//        System.out.println("Покупатели: " + Arrays.toString(customers));
//        System.out.println("Товары: " + Arrays.toString(products));
//        System.out.println("Работники: " + Arrays.toString(employees));
//        System.out.println(employees[0].getAge());
//        System.out.println(employees[0].getPosition());
        congratulation(employees);
        congratulation(employees, LocalDate.of(2025, 1, 1));
        congratulation(employees, LocalDate.of(2025, 2, 23));
        congratulation(employees, LocalDate.of(2025, 3, 8));


    }


}
