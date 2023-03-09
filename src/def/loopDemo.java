package def;

public class loopDemo {


    public static void main(String[] args) {

// FOR

        for(int i=1;i<=10;i++) {   //i+=2  tek sayılar 1-3-5-7

            System.out.println("i = " + i);

        }

        System.out.println(" For Dongusu Bitti");



        //While

        int i=1;
        while (i<10){
            System.out.println("i = " + i);
            i++;

        }
        System.out.println("while dongusu bitti");

        //Do While
int j=10;
do{
    System.out.println(j);
    j+=2;
    System.out.println(j);

}while (j<10);

        System.out.println("Do-While Dongusu Bitt");

    }
}
