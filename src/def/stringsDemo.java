package def;

public class stringsDemo {
    public static void main(String[] args) {

        String mesaj="Bugun hava cok guzel.";

        System.out.println("mesaj = " + mesaj);
        System.out.println("eleman sayisi:"+mesaj.length());
        System.out.println("5.eleman:"+mesaj.charAt(4)); //index 0-1-2-3-4

        System.out.println(mesaj.concat(" yasasin!"));
        System.out.println(mesaj.startsWith("B"));    //true
        System.out.println(mesaj.endsWith("."));   //true
        char[] karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println("karakterler = " + karakterler);
        System.out.println(mesaj.indexOf('a'));    // a nın ındexi veriyo 0-1-2-3-4-5-6-7 ilk buldugunu verır
        System.out.println(mesaj.lastIndexOf('e'));

        System.out.println("----------------");

        System.out.println(mesaj.replace(' ','-'));
        System.out.println(mesaj.substring(2));  //ıkıden ıtıbaren yazdır 2. ındex
        System.out.println(mesaj.substring(2,5));  //5 i dahıl etmiyor

        for(String kelime:mesaj.split(" ")) {
            System.out.println("kelime = " + kelime);

        }
            System.out.println(mesaj.toLowerCase());
            System.out.println(mesaj.toUpperCase());

        }

    }

