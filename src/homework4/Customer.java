package homework4;

public class Customer {
    private String name;
    private Integer age;
    private String phoneNumber;
    private Gender gender;

    public Customer(String name, Integer age, String phoneNumber, Gender gender) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return name + ": телефон " + phoneNumber + " (" + age + " лет, " + gender.getRussianGenderTitle() + ")";
    }
}
