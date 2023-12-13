package banking.models;

public class Address {
    String city, state, add, pin;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", add='" + add + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }

    public Address(String city, String state, String add, String pin) {
        this.city = city;
        this.state = state;
        this.add = add;
        this.pin = pin;
    }
}
