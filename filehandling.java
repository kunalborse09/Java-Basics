//-----------------------> File handling <------------------------ //

/*import java.io.*;
class filehandling 
{
    public static void main(String[] args) throws Exception
    {
        File f = new File("C:\\Users\\Kunal Borse\\Desktop\\kb.txt");
        
            if(f.createNewFile())
            {
                System.out.println("File Successfully created..!");   
            }
            else
            {
                System.out.println("File already exist..!");
            }
    }
}*/





//----------------> File Information <---------------------//

/*import java.io.*;
class filehandling 
{
    public static void main(String[] args) throws Exception
    {
        File f = new File("C:\\Users\\Kunal Borse\\Desktop\\kb.txt");
        
            if(f.exists())
            {
                System.out.println("File Name : "+f.getName());   
                System.out.println("File Location : "+f.getAbsolutePath());
                System.out.println("File writable : "+f.canWrite());   
                System.out.println("File readable : "+f.canRead());   
                System.out.println("File size : "+f.length());  
               // System.out.println("File remove  : "+f.delete());       
            }
            else
            {
                System.out.println("File dose not exist..!");
            }
    }
}*/





//----------------------> Write on file <----------------------- //


/*import java.io.*;
class filehandling 
{
    public static void main(String[] args) // throws Exception
    {
            try
            {
                FileWriter f = new FileWriter("C:\\Users\\Kunal Borse\\Desktop\\kb.txt");
                try
                {
                    f.write("Java progamming is the best language..!");
                }
                finally
                {
                    f.close();
                }
                System.out.println("Successfully data write in file ..!");   
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
    }
}*/





//----------------------> Read Data from a file <----------------------- //


/*import java.io.*;
class filehandling 
{
    public static void main(String[] args) // throws Exception
    {
            try
            {
                FileReader f = new FileReader("C:\\Users\\Kunal Borse\\Desktop\\kb.txt");
                try
                {
                    int i;
                    while((i=f.read())!=-1)
                    {
                        System.out.print((char)i);
                    }
                }
                finally
                {
                    f.close();
                } 
            }
            catch(Exception e)
            {
                System.out.println("Exception handeled");
            }
    }
}*/








// ------------------>  Rename a File  <---------------------- //

/*import java.io.*;
class filehandling 
{
    public static void main(String[] args) //throws Exception
    {
        File f = new File("C:\\Users\\Kunal Borse\\Desktop\\kun@l.txt");
        File r = new File("C:\\Users\\Kunal Borse\\Desktop\\Borse.txt");

            if(f.exists())
            {
                System.out.println(f.renameTo(r));   
            }
            else
            {
                System.out.println("File dosen't exist..!");
            }
    }
}*/







//------------------------>  copy one file data to another <---------------------- //

/*import java.io.*;
class filehandling 
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream x = new FileInputStream("C:\\Users\\Kunal Borse\\Desktop\\patil.txt");
        FileOutputStream y = new FileOutputStream("C:\\Users\\Kunal Borse\\Desktop\\kpp.txt");
  
        int i;
        while((i=x.read())!=-1)
        {
            y.write((char)i);
        }
        System.out.println("data Copied successfilly..!");
    }
}*/






