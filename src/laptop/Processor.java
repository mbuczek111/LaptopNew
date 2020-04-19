package laptop;

public class Processor {
    String name;
    int frequency;
    int cores;

    public Processor(String name, int frequency, int cores) {
        this.name = name;
        this.frequency = frequency;
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", cores=" + cores +
                '}';
    }
}
