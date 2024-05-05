// -------------->  Exception Handling  <------------------ //

/*class handling {
    public static void main(String[] args) {
        int a=10 , b=0 , c;
        System.out.println("main method started");
        try
        {
            c = a / b;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Cant divide by zero");
        }
        System.out.println("main method ended");
    }
}*/




// --------------> Exception Hierarchy <------------------- //




//---> NullPointerException :-


/*class handling
{
    public static void main(String[] args) {
        String str = null;

        try
        {
        System.out.println(str.toUpperCase());
        }
        catch(NullPointerException n)
        {
            System.out.println("Null Can't Casted");
        }
        System.out.println("main method ended");
    }
}*/






//---> Number Format Exception :-


/*class handling
{
    public static void main(String[] args) {
        String str = "kunal";

        try
        {
        int a = Integer.parseInt(str);
        System.out.println(a);
        }
        catch(NumberFormatException n)
        {
            System.out.println("string "+str+" Can't Converted into number");
        }
        System.out.println("main method ended");
    }
}*/





//---------> try-catch-finally Exception <------------- //

/*class handling
{
    public static void main(String[] args) {
        try 
        {
            System.out.println("Learn Java");
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("I'am a good programmer");
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Can't divide by zero");
        }
        finally
        {
            System.out.println("Great Job..!🥳");
        }
        System.out.println("main method ended");
    }
}*/






//-------> throw keyword <--------- //


/*class handling
{
    public static void main(String[] args) {

        // System.out.println(10/0);

        throw new InvalidageException("/ by zero");
    }
}*/



// --------> Throws keyword <-------- //

/*class handling
{
    public static void main(String[] args) throws Exception
    {
        for(int i=1 ; i<=10 ; i++)
        {
                System.out.println(i);
                Thread.sleep(1000);
        
        }
    }
}*/





// -----------> throw ahd throws <------------- //

class handling
{
    public static void div(int a , int b) throws Exception
    {
        if(b==0)
        {
            throw new Exception();
        }
        else
        {
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args)
    {
        handling h = new handling();
        try
        {
        h.div(20, 0);
        }
        catch(Exception e)
        {
            System.out.println("The value of b is zero");
        }
    }
}