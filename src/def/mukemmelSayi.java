package def;

public class mukemmelSayi {

    public static void main(String[] args) {
        // 6 --> 1,2,3
        //28 -->1,2,4,7,14
        int number=6;
        int toplam=0;

                for (int i=1; i<number; i++){

                    if(number%i==0){  // number i ye bolundugunde klan sıfır ıse
                        toplam=toplam+i;
                    }
                }
if(toplam==number){

    System.out.println("mukemmel sayi");
}else {
    System.out.println("mukemmel sayi degildir");
}
    }

}
