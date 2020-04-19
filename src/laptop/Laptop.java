package laptop;

public class Laptop implements Cloneable {
    String name;
    int ram;
    String display;
    double weight;
    Processor procesor;
    HardDrive dysk;

    public Laptop(String name, int ram, String display, double weight, Processor procesor, HardDrive dysk) {
        this.name = name;
        this.ram = ram;
        this.display = display;
        this.weight = weight;
        this.procesor = procesor;
        this.dysk = dysk;

    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", display='" + display + '\'' +
                ", weight=" + weight +
                ", procesor=" + procesor +
                ", dysk=" + dysk +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Laptop cloned = (Laptop) super.clone();
        return cloned;
    }
}