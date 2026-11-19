import java.util.Scanner;
class MovieTicket {
    String movie;
    String seat;
    double price;
    MovieTicket(String m) {
        movie = m;
        seat = "Normal";
        price = 150;
    }
    MovieTicket(String m, String s) {
        movie = m;
        seat = s;
        if (s.equalsIgnoreCase("Normal"))
            price = 150;
        else if (s.equalsIgnoreCase("Premium"))
            price = 250;
        else if (s.equalsIgnoreCase("VIP"))
            price = 400;
        else
            price = 150;
    }
    void show() {
        System.out.println("-------");
        System.out.println("Movie: " + movie);
        System.out.println("Seat Type: " + seat);
        System.out.println("Price: Rs. " + price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        String m1 = sc.nextLine();
        MovieTicket t1 = new MovieTicket(m1);
        System.out.print("Enter Movie Name: ");
        String m2 = sc.nextLine();
        System.out.print("Enter Seat Type (Normal/Premium/VIP): ");
        String s2 = sc.nextLine();
        MovieTicket t2 = new MovieTicket(m2, s2);
        t1.show();
        t2.show();
        System.out.println("-----");
        sc.close();
    }
}