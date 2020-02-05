package lab2.temaanimalrescue;

import org.w3c.dom.ls.LSOutput;

public class AppMain {
    public static void main(String[] args) {

        Dog catel1 =new Dog();
        catel1.name = "Azorel";
        catel1.age= 1.2;
        catel1.favoritefood="osul";
        catel1.healthlevel = 9;
        catel1.hungrylevel=3;
        catel1.moodlevel=9;

        catel1.bark();

        Dog dog=new Chihuahua();
        dog.bark();


        Horse cal=new Horse();
        cal.run();
        Chihuahua veve =new Squirrel();
        veve.bark();
        veve.run();



        Dog pisica = new Dog();
        pisica.name = "Miau";
        pisica.age = 3;
        pisica.favoritefood = "pestele";
        pisica.healthlevel = 10 ;
        pisica.hungrylevel = 1 ;
        pisica.moodlevel = 6;

        Adopter owner = new Adopter();
        owner.name = "Maria";
        owner.moneyavailable = 555.5;

        Doctor dr = new Doctor();
        dr.name = "drPopescu";
        dr.doctorspecialization = "small pets";

        if (catel1.hungrylevel < 6) {
            owner.feedthepet();
        } else {
            owner.train();
        }

        if(catel1.healthlevel<3){
            dr.surgery();
        }else{   dr.givemedicamentation();
            if (catel1.healthlevel<8){
                dr.checkhelth();
            }else{owner.washthepet();
            }
        }







    }
}
