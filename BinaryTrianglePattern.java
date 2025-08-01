import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int printvalue=1;
      
        System.out.println("enter the number: ");
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++) {
          printvalue=i%2==0?0:1;
            for(int j = 1; j <= i; j++) {
                System.out.print(printvalue);
              printvalue=(printvalue==0)?1:0;
            }
            System.out.println();
        }
        scan.close();
    }
