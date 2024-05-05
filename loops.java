
// Addition of the n nember input by user
/*import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in) ;
     int n =  sc.nextInt();
     int sum = 0;
     for(int i=1 ; i<=n ; i++ ){
        sum = sum + i;
     }
     System.out.println(sum);
    }
}*/

// print the table of number input bt the user 
/*import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(n * i);
        }

    }
}*/

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
            System.out.println();
        }
    }
}