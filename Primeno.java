public class Primeno {
    public static void main(String[] args) {
        int n = 20;
        int c = 0;
        for(int i =1; i<=n; i++){
            if(n%i == 0)
                c++;
        }
        System.out.println( c== 2 ? "PRIME" : "NON PRIME");
    }
}
