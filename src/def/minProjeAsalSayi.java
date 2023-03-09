package def;

public class minProjeAsalSayi {

    public static void main(String[] args) {

        int number=25;
        int kalan=number%2;


        System.out.println("kalan = " + kalan);
        boolean asalMi=true;

        for (int i=2; i<number; i++) {

            if(number%i==0){
                asalMi=false;
            }
        }
        if(asalMi){
            System.out.println("sayi asaldir");

        }else{
            System.out.println("sayi asal degıldir");

        }





    }
}
