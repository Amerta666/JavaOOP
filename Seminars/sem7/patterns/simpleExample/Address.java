package sem7.patterns.simpleExample;

public class Address {
    private String city;
    private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    // Создаем копию объекта Address
    public Address copy() {
        return new Address(this.city, this.street);
    }
}

