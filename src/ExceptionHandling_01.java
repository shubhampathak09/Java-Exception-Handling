import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling_01 {

    // runtime stack mechanism
    // default exception handling
    // exception hierarchy
    //customised exception handling
    //control flow in try catch
    //methods to print exception information
    //try with multiple catch blocks: in which order they should have precedence
    // finally block
    // what is difference between final,finally and finalize  keyworrd, block,method
    // try catch finally combinations (25 comb0
    // control flow in try catch finally -nested
    //control flow in nested try catch finally
    // throw keyword
    // throws keyword
    // excecption handling keywords summary
    //compile time errors at exception handling various combinations
    //customised or use defined exceptions
    //Top 10 Exceptions
    //1.8 versions enhancements



    /*Exception*  what are Exceptions?/
    An unwanted or unexpected event that disturbs the normal flow of program
    ex-1 network error, ex-2  FileNotFoundException
    //Graceful termination of program->Exception handling
    1. open db connection
    2. read data from database  ->sql exception ->program will be terminated abnormally, database application might get down
    3. close db connection

     */




    public static void main(String args[])
    {
     System.out.println("Some commonely occured exceptions, that is going to be covered....");

     try
     {
         // Read data from London File
         FileReader fr=new FileReader("C:\\Users\\bnpat\\OneDrive\\Documents\\smaple.txt");

     }
     catch(FileNotFoundException e)
     {

     }

    }

}
