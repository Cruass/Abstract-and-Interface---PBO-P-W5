public class GoodsDriver {
    public static void main(String[] args) {
        Food apel = new Food("Apel", 15000, 95);
        Toy actionFigure = new Toy("Action Figure", 150000, 8);
        Book javaBook = new Book("Buku Pemrograman Java", 450000, "James Gosling");

        System.out.println("--- Data Makanan ---");
        apel.display();
        
        System.out.println("\n--- Data Mainan ---");
        actionFigure.display();
        
        System.out.println("\n--- Data Buku ---");
        javaBook.display();
    }
}