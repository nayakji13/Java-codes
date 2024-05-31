import java.util.Scanner;
public class Bijlibill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("units daalo be");
        int units = sc.nextInt();
        double amt = 0;
        if(units>400){
            amt = amt +(units-400)*13;
            units = 400;
        }
        if(units > 200){
          amt=amt+(units-200)*8;
          units = 200;
        }
        if (units>100){
            amt = amt+(units - 100)*6;
            units = 100;
        }
        amt = amt+units *4.2;
        System.out.println(amt);
    }
}
