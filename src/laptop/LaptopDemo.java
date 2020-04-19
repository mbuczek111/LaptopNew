package laptop;

public class LaptopDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Laptop lenovo = new Laptop("Lenovo", 8,"1920x1080",2,new Processor("AMD",2500,2),new HardDrive("Seagate","HDD",1024));
        Laptop acer = (Laptop) lenovo.clone();
        System.out.println(lenovo);
        System.out.println(acer);
    }
}
