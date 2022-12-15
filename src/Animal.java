public abstract class Animal {
    private String colour;

    public Animal(String colour) {
        this.colour = colour;
    }

    public static void animal() {
        System.out.println("Animal");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "colour='" + colour + '\'' +
                '}';
    }
}