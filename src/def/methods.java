package def;

public class methods {

    public static void main(String[] args) {
sayiBulmaca();

    }

public static void sayiBulmaca(){


    int[]sayilar=new int[ ]{1,2,5,9,0};
    int aranacak=3;
    boolean varMi=false;

    for(int sayi:sayilar){
        if(sayi==aranacak) {
            varMi = true;
            break;
        }}

    if(varMi){
        mesajVer(aranacak);
    }else {
        System.out.println("sayi mevcut degildir");
    }
}
public static  void mesajVer(int aranacak){
    System.out.println("sayi mevcuttur."+aranacak);

}
}

