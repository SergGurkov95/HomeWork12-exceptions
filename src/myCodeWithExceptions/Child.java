package myCodeWithExceptions;

public class Child extends Parent {
    String fatherName;

    public Child() {
    }

    public Child(String name, String fatherName) {
        super(name);
        this.fatherName = fatherName;
    }
}

