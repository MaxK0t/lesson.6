package by.academy.lesson6;

public enum Head {
    HEAD1("Red"), HEAD2("Blue"), HEAD3("Yellow");

    private String typeHead;

    Head(String typeHead) {
        this.typeHead = typeHead;
    }

    public String getTypeHead() {
        return typeHead;
    }
}
