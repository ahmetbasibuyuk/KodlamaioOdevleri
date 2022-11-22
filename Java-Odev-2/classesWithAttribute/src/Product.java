public class Product {


    // İKİ TANE Product CONSTRUCTOR'I KULLANILDI -> PARAMETRELİ VE PARAMETRESİZ CONSTRUCTOR.
    // İKİ TANE KULLANILMASI "OVERLOADİNG" DENİR.
    // parametresiz constructor
    public Product() {
        System.out.println("Parametresiz Constructor çalıştı");
    }

    // parametreli constructor
    public Product(int id, String name, String description, double price, int stockAmount) {
        System.out.println("Parametreli Constructor(yapıcı blok) çalıştı");

        this._id = id;
        this._name = name;
        this._description = description;
        this._price = price;
        this._stockAmount = stockAmount;
    }


    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;


    // değişkenlere private denilince:
    // okuma(veriye ulaşma) için -> get(yani getter)   KULLANILDI
    // işlem yapma(değer atama) için -> set(yani setter)    KULLANILDI
    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public void setName(String name) {
        _name = name;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String getName() {
        return _name;
    }

    public String getDescription() {
        return _description;
    }

    public double getPrice() {
        return _price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }
}
