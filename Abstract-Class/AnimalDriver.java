public class AnimalDriver {
    public static void main(String[] args) {
        Animal dog = new Dog("Spike", "Inggris", 4);
        Animal chicken = new Chicken("Jago", "Indonesia", 2);
        Animal lion = new Lion("Mufasa", "Afrika", 4);

        System.out.println("Nama: " + dog.getNama() + ", Asal: " + dog.getAsal());
        dog.toShout();
        dog.toEat();
        
        System.out.println("-------------------");
        
        System.out.println("Nama: " + chicken.getNama() + ", Kaki: " + chicken.getJumlahKaki());
        chicken.toShout();
        chicken.toEat();
        
        System.out.println("-------------------");
        
        System.out.println("Nama: " + lion.getNama() + ", Kaki: " + lion.getJumlahKaki());
        lion.toShout();
        lion.toEat();
    }
}