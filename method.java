              //  ------->  Methods in Java  <-------- //


/*public class method {
    public static void main(String[] args) {
        method k = new method();
        k.disp();
        method.Add();
    }
    void disp()
    {
        System.out.println("Kunal Borse");
    }
    public static void Add()
    {
        int a=10 , b=20 ;
        System.out.println("Sum "+(a+b));
    }
}*/






// ---->  Static or Non Static Method  <----- //

/*class method
{
    int a=10;
    static int b=20;
    public static void main(String[] args) {
        method.Show();
        method k = new method();
        k.Disp();     
    }
    static void Show()
    {
        System.out.println("Show() "+b);
    }
    // --> static method is access only static variable b 
    // --> When we used Static keyword no need to creat class object
    void Disp()
    {
        System.out.println("Disp() "+a+" "+b);
    }
    // --> Non Static method is Access both variables (a and b)
}*/







// -----> use of Method <----- //

/*import java.util.Scanner;
class method
{
    int n1,n2,add,sub,mul,div,rem;
    public static void main(String[] args) {
        method k = new method();
        k.input();
        k.process();
        k.output();
    }
    void input()
    {
        System.out.println("Enter The Number : ");
        Scanner k = new Scanner(System.in);
        n1 = k.nextInt();
        n2 = k.nextInt();
    }
    void process()
    {
        add = n1 + n2;
        sub = n1 - n2;
        mul = n1 * n2;
        div = n1 / n2;
        rem = n1 % n2;
    }
    void output()
    {
        System.out.println("Addition of Two Numbers : "+add);
        System.out.println("Substraction of Two Numbers : "+sub);
        System.out.println("Multiplication of Two Numbers : "+mul);
        System.out.println("Division of Two Numbers : "+div);
        System.out.println("remainder of Two Numbers : "+rem);
    }
}*/





// -------------> Var-args method <---------------- //

class A 
{
    void add(int...a)    // ver-arg method
    {
        int sum=0;
        for(int x : a)
        {
            sum=sum+x;
        }
        System.out.println("Sum of Numbers "+sum);
    }
}
class method
{
    public static void main(String[] args) {
        A k = new A();
        k.add();
        k.add(10);
        k.add(10,20);
        k.add(10,20,30);
        k.add(10,20,30,40);
    }
}