package TemaListe;

import java.util.Collections;
import java.util.List;

public class Calculator {


    // ex.1
    public void printList (List<Integer> myList){
        for(int i=0;i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }

    // ex.2
    public void addValue(List<Integer> list, int number){
        list.add(number);
    }


    // ex.3
    public void showfrom(List<Integer> list, int number){
        for(int i=0; i< list.size();i++){
            if(i>number){
                System.out.println(list.get(i));
            }
        }
    }


    // ex. 4
    public void printListint (List<String>myList){
        for(int i=0; i< myList.size();i++){
            System.out.println(myList.get(i));
        }
    }


    // ex.5
    public void includestring(List<String> list, int index , String text){
        list.add(index,text);
    }


    // ex.6
    public void includeindex0( List<Integer> list, int number){
            list.add(0,number);
    }


    // ex. 7......mai incerc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    public void printindex(List<String> list){
        for(int i=0; i<list.size();i++){
        }
    }


    // ex. 8
    public void biggestNr(List<Integer>list){
        System.out.println(Collections.max(list));
    }

}
