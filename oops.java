
    //  ------------->  Single Inheritance  <---------------  //


/*class student
{
    int rollNo , marks ;
    String name;
    void show()
    {
        System.out.println("Display the data : ");
    }
}
class oops extends student
{
    void disp()
    {
        rollNo=34; marks=43 ;name="kunal";
        System.out.println(rollNo+" "+marks+" "+name);
    }
    public static void main(String[] args) {
        oops k = new oops();
        k.show();
        k.disp();      
    }
}*/






  //  -------------------> Multi-Level Inheritance  <---------------------- //

/*import java.util.Scanner;

class A
{
    int a,b,c;
    void add()
    {
        a=10; b=20;
        c=a+b;
        System.out.println("Addition of two number is : "+c);
    }
    void sub()
    {
        a=10; b=20;
        c=a-b;
        System.out.println("Substraction of two number is : "+c);
    }
  }
  class b extends A
  {
    void Multi()
    {
        a=90; b=2;
        c=a*b;
        System.out.println("multiplication of two number is : "+c);
    }
    void div()
    {
        a=100; b=2;
        c=a/b;
        System.out.println("division of two number is : "+c);
    }
  }
  class c extends b
  {
    void rem()
    {
        a=50; b=2;
        c=a%b;
        System.out.println("Remainder of two number is : "+c);
    }
    
  }
  class oops
  {
    public static void main(String[] args) {
    c k = new c();
        k.add();
        k.sub();
        k.Multi();
        k.div();
        k.rem();
    }
}*/






// ------------------> Hierarical Inheritance <------------------- //

/*class A 
{
   void input()
   {
       System.out.println("Enter your name : ");
   } 
}
class B extends A
{
    void show()
    {
        System.out.println("My name is Kunal : ");
    }
}
class C extends A
{
    void disp()
    {
        System.out.println("My Name is Sameer : ");
    }
}
class oops
{
    public static void main(String[] args) {
        B k = new B();
        C r = new C();
        k.input();
        k.show();
        r.input();
        r.disp();
    }
}*/







//---------------------------->  Super keyword  <----------------------------- //

// -->  By Variable 

/*class A 
{
    int a=10;
}
class B extends A
{
    int a=20;
    void show()
    {
        System.out.println(super.a);
        System.out.println(a);
    }
}
class oops
{
    public static void main(String[] args) {
        B k = new B();
        k.show();
    }
}*/


//  --> By Method()

/*class A 
{
    void show()
    {
        System.out.println("learn java ");
    }
}
class B extends A
{
    void show()
    {
        super.show();
        System.out.println("Core Java ");
    }
}
class oops
{
    public static void main(String[] args) {
        B k = new B();
        k.show();
    }
}*/



// --> By Constructor 

/*class A 
{
    A()
    {
       System.out.println("Learn Java ");
    }
}
class B extends A
{
    
    B()
    {
        // Automatically super keyword is created here ,thats why we dont write super();

       //super();
       System.out.println("kunal Borse ");
    }
}
class oops
{
    public static void main(String[] args) {
        B k = new B();
        
    }
}*/








// ----------------------------->  This Keyword  <-------------------------------- //
/* 
class oops
{
    void show()
    {
        System.out.println(this);
    }
    public static void main(String[] args) {
        oops k = new oops();
        k.show();
        System.out.println(k);
    }
}*/



/*
class oops
{
    int a;
    oops(int a)
    {
       this.a=a;
    }
    void show()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        oops k = new oops(100);
        k.show();
    }
}
*/



/*
class oops
{
    
    oops()
    {
       System.out.println("Learn Java ");
    }
    oops(int a)
    {
        this();
        System.out.println(a);
    }
    public static void main(String[] args) {
        oops k = new oops(100);
        
    }
}
*/



/*
class oops
{
    oops()
    {
       this(100);
    }
    oops(int a)
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        oops k = new oops();
    
    }
}*/








//  -----------------> Polymorphism  <--------------------- //

// --> Compile Time Polymorphism <-- //

/*class oops
{
    void show()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }
    void show(int x , int y)
    {
        int c;
        c=x+y;
        System.out.println(c);
    }
    void show(int x , double y)
    {
        double c;
        c=x+y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        oops k = new oops();
        k.show();
        k.show(100,200);
        k.show(300,10.50);
    }
}*/


//  --> Runtime Polymorphism  <--  //

/*class shape 
{
    void draw()
    {
        System.out.println("Can't say show type ");
    }
}
class square extends shape 
{
    @Override
    void draw()
    {
        //super.draw();
        System.out.println("Square Shape ");
    }
}
class oops
{
    public static void main(String[] args) {
        square k = new square();
        k.draw();
    }
}*/





// ------------ >  Encapsulation <------------- //

