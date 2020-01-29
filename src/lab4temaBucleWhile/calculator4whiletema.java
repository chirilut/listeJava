package lab4temaBucleWhile;

class calculator4whiletema {

                //ex 1

    public void counttohundert(int number){
        int i=number;
        do{
            System.out.println(i);
            i++;
        } while (i<=100);
    }

                //ex 2

    public void  countnegativ(int number){
            int i=number;
            do{
                System.out.println(i);
                i--;
            } while (i>=(-100));
    }


                //ex 3

    public void  countbetween(int first, int second){
        int i=first;
        do {
            System.out.println(i);
            i++;
        }while (i<=second);
    }

                //ex 4

    public void compare2nr(int a, int b){
        int i=a;
        int j=b;
        if(a<b){
            do{
                System.out.println(i);
                i++;
            }while (i<=b);
        }else{
            do{
                System.out.println(j);
                j++;
            } while (j<=a);
        }
    }

              //ex 5-----nu imi dau seama care ii formula

    public void nrpare(int first){
        int i=first;
        if(i%2==0){
        do {
            System.out.println(i);
            i++;
        }while (i<=100);
        }
    }

          //ex 6-----nu imi dau seama care ii formula

          //ex7

    public void suma (int primar){
            int sum=0;
            int counter =0;
            float average;
            if(primar>=111 && primar<=8899){
            do{
                sum=sum+primar;
                System.out.println( "suma: "+ sum);
                primar++;
                counter++;
                average=sum/counter;
                System.out.println( "media: "+ average);
            }while (primar<8899);

              }else{
                System.out.println("incercati cu numere din intervalul:111-8899");
            }
    }


           // ex 8

    public void sirdivizibilcu7 (int primar, int secundar) {
             double average;
             int counter;
            for(int i=primar;i<=secundar;i++)
           do{
               average=0;
             System.out.println( average );

           }while (i%7==0);
    }

}
