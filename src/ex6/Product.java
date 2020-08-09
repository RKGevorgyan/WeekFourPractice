package ex6;

import java.util.Objects;

public class Product {

    private String toyType;

    public Product(String toyType) {
        this.toyType = toyType;
    }


    public String getToyType() {
        return toyType;
    }

    @Override
    public String toString() {
        return toyType;
    }
}
