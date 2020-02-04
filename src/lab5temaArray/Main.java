package lab5temaArray;

public class Main {
    public static void main(String[] args) {
        calculator5 lab5 = new calculator5();

         // ex1

       double a = lab5.suma(2,3,6,8);
        System.out.println(a);

        double b= lab5.dif(5,2,1);
        System.out.println(b);

        long c= lab5.mul(2,2,3);
        System.out.println(c);

        double d= lab5.div(8.5,2,3);
        System.out.println(d);


        // ex2

        int[] newarray= lab5.Array100();
        for(int i =0; i<100;i++){
            System.out.println(newarray[i]);
        }


        // ex3

        int[]newarraypar=lab5.arraypar();
        for(int i=0;i<newarraypar.length;i++){
            if(i%2!=0)
            System.out.println(lab5.arraypar()[i]);
        }


        // ex4
        float average=lab5.arayAverage();
        System.out.println(average);


        // ex5
        String checString = lab5.String();


        // ex6
        int chec = lab5.checkNr();


        // ex7

        String [] arry= new String[10];
        String j="----------";
        for(int i=0; i<arry.length;i++){
            System.out.println(j);
        }


        // ex8

        int [] array ={1,2,3,4,5,6,7,8,9};
        int number = 2;
        for(int i=0; i<array.length;i++){
            if (array[i]==number) {
                continue;
            }else {
                System.out.println(array[i]);
            }
        }


        // ex9--------------!!!!!!! NU STIU CUM SA REZOLV
        int [] arrayy = {3,3,3,4,5,6,7,8,9};
        int small=20;
        System.out.println(small) ;
        int secondsmall=0 ;
        for( int i=0 ;  i<arrayy.length ; i++ ){
            if(array[i]<small){
                small=array[i];
                System.out.println(small);
                System.out.println(array[i]);
            }
        }


        // ex10
        int []ar1 ={1,2,3,4,5,6,7,8};
        int []ar2 ={0,0,0,0,0,0,0,0,0};
        for(int i=0;i< ar1.length;i++){
            ar2[i]=ar1[i];
            System.out.println(ar2[i]);
        }

    }
}

