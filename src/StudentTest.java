public class StudentTest {


    static Student s3;  // default value of null;

    static int count=27;

    static int getcount()
    {
        System.out.println(count);
        return count;
    }

    // absence of static methods its a instance methods they are just utility methods,dependenth on input parameters
    // can access static variables, non object specific things
    // can access other static methods
    // class level methods
    // . operator with class name direct accrss
    // example ins main methods
    // instance methods, we woulds need object of the base class
    public static void main(String args[])
    {

        Student s=new Student();
        System.out.println(s.name);
        s.id=1;
        s.name="mike";
        s.gender="m";
        System.out.println(s.name);
       s.updateProfile("John");

        System.out.println(s.name);

        Student s1=null;  // initializes the object to null nullpointer exception
      //  s1.updateProfile("NULL");
        //System.out.println(s1.name);

       // s3.updateProfile("crimson"); //-> null pointer exception

        System.out.println(count);
        int x=getcount();


        Student[] students=new Student[3];
        System.out.println("Student1+ "+students[0]);
    }

}
