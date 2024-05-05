/*public class arrays {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        System.out.println(a[3]);
    }
}*/






/*public class arrays {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for( int i=0 ; i<5 ;i++){
            System.out.println(a[i]);
        }
    }
}*/






/*import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        int size, i;
        System.out.println("Enter size of Arrays.. ");
        Scanner k = new Scanner(System.in);
        size=k.nextInt();

        int a[] = new int [size];
        for(i=0 ; i<size ; i++){
            a[i]=k.nextInt();
        }
        System.out.print(" Printed Array elements :- ");
        for(i=0 ; i<size ; i++){
            System.out.print(a[i]+" ");
        }
    }
}*/







// ---> using for each loop -->//

/*class arrays
{
    public static void main(String[] args) {
        int a[] = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        for( int b : a)
        {
            System.out.print(b+" ");
        }
    }
}*/






// -----> toString()   asList()   deepToString() <----- //

/*import java.util.Arrays;

class arrays
{
    public static void main(String[] args) {
        
        String a[] = {"kunal","sameer","paresh","amit"};

        System.out.println("ToString  "+ Arrays.toString(a));

        System.out.println("asList  "+ Arrays.asList(a));

        int arr[][] = {{10,20},{30,40}};
        System.out.println("deepTostring  "+ Arrays.deepToString(arr));
    }
}*/






//---> print Array element in reverse order ----> //

/*import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        int a[] = new int [5];
        Scanner k = new Scanner(System.in);
        System.out.println("Enter element in Arrays.. ");

        for(int i=0 ; i<a.length ; i++){
            a[i]=k.nextInt();
        }
        System.out.print(" Array elements :- ");
        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\n Array Reverse elements :- ");
        for(int i=a.length-1 ; i>=0 ; i--){
           System.out.print(a[i]+" ");
        }
    }
}*/






// -----> Copy Array element <----- //

/*import java.util.Scanner;
class arrays{
    public static void main(String[] args) {
        int a[] = new int [5];
        int b[] = new int [5];
        Scanner k = new Scanner(System.in);
        System.out.println("Enter element in Arrays.. ");

        for(int i=0 ; i<5 ; i++){
            a[i]=k.nextInt();
        }
        System.out.print("First Array elements :- ");
        for(int i=0 ; i<5; i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\n Second Array elements :- ");
        for(int i=0 ; i<5; i++){
            b[i] = a[i];
           System.out.print(b[i]+" ");
        }
    }
}*/






// -----> Sum of Array element <----- //
/*import java.util.Scanner;
class arrays{
    public static void main(String[] args) {
        int sum=0;
        int a[] = new int [5];
        Scanner k = new Scanner(System.in);
        System.out.println("Enter element in Arrays.. ");

        for(int i=0 ; i<5 ; i++){
            a[i]=k.nextInt();
        }
        System.out.print("Array elements :- ");
        for(int i=0 ; i<5; i++){
            System.out.print(a[i]+" ");
            sum = a[i]+sum;
        }
        System.out.print("\n sum of Array elements :- "+sum);
    
    }
}*/






// -----> Search Array Element <----- //
/*import java.util.Scanner;

class arrays {
    public static void main(String[] args) {
        int n,count=0;
        int a[] = new int [5];
        Scanner k = new Scanner(System.in);
        System.out.println("Enter element in Arrays.. ");

        for(int i=0 ; i<5 ; i++){
            a[i]=k.nextInt();
        }
        System.out.print("Array elements :- ");
        for(int i=0 ; i<5; i++){
            System.out.print(a[i]+" ");     
        }
        System.out.print("\n Enter Search Element :- ");
        n=k.nextInt();
        for(int i=0 ; i<5; i++){
            if(a[i]==n){
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("Item Found "+count+" times");
        }else
        {
            System.out.println("Item not found");
        }    
    }
}*/





// -----> Find average of Array element <----- //
/*import java.util.Scanner;

class arrays {
    public static void main(String[] args) {
        int sum=0;
        double avg;
        int a[] = new int [5];
        Scanner k = new Scanner(System.in);
        System.out.println("Enter element in Arrays.. ");

        for(int i=0 ; i<5 ; i++){
            a[i]=k.nextInt();
        }
        System.out.print("Array elements :- ");
        for(int i=0 ; i<5; i++){
            System.out.print(a[i]+" ");     
        }
        for(int i=0 ; i<5; i++){
            sum=a[i]+sum;
        }
        avg=sum/5.0;
        System.out.print("\nAddition "+sum +"\n Average "+ avg);
    }
}*/





// -----> Sort Array element in Ascending and Descending order <----- //
/*import java.util.Scanner;

class arrays {
    public static void main(String[] args) {
        int temp;
        int a[] = new int [5];
        Scanner k = new Scanner(System.in);
        System.out.println("Enter element in Arrays.. ");

        for(int i=0 ; i<5 ; i++){
            a[i]=k.nextInt();
        }
        for(int i=0 ; i<5 ; i++){
            for(int j=i+1 ; j<5 ; j++){
                if(a[i]>a[j])               //--> if(a[i]<a[j]) --> descending order
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Ascending order :- ");
        for(int i=0 ; i<5 ; i++){
            System.out.print(a[i]+" ");
        }
    }
}*/






// ------> ** Sort()    Equals()    copyOf() ** <------ //

// Sort()  -->

/*import java.util.Scanner;
import java.util.Arrays;

class arrays {
    public static void main(String[] args) {
        
        int a[] = new int [5];
        Scanner k = new Scanner(System.in);
        System.out.println("Enter Data in Arrays.. ");

        for(int i=0 ; i<5 ; i++){
            a[i]=k.nextInt();
        }
        Arrays.sort(a);
        for(int i=0 ; i<5 ; i++){
            System.out.print(a[i]+" ");
        }
    }
}*/




