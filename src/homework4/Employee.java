package homework4;

public class Employee extends Customer{
    private String position
;

    public Employee(String name, Integer age, String phoneNumber, Gender gender, String position) {
        super(name, age, phoneNumber, gender);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return position + " - " + super.toString();
    }
}
