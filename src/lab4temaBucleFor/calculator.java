package lab4temaBucleFor;

class calculator4tema {

                //ex 1

    public void counttohundert(int number){

        for( int i=number ; i<=100; i++){
            System.out.println(i);
    }
}


                //ex 2

    public void  countnegativ(int number){

        for(int i=number; i>=(-100);i--){
            System.out.print(i+",");
    }
 }


                //ex 3

    public void  countbetween(int first, int second){

        for(int i=first; i<=second;i++){
            System.out.println(i);
        }
    }


                //ex 4

    public void compare2nr(int a, int b){

        if(a<b){
            for(int i=a;i<=b;i++){
                System.out.println(i);
            }
        }else{
            for(int j= b; j<=a; j++){
                System.out.println(j);
            }
        }
    }

               //ex 5

      public void nrpare(int number){
        for(int i=number; i<=100;i++){
            if(i%2!=0){
                continue;
            }
            System.out.print(i+ " , ");
        }
      }

               //ex 6

    public void nrimpare(int number)  {

        for(int i=number; i<=100;i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i+" , ");
        }
    }

                // ex 7

    public void sum(int number) {
        int sum=0;
        for(int i=number; i<=100; i++) {
            sum= sum+i;
            System.out.println(sum);
        }
    }


                   // ex 8

    public void average (int number) {
        int sum=0;
        int counter=0;
        float average;
        for(int i=number; i<=100; i++) {
            sum = sum+i;
            counter++;
        }
        average= sum/counter;
        System.out.println(average);
    }


                // ex 9

    public void string (){

    }





}