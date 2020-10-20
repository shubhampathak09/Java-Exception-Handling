public class ArraysDemo {

    static void arrays()
    {
    System.out.println("Inside Arrays");
    int[] scores=new int[4];
    scores[0]=90;

       // scores[0]=90;
        scores[1]=90;
        scores[2]=90;
        scores[3]=90;

  int[] scores1=new int[] {30,45,43,100};


   //     int[] scores1={30,45,43,100};
    System.out.println("Midterm1: "+ scores[0]);
    System.out.println("Midterm1: "+ scores[1]);
    System.out.println("Midterm1: "+ scores[2]);
    System.out.println("Midterm1: "+ scores[3]);

    System.out.println("fsvfv");

    System.out.println("Midterm1: "+ scores1[0]);
    System.out.println("Midterm1: "+ scores1[1]);
    System.out.println("Midterm1: "+ scores1[2]);
    System.out.println("Midterm1: "+ scores1[3]);


    }


    public static void main(String args[])
    {
     arrays();  // default the values will be zero, based on type of arrays
    }
}
