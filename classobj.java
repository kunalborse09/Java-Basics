         // --------> Class and Objects <-------- //


/*class Demo
{
    int a = 10;
    String b ="Kunal";

    void show()
    {
        System.out.println(a+" "+b);
    }
}
class classobj
{
    public static void main(String[] args) {
        Demo k = new Demo();
        k.show();
    }
}*/







// --------->  Constructor  <-----------  //

/*class Demo
{
    int a ; String name;
    Demo()
    {
        a=0 ; name=null;
    }

    void show()
    {
        System.out.println(a+" "+name);
    }
}
class classobj
{
    public static void main(String[] args) {
        Demo k = new Demo();
        k.show();
    }
}*/








// --------->  Default Constructor  <-----------  //

/*class Demo
{
    int a ; String name; boolean b;
    Demo() //default 
    {
        a=1000 ; name="kunal"; b = true;
    }

    void show()
    {
        System.out.println(a+" "+name+" "+b);
    }
}
class classobj
{
    public static void main(String[] args) {
        Demo k = new Demo();
        k.show();
    }
}*/








// --------->  Parameterized Constructor  <-----------  //

/*class A
{
    int x , y;
    A(int a , int b)   // parameterized   
    {
        x = a ; y = b;
    }
    A(int a , String b)
    {
        System.out.println(a+" "+b);
    }
    void show()
    {
        System.out.println(x+" "+y);
    }
}
class classobj
{
    public static void main(String[] args) {
        A k = new A(100,200);
        k.show();
        A r = new A(500,"kunal");
    }
}*/








// --------->  Copy Constructor  <-----------  //

/*class A 
{
    int a;String b;
    A()
    {
         a=10 ; b="kunal";
         System.out.println(a+" "+b);
    }
    A(A ref)
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
}
class classobj
{
    public static void main(String[] args) {
        A r = new A();
        A r2 = new A(r);
    }
}*/


//  ---> copy parameterized constructor :-

/*class A 
{
    int x ; String y;
    A(int a , String b)   // parameterized   
    {
        x = a ; y = b;
        System.out.println(x+" "+y);
    }
    A(A ref)
    {
        x=ref.x;
        y=ref.y;
        System.out.println(x+" "+y);
    }
}
class classobj
{
    public static void main(String[] args) {
        A r = new A(100,"kunal");
        A r2 = new A(r);
    }
}*/







// --------->  Private Constructor  <-----------  //

//  Private constructor can't Access in Other Class 

/*class classobj
{
    int a ; double b ; String c;
    private classobj()
    {
        a = 10 ; b = 15.30 ; c = "Kunal";
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[] args) {
        classobj k = new classobj();

    }
}*/








// --------->   Constructor Overloading   <-----------  //

/*class A 
{
    int a ; double b ; String c;
    A()
    {
        a = 100  ; b = 30.15 ; c = "kunal";
    }
    A(int x)
    {
        a=x;
    }
    A(double y , String z)
    {
        b=y;
        c=z;
    }
}
class classobj
{
    public static void main(String[] args) {
        A k = new A();
        A k2 = new A(10);
        A k3 = new A(15.40,"anuj");
        System.out.println(k.a+" "+k.b+" "+k.c);
        System.out.println(k2.a);
        System.out.println(k3.b+" "+k3.c);
    }
}*/







// ---------->  Instance Block   <------------- //

/*class A 
{
    int a , b ;
    static void show()
    {
        System.out.println("Learn java ");
    }
    A()
    {
        a=30 ; b=50;
        System.out.println(a+" "+b);
    }
    {
        a=10 ; b=80;
        System.out.println(a+" "+b);
    }
}
class classobj
{
    public static void main(String[] args) {
        A.show();
        A k = new A();
        
    }
}*/






// ------------>  Static Block   <------------  //


/*class classobj
{
    public static void main(String[] args) {
        classobj k = new classobj();

    }
    classobj()
    {
        System.out.println("I am coder");        // constructor
    }
    {
        System.out.println("Borse Kunal ");      // instance block
    }
    static
    {
        System.out.println("Learn Java ");       // static block
    }
}*/
