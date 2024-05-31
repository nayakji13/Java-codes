import java.util.Scanner;
public class Sumnterms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;//factorial k liye yaha 0 ki jagah 1 lga dena
        for(int i=1;i<=n ; i++ ){
            sum = sum + i;// sum * i for factorial
        }
        System.out.println(sum);
        //for sum of n terms = System.out.println(n*(n+1)/2);
    }
}
