package ıjk;

public class main {

    public static void main(String[] args) {
Product product=new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");

//product.set_name("Laptop");
//product.setId(1);
//product.set_price(5000);
//product.set_description("Asus Laptop");
//product.set_stockAmount(3);


PraductManager praductManager=new PraductManager();
praductManager.Add(product);


        System.out.println(product.get_kod());



    }




}
