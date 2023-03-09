package ıjk;

public class Product {


    public Product(int id, String name, String description, double price, int _stockAmount,String _renk){


        System.out.println("Yapici Blok Calisti");
        this._id= id;
        this._description= description;
        this._price= price;
        this._stockAmount= _stockAmount;
        this._renk= _renk;
        this._name=name;





    }
    public Product(){

    }


    //attribute/ field
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private int _id;
    private String _renk;
    private String _kod;


    //getter
    public int getId() {
        return _id;


    }

    //setter
    public void setId(int id) {    //kurması ıcın  voıd kullandık set edılen deger parametre olarak verılmelı
        this._id = id;   // this içerisinde bulundugun class

    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String _renk) {
        this._renk = _renk;
    }

    public String get_kod() {
        return this._name.substring(0, 1) + _id;
    }


}
