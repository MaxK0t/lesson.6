package by.academy.lesson6;

public enum Body {
    BODY1("Strong"), BODY2("Weak"), BODY3("Normal");

    private String type;

    Body(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