/*class A 
{
    private int value;         // Data hiding 

    public void setValue(int x)     // Data Abstraction 
    {
        value = x;
    }
    public int getValue()
    {
        return value ;
    }
}
class oops
{
    public static void main(String[] args) {
        A k = new A();
        k.setValue(100);
        System.out.println(k.getValue());
    }
}*/





//-----------------> Abstraction <-------------------- //

/*abstract class animal 
{
    {
        System.out.println("All animals...!");
    }
    public abstract void sound();
    public abstract void eat();
}

class Dog extends animal
{
    @Override
    public void sound()
    {
        System.out.println("Dog is Barking ");
    }
    public void eat()
    {
        System.out.println("Dog eat bhakari");
    }
}
class Lion extends animal
{
    @Override
    public void sound()
    {
        System.out.println("Lion is Roar ");
    }
    public void eat()
    {
        System.out.println("Lion eat humen");
    }
}
class oops
{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
        Lion l = new Lion();
        l.sound();
        l.eat();
    }
}*/





// ---------------------->  Interface  <------------------------- //

/*import java.util.Scanner;

interface client 
{
    void input();       // bydefault  public + abstract
    void output();                 // public + abstract
}
class oops implements client
{
    String name;
    double sal;

    public void input()
    {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter User name ! ");
        name = k.nextLine();

        System.out.println("Enter the Salary ! ");
        sal = k.nextDouble();
    }
    public void output()
    {
        System.out.print(name +"\n"+ sal);
    }
    public static void main(String[] args) {
        client I = new oops();
        I.input();
        I.output();
    }
}*/





//  ---->> Interface varible :- 

/*interface customerKunal
{
    int amt = 5;          // public + static + final
    void purchase();      // public + abstract
}
class Sellerborse implements customerKunal
{
    //@Override
    public void purchase()
    {
        System.out.println("Kunal needs "+amt+" kg rice");
    }
}
class oops
{
    public static void main(String[] args) {
        customerKunal k = new Sellerborse();
        k.purchase();
    }
}*/




//  -----> Interface method :- 

/*interface client
{
    void webDesign();
    void webDevlop();
}
abstract class kunalTech implements client
{
    public void webDesign()
    {
        System.out.println("RED , Top Menu , Three dot Button");
    }
}
class borseTech extends kunalTech
{
    public void webDevlop()
    {
        System.out.println("HTML , CSS , Javascript");
    }
}
class oops
{
    public static void main(String[] args) {
        borseTech k = new borseTech();
        k.webDesign();
        k.webDevlop();
    }
}*/





// ------> Multiple Inheritance [ Using Interface ]  <---------- //

/*interface A 
{
   void show();
}
interface B 
{
   void show();
}
class oops implements A,B
{
    public void show()
    {
        System.out.println("Interface A & B");
    }
    public static void main(String[] args) {
        oops k = new oops();
        k.show();
    }
}*/






// -----------> Extending Interface <--------- //

/*interface kunal
{
   void add();
}
interface borse extends kunal
{
   void sub();
}
class oops implements borse
{
    @Override
    public void add()
    {
        int a=10 , b=20 , c;
        c = a + b;
        System.out.println("Addition is "+c);
    }
    @Override
    public void sub()
    {
        int a=30 , b=20 , c;
        c = a - b;
        System.out.println("Substraction is "+c);
    }
    public static void main(String[] args) {
        oops k = new oops();
        k.add();
        k.sub();
    }
}*/





// --------------> Interface [ JDK 1.9 ]  <----------------- //

/*interface A 
{
    default void call()
    {
        add(300,200);
    }
    private void add(int x, int y)
    {
        System.out.println("Sum of Two Number = "+(x+y));
    }
}
class B implements A
{
    public void sub(int x, int y)
    {
        System.out.println("Substraction of Two Number = "+(x-y));
    }
}
class oops
{
    public static void main(String[] args) {
        B k = new B();
        k.call();
        k.sub(100,200);
    }
}*/





// -----------> Co-Varient return type <--------------- //
/* 
class A 
{
    A show()
    {
        System.out.println("Learn Java");
        return this;
    }
}
class B extends A 
{
    @Override
    B show()
    {
        super.show();
        System.out.println("Kunal Borse");
        return this;
    }
}
class oops
{
    public static void main(String[] args) {
        B k = new B();
        k.show();
    }
}
*/


import java.util.Scanner;

public class oops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the smallest prime number
        int result = findSmallestPrime(numbers);

        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("None");
        }
    }

    private static int findSmallestPrime(int[] numbers) {
        int q = findSmallestNumber(numbers);

        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            boolean isPrime = true;

            for (int num : numbers) {
                if (num != q && i % num != q) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                return i;
            }
        }

        return -1;
    }

    // Function to find the smallest number in the array
    private static int findSmallestNumber(int[] numbers) {
        int smallest = Integer.MAX_VALUE;

        for (int num : numbers) {
            smallest = Math.min(smallest, num);
        }

        return smallest;
    }
}








