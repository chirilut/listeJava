package TemaListe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator calc=new Calculator();

        //ex.1   Scrieti o metoda Java, care sa primeasca parametru o Lista,
        // si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.
        List<Integer> lista1= new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);
        calc.printList(lista1);

        //ex.2    Scrieti o metoda Java, care sa primeasca doi parametrii:
        // un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
        // Metoda sa adauge numarul primit ca si parametru la final de lista.
        calc.addValue(lista1,9);
        System.out.println(lista1);


        // ex. 3    Scrieti o metoda Java, care sa primeasca doi parametrii:
        // un parametru de tip Lista, iar celalalt un numar intreg.
        // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
        // fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.
        List<Integer>lista2 =new ArrayList<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(9);
        lista2.add(4);
        lista2.add(5);
        calc.showfrom(lista2, 1);

        // ex. 4 Scrieti o metoda Java, care sa primeasca parametru o Lista
        // si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput
        List<String> lista4 =new ArrayList<>();
        lista4.add("9.");
        lista4.add("8.");
        lista4.add("7.");
        lista4.add("6.");
        lista4.add("5.");
        calc.printListint(lista4);


        // ex.5   Scrieti o metoda Java, care sa primeasca trei parametrii:
        // unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.
        // Metoda sa adauge parametrul de tip String in lista primita,
        // iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.
        List<String> lista5=new ArrayList<>();
        lista5.add(".1");
        lista5.add(".2");
        lista5.add(".3");
        lista5.add(".4");
        calc.includestring(lista5,3, ".x");
        System.out.println(lista5);


        // ex. 6 Scrieti o metoda Java, care sa primeasca doi parametrii.
        // Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru
        // si sa il adauge pe prima pozitie din lista.
        calc.includeindex0(lista2,1);
        System.out.println(lista2);


        // ex. 7  Scrieti o metoda Java care sa primeasca parametru o Lista si sa afiseze
        // ce valori are lista, si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).
        calc.printindex(lista4);


        // ex. 8   Scrieti o metoda Java care sa primeasca o Lista
        // si sa returneze cel mai mare numar din ea.
        calc.biggestNr(lista2);


    }
}