// Equals()  -->

/*import java.util.Scanner;
import java.util.Arrays;

class arrays {
    public static void main(String[] args) {
        
        int a[] = new int [5];
        int a2[] = new int [5];
        Scanner k = new Scanner(System.in);
        System.out.println("Enter Data in First Arrays.. ");

        for(int i=0 ; i<a.length ; i++){
            a[i]=k.nextInt();
        }
        System.out.println("Enter Data in Second Arrays.. ");

        for(int i=0 ; i<a.length ; i++){
            a2[i]=k.nextInt();
        }
        boolean E = Arrays.equals(a,a2);
        System.out.print(" Both Arrays are equals ? : "+E);
    }
}
*/




// copyOf()  -->

/*import java.util.Scanner;
import java.util.Arrays;

class arrays {
    public static void main(String[] args) {
        
        int a[] = new int [5];
        Scanner k = new Scanner(System.in);
        System.out.println("Enter Data in Arrays.. ");

        for(int i=0 ; i<a.length ; i++){
            a[i]=k.nextInt();
        }
        int a2[] = Arrays.copyOf(a,5);  //(a,6)
        //a2[5] = 100;
        System.out.print("Data in Array a2 :");
        for(int i=0 ; i<a2.length ; i++){
            System.out.print(a2[i]+" ");
        }
    }
}*/





//  ----> Compare Arrays <---- //
/*import java.util.Arrays;
class arrays
{
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int b[] = {10,20,30,40,50};

        if(Arrays.equals(a,b))                       // if(a==b) --> not allow
        {
            System.out.println("Both Arrays are Equal ");
        }
        else
        {
            System.out.println("Both Arrays are not Equal ");
        }
    }
}*/





// ----> find biggest element in Arrays <----- //

/*import java.util.Scanner;
class arrays
{
    public static void main(String[] args) {
        int a[] = new int [5];
        int max;
        Scanner k = new Scanner(System.in);
        System.out.println("enter Array element ");

        for(int i=0; i<5 ; i++)
        {
            a[i]=k.nextInt();
        }
        max =a[0];
        for(int i=1;i<5;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.print("Maximum Element "+max);
    }
}*/





// -----> Insert Items in Arrays <----- //

/*import java.util.Scanner;
class arrays
{
    public static void main(String[] args) {
        int size , loc , item,i ;
        Scanner k = new Scanner(System.in);
        System.out.println("enter Array Size : ");
        size = k.nextInt();

        int a[] = new int [size+1];
        System.out.println("enter Array element : ");

        for(i=0 ; i<size ; i++){
            a[i] = k.nextInt();
        }
        System.out.println("Enter Array Location : ");
        loc = k.nextInt();
        System.out.println("Enter New Item : ");
        item = k.nextInt();
        for(i=size ; i>loc ; i--){
            a[i]=a[i-1];
        }
        a[loc] = item;
        size++;
        for(i=0 ; i<size ; i++){
            System.out.println(a[i]);
        }
    }
}
*/




// -----> delete Items in Arrays <----- //

/*import java.util.Scanner;
class arrays
{
    public static void main(String[] args) {
        int size , loc , item,i ;
        Scanner k = new Scanner(System.in);
        System.out.println("enter Array Size : ");
        size = k.nextInt();

        int a[] = new int [size];
        System.out.println("enter Array element : ");

        for(i=0 ; i<size ; i++){
            a[i] = k.nextInt();
        }
        System.out.println("Enter Array Location : ");
        loc = k.nextInt();
     
        for(i=loc ; i<size-1 ; i++){
            a[i]=a[i+1];
        }
        size--;
        for(i=0 ; i<size ; i++){
            System.out.println(a[i]);
        }
    }
}*/





// -----> Matrix Program using 2D Array <----- //

/*import java.util.Scanner;
class arrays
{
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner k = new Scanner(System.in);
        System.out.println("Enter Array Element: ");

        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
            a[i][j] = k.nextInt();
            }
        }
        System.out.println("Matrix : ");
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
            System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/




// -----> Ssum of Two Matrix <----- //

/*import java.util.Scanner;
class arrays
{
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        Scanner k = new Scanner(System.in);
        System.out.println("For First Matrix Data: ");
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
            a[i][j] = k.nextInt();
            }
        }
        System.out.println("For Second Matrix Data : ");
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
            b[i][j] = k.nextInt();
            }
        }
        System.out.println("First Matrix : ");
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
            System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix : ");
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
            System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of Two Matrix : ");
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
                c[i][j] = a[i][j] + b[i][j]; 
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/





// -----> Transpose Matrix <----- //

/*import java.util.Scanner;
class arrays
{
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner k = new Scanner(System.in);
        System.out.println("For First Matrix Data: ");
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
            a[i][j] = k.nextInt();
            }
        }
        System.out.println("First Matrix : ");
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
            System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix : ");
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
            System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}*/





// -----> Mirror Matrix <----- //

/*import java.util.Scanner;
class arrays
{
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner k = new Scanner(System.in);
        System.out.println("For First Matrix Data: ");
        for(int i=0 ; i<=1 ; i++){
            for(int j=0 ; j<=1 ; j++){
            a[i][j] = k.nextInt();
            }
        }
        System.out.println("First Matrix : ");
        for(int i=0 ; i<=1 ; i++){
            for(int j=0 ; j<=1 ; j++){
            System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Mirror Matrix : ");
        for(int i=0 ; i<=1 ; i++){
            for(int j=1 ; j>=0 ; j--){
            System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/