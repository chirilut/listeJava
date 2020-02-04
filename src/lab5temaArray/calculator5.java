package lab5temaArray;

public class calculator5 {



    // ex1

    public static int  suma( int first, int second) {
        int suma = first+second;
        return suma;
    }

    public static double suma(double first, double second) {
        double suma = first+second;
        System.out.println(suma);
        return suma;
    }

    public static float  suma( float first, float second, float third) {
        float suma = first+second+third;
        return suma;
    }

    public static int suma(int first, int second, int third, int fourth) {
        int suma = first+second+third+fourth;
        return suma;
    }

    public static int dif ( int first, int second,int third) {
        int dif = first-second-third;
        return dif;
    }

    public static double dif ( double first, double second) {
        double dif = first-second;
        return dif;
    }

    public static int mul ( int first, int second,int third) {
        int mul = first*second*third;
        return mul;
    }

    public static double mul ( double first, double second) {
        double mul = first*second;
        return mul;
    }

    public static double div ( double first, double second) {
        double div = first/second;
        return div;
    }

    public static double div ( double first, int second,int third) {
        double div = first/second;
        return div;
    }

        // ex2

    public int[] Array100() {
      int[]array100 = new int[100];
        for(int i=1; i<=100;i++){
        array100[i-1]=i;
      }
        return array100;
    }


    // ex3

    public int[]arraypar(){
        int [] array= new int [10];
        for(int i=1; i<=array.length;i++){
            array[i-1]=i;
        }
        return array;
    }


    // ex4

    public float arayAverage(){
        int[]ar ={9,8,7,6,5,4};
        float sum=0;
        float average;
        for(int i=0;i<ar.length; i++){
            sum=sum+ar[i];
        }
        average=sum/ar.length;
        return average;
    }


    // ex5
    public String String (){

      String str1= "Test";
       String[]str2= {"Fast", "TrackIt", "Test"};
        for(int i=0; i< str2.length; i++){
          if (str1.equals(str2[i])){
            System.out.println("TRUE");
          }
        }
        return str1;
    }




    // ex6

    public int checkNr(){
        int x= 5;
        int []ari= {1,2,3,4,5,6,7};
        for(int i=0;i<ari.length; i++){
            if(x==ari[i]){
                System.out.println(i);
            }
        }
        return x;
    }


    // ex 8








}












