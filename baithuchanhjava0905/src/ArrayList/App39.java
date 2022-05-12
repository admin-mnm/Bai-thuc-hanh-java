package ArrayList;

import java.util.Scanner;
import java.util.LinkedList;
public class App39{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
       // khai báo1danh sách liên kết
       // lưu trữ các tháng trong năm
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Tháng 1");
        linkedList.add("Tháng 2");
        linkedList.add("Tháng 3");
        linkedList.add("Tháng 4");
        linkedList.add("Tháng 5");
        linkedList.add("Tháng 6");
        linkedList.add("Tháng 7");
        linkedList.add("Tháng 8");
        linkedList.add("Tháng 9");
        linkedList.add("Tháng 10");
        linkedList.add("Tháng 11");
        linkedList.add("Tháng 12");
        System.out.println("Nhập vào chi số của phần tử cần lấy: ");
        int index=scanner.nextInt();
    }