//--->Program to print natural number in given rang--->//

/*import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter The Number..!");
        Scanner k = new Scanner(System.in);
        n = k.nextInt();
        for (int i = 0; i <= n; i++) {

            System.out.println(i);
        }
    }
}*/




//-----> Sum of Even number program <-----//
/*import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int n, sum =0;
        System.out.println("Enter The Number..!");
        Scanner k = new Scanner(System.in);
        n = k.nextInt();
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is " + (sum));
    }
}*/






// ----> Sum of Odd and Even In given range <---- //
/*import java.util.Scanner;
class SumOfOddAndEvenInGivenRange
{
	public static void main(String[] args) {
	    int i,n,sum=0;
		System.out.println("Enter the number..!");
		Scanner k = new Scanner(System.in);
		n = k.nextInt();
		if(n%2==0)
		{
		    for(i=0;i<=n;i=i+2)
		    {
		        sum = sum+i;
		    }
		    System.out.println("Sum of Even number is "+(sum));
		}
		else
		{
		for(i=1;i<=n;i=i+2)
		    {
		        sum = sum+i;
		    }
		    System.out.println("Sum of Odd number is "+(sum));
		}
		
	}
}*/







//--->Program to take character input from the user--->//

/*import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        char ch;
        System.out.println("Please Enter character... ");
        Scanner k = new Scanner(System.in);
        ch = k.next().charAt(0);
        System.out.println(ch);
    }
}*/






//---> program to cheak the character is "Vovels or Consonants"--->//

/*import java.util.Scanner;
class Practice {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any character");
        Scanner k = new Scanner(System.in);
        ch = k.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("Character is Vowels");
        }
        else
        {
            System.out.println("Character is Consonents");
        }
        }
    }*/





//----->Print ASCII value of character.---->//

//input A-Z --> 65-90
//input a-z --> 97-122

/*import java.util.Scanner;

class Practice
{
    public static void main(String[] args) {
        char ch ;
        System.out.println("Enter any Character..!");
        Scanner k = new Scanner(System.in);
        ch = k.next().charAt(0);

        int a = ch;
        System.out.println("ASCII value of "+ch+" is "+ a);

    }
}*/





//---->Print A to Z Alphabet------>//

/*class Practice{
    public static void main(String[] args) {
        for(char i='a'; i<='z' ; i++){
            System.out.print(i +"   ");
        }
    }
}*/





//----->program to find greatest number b/w two number---->//

/*import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Enter Two Number..!");
        Scanner k = new Scanner(System.in);
        a = k.nextInt();
        b = k.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}*/



//----> Calculate Power of a Number ---->//

/*import java.util.Scanner;
class Practice
{
    public static void main(String[] args) {
        int n,p,result = 1;
        System.out.println("Enter any Number..!");
        Scanner k = new Scanner(System.in);
        n = k.nextInt();

        System.out.println("Enter Power..!");
        p = k.nextInt();

        for(int i=1 ; i<=p ;i++)
        {
            result = n*result;
        }
        System.out.println("Power is "+ (result));
    }
}*/




//----> Calculate average marks of five variables---->//
/*import java.util.Scanner;
class Practice
{
    public static void main(String[] args) {
        int a,b,c,d,e;
        System.out.println("Enter marks of five subjects!");
        Scanner k = new Scanner(System.in);
        a = k.nextInt();
        b = k.nextInt();
        c = k.nextInt();
        d = k.nextInt();
        e = k.nextInt();

        int sum = a+b+c+d+e;
        System.out.println("Total Marks "+sum);

        double avg = sum/5;
        System.out.println("Average marks "+avg);

    }
}*/




//----> pragram to find Factorial of number ---->//

/*import java.util.Scanner;
class Practice
{
    public static void main(String[] args) {
        int n, fact =1;
        System.out.println("Enter any number!");
        Scanner k = new Scanner(System.in);
        n = k.nextInt();

        for(int i=1 ; i<=n ; i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of Number is "+(fact));
    }
}*/




//----> Count number of digits---->//

/*import java.util.Scanner;
class Practice
{
    public static void main(String[] args) {
        int n, count = 0;
        System.out.println("Enter any number!");
        Scanner k = new Scanner(System.in);
        n = k.nextInt();
        
        while(n>0)
        {
            n = n/10;
            count++;
        }
        System.out.println("No of digits "+ count);
    }
}*/




//-----> Print Multiplication Table ----->//

//6*1 = 1
//6*2 = 12
//6*3 = 18
//6*4 = 24
//6*5 = 30
//6*6 = 36
//6*7 = 42
//6*8 = 48
//6*9 = 54
//6*10 = 60

/*import java.util.Scanner;
class Practice
{
    public static void main(String[] args) {
        int num;
        System.out.println("Enter any number!");
        Scanner k = new Scanner(System.in);
        num = k.nextInt();

        for(int i=1 ; i<=10 ;i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}*/




//----->  Tax calculate program -----> //

/*import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Practice
{
    public static void main(String[] args) {
        int sal;double Tax;
        System.out.println("Enter the Salary..");
        Scanner k = new Scanner(System.in);
        sal = k.nextInt();
        
        if(sal<=10000)
        {
            System.out.println(sal + " No Tax");
        }
        else if(sal>=1000 && sal<= 100000)
        {
            Tax = sal*0.10;
            System.out.println(sal +" "+Tax);
        }
        else
        {
            Tax = sal*0.20;
            System.out.println(sal +" "+Tax);
        }

    }
}*/





// -----> Swap two number -----> //

/*import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Practice
{
    public static void main(String[] args) {
        int a,b,Temp;
        System.out.println("Enter Two Number..");
        Scanner k = new Scanner(System.in);
        a = k.nextInt();
        b = k.nextInt();
        System.out.println("After Swaping "+a+" "+b);

        Temp = a;
        a = b;
        b = Temp;

        System.out.println("Before Swaping "+a+" "+b);
    }
}*/




//-----> Leap Year program ------> //
// 1. century (100%=0 and 400%=0)    2000 2400
// 2. yearly (100%!=0 and 4%=0)    2020  2024

/*import java.util.Scanner;
class Practice
{
    public static void main(String[] args) {
        int y;
        System.out.println("Enter any year..");
        Scanner k = new Scanner(System.in);
        y = k.nextInt();

        if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap year");
        }
    }
}*/




// ----> Reverse Number program ----> //

/*import java.util.Scanner;
class Practice
{
    public static void main(String[] args) {
        int n,r;
        System.out.println("Enter any Number..");
        Scanner k = new Scanner(System.in);
        n = k.nextInt();

        while(n>0)
        {
            r = n%10;
            System.out.print(r);
            n=n/10;

        }
    }
}*/




//----> Palindrome numner program ----->//

/*import java.util.Scanner;
class Practice
{
    public static void main(String[] args) {
        int n,r,c,s=0;
        System.out.println("Enter any Number..");
        Scanner k = new Scanner(System.in);
        n = k.nextInt();

        c=n;
        while(n>0)
        {
            r = n%10;
            s=(s*10)+r;
            n = n/10;
        }
        if(c==s)
        {
            System.out.println("Palindrome number ");
        }
        else 
        {
            System.out.println("Not Palindrome Number");
        }
    }
}*/




//----> Sum of digit program ---->//

/*import java.util.Scanner;
class Practice
{
    public static void main(String[] args) {
        int n,r,s=0;
        System.out.println("Enter any Number..");
        Scanner k = new Scanner(System.in);
        n = k.nextInt();

        while(n>0)
        {
            r = n%10;
            sum = sum+r;
            n = n/10;
        }
        System.out.println("sum of number is "+ s);
    }
}*/




//-----> Armstrong number ------> //

/*import java.util.Scanner;
class Practice
{
    public static void main(String[]args){
        int n , rem ,c, arm=0;
        System.out.println("Enter the Number..");
        Scanner k = new Scanner(System.in);
        n = k.nextInt();
        
        c = n;
        while(n>0)
        {
            rem = n%10;
            arm = (rem*rem*rem)+arm;
            n = n/10;
        }
        if(c == arm)
        {
            System.out.println("Armstrong Number ");
        }
        else
        {
            System.out.println("Not Armstrong Number ");
        }
    }
}*/





//----> Square root of Number ----> //

/*import java.util.Scanner;
class Practice
{
    public static void main(String[]args){
        int n ;
        System.out.println("Enter the Number..");
        Scanner k = new Scanner(System.in);
        n = k.nextInt();
        double s = Math.sqrt(n);
        System.out.println("Square root of "+n+"is "+s);
    }
}*/





//-----> Prime Number -----> //

/*import java.util.Scanner;
class Practice
{
    public static void main(String[]args){
        int n ,count=0;
        System.out.println("Enter the Number..");
        Scanner k = new Scanner(System.in);
        n = k.nextInt();

        for(int i=1 ; i<=n ; i++)
        {
            if(n%i==0)
            {
            count++;
            }
        }
        if(count == 2)
        {
            System.out.println("Number is prime ");
        }
        else
        {
            System.out.println("Number is Not Prime ");
        }
    }
}*/





//----> prime number b/n two number <----//
/*import java.util.Scanner;
class Practice
{
    public static void main(String[]args){
        int n1=10,n2=100 , i , j;
        //System.out.println("Enter the Number..");
        Scanner k = new Scanner(System.in);
        //n1 = k.nextInt();
        //n2 = k.nextInt();


        for( i=n1 ; i<=n2 ; i++)
        {
            for( j=2 ; j<=i ; j++)
            {
                if(i%j==0)
                break;
            }
            if(i==j)
            System.out.print(j+" ");
        }
    }
}*/




//-----> Fibonacci Series <------ //

/*import java.util.Scanner;
class Practice
{
    public static void main(String[] args) {
        int a=0 , b=1 , c , term ;
        System.out.println("Enter The terms : ");
        Scanner k = new Scanner(System.in);
        term=k.nextInt();

        for(int i=1 ; i<=term ; i++){
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        }    
    }
}*/





//-----> Tribonacci Series <------ //

/*import java.util.Scanner;
class Practice
{
    public static void main(String[] args) {
        int a=0 , b=1 , c=2 , d , term ;
        System.out.println("Enter The terms : ");
        Scanner k = new Scanner(System.in);
        term=k.nextInt();

        for(int i=1 ; i<=term ; i++){
            System.out.print(a+" ");
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }    
    }
}*/



/*import java.util.Scanner;

class Practice{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter number of Semister : ");
        int n = k.nextInt();

        System.out.println("Enter number of Subject in 1 Semister : ");
        int p = k.nextInt();

        System.out.println("Enter number of Subject in 2 Semister : ");
        int s = k.nextInt();


        System.out.println("Marks Obtain in First Semister : ");
        int sub1 = k.nextInt();
        int sub2 = k.nextInt();
        int sub3 = k.nextInt();
        if (sub1 < sub2 && sub3 < sub2)
        {
            System.out.println("Maximum marks in 1 semister : "+sub2);
        }
        else if (sub2 < sub3 && sub1 < sub3)
        {
            System.out.println("Maximum marks in 1 semister : "+sub3);
        }
        else
        {
            System.out.println("Maximum marks in 1 semister : "+sub1);
        }


        System.out.println("Marks Obtain in First Semister : ");
        int s1 = k.nextInt();
        int s2 = k.nextInt();
        int s3 = k.nextInt();
        int s4 = k.nextInt();
        if (s1 < s2 && s3 < s2)
        {
            System.out.println("Maximum marks in 1 semister : "+s2);
        }
        else if (s2 < s3 && s1 < s3)
        {
            System.out.println("Maximum marks in 1 semister : "+s3);
        }
        else if (s3 < s4 && s2 < s4 && s1 < s4 )
        {
            System.out.println("Maximum marks in 1 semister : "+s4);
        }


    }
} */


















































