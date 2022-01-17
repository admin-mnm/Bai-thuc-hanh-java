import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strHoTen ="";
        System.out.println("Nhap ten: ");
        String yourName = scanner.nextLine();
        strHoTen = scanner.nextLine();
        System.out.println("Xin Chao : " + yourName);
    }
}