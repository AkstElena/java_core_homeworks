package homework4;

public enum Gender {

    MAN("мужчина"), WOMAN("женщина");
    private String russianGenderTitle;

    public String getRussianGenderTitle() {
        return russianGenderTitle;
    }

    Gender(String russianGenderTitle) {
        this.russianGenderTitle = russianGenderTitle;
    }
}
