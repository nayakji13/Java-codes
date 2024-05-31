import java.util.Scanner;
public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number do bawa");
        int a = sc.nextInt();
        System.out.println("doosra nmber do bawa");
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a);
        } else{
            System.out.println(b);
        }
    }
}
