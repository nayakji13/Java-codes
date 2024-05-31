import java.util.Scanner;
public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR MARKS");
        int marks = sc.nextInt();
        if(marks >= 91 && marks<= 100){
            System.out.println("AA");
        }else if(marks>=81 && marks<=91){
            System.out.println("AB");
        }else if(marks>=71 && marks<=81){
            System.out.println("AC");
        }else if(marks>=61 && marks<=71){
            System.out.println("BB");
        }else if(marks>=1 && marks<=40){
            System.out.println("FAIL HOGYE BAWA tUM");
        }
    }
}
