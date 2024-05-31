import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("TYPE M OR F FOR MALE AND FEMALE RESPECTIVELY");
        char gender = sc.next().charAt(0);
        if (gender=='f' || gender == 'F') {
            System.out.println("GOOD MORNING MAAM");
        }
        else if(gender == 'M' || gender == 'm'){
            System.out.println("good morning sir");
        }
        else {
            System.out.println("wrong input");
        }

    }
}
