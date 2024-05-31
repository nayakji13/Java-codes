import java.util.Scanner;
public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5482;
        int sum = 0;
        while (n != 0){
            int lastdigit = n%10;
            sum = sum + lastdigit;
            n = n/10;
        }
        System.out.println(sum);
    }
}
