public class Sheep extends Pest{
    public Sheep(String colour, int age, String name) {
        super(colour, age, name);
    }

    @Override
    public String toString() {
        return "Sheep{}" + super.toString();
    }
}

