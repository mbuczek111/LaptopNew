package laptop;

public class HardDrive implements Cloneable {
    String name;
    String type;
    int capacity;

    public HardDrive(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (HardDrive) super.clone();

    }
}
