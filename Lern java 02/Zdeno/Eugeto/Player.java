package Eugeto;

public class Player {
    String name;
    int number;
    String city;

    public Player(String name, String number, String city) {
        this.name = name;
        this.number = Integer.parseInt(number);
        this.city = city;
    }

    @Override
    public String toString() {
        return "jmeno='" + name + '\'' +
                ", cislo=" + number +
                ", mesto='" + city + '\'';
    }
}
