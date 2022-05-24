import java.util.HashSet;
import java.util.Scanner;
public class Appjava54{
   public static void main(String[] args){
        String name;
        HashSet<String> hashSetstring=new HashSet<>();
        Scanner scanner=new Scanner(System. in);
        // thêm các phần tử vào hashSetstring
        hashSetstring.add("Wilson");
        hashSetstring.add("Nike");
        hashSetstring.add("Volvo");
        hashSetstring.add("Kia");
        hashSetstring.add("Lenovo");
        hashSetstring.add("Lenovo");
        // hiến thị các phần tử trong hashSetString
        System.out.println("Các phần tử trong hashSetstring: ");
        System.out.println(hashSetstring);
        System.out.println("Nhập phần từ cần xóa: ");
        name=scanner.next();
        // nếu phần tử cần xóa có tồn tại hashSetString thì sẽ thông báo xóa thành công
        // và hiến thị các phần tử còn lại ngược lại thông báo xóa không thành công
        if (hashSetstring.contains(name)){
            hashSetstring.remove(name);
            System.out.println("Xóa thành công!");
            System.out.println("Các phần tử còn lại trong hashsetString: ");
            System.out.println(hashSetstring);
        }else{
            System.out.println("Xóa không thành công!");
        }
    }
}
