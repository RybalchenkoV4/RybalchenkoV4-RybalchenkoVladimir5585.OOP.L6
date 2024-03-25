package ru.geekbrains.oop.lesson6.srp2;

public class Order {

    private final int id;
    private Client client;
    private Product product;
    private int qnt;

    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return qnt;
    }

    public void setQuantity(int qnt) {
        this.qnt = qnt;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }

    private static int count;

    static {
        count = 0;
    }
    public Order(Client client, Product product, int qnt) {
        this.client = client;
        this.product = product;
        this.qnt = qnt;
        this.id = count++;
    }

    public Order(){
        id = count++;
        inputFromConsole();
    }

    public void inputFromConsole(){
        client = Services.getClientFromConsole(client);
        product = Services.getProductFromConsole(product);
        qnt = Services.getQuantity();
    }

}
