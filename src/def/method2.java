package def;

public class method2 {

    public static void main(String[] args) {
        String mesaj="Bugun hava cok guzel.";
        String yeniMesaj=mesaj.substring(0,2);
        System.out.println(yeniMesaj);
String yeniMesaj2=sehir();
int sayi=topla(5,7);

        System.out.println(sayi);
        System.out.println(yeniMesaj2);
    }

    public static void ekle() {
        System.out.println("Eklendi");

    }

    public static void sil() {
        System.out.println("Silindi");

    }


    public static void guncelle() {
        System.out.println("Güncellendi");

    }
public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
}
    public static String sehir(){
        return "istanbul";
    }

}