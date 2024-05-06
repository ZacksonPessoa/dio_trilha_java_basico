
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length()< 8){
            System.out.println("erro");
        }
        System.out.println(s);
    }
}
