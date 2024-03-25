package ru.geekbrains.oop.lesson6.srp2;

import java.util.Scanner;

public class Services {

    private static String prompt(String massage){
        Scanner scanner = new Scanner(System.in);
        System.out.println(massage);
        return scanner.nextLine();
    }
    public static Client getClientFromConsole(Client client) {
        String clientName = prompt("Имя клиента: ");
        String clientSurName = prompt("Фамилия клиента: ");
        String clientPhoneNumber = prompt("Номер телефона клиента: ");

        if(client != null){
            client.setName(clientName);
            client.setSurName(clientSurName);
            client.setPhoneNumber(clientPhoneNumber);
        }else{
            client = new Client(clientName, clientSurName, clientPhoneNumber);
        }
        return client;
    }

    public static Product getProductFromConsole(Product product) {
        String productName = prompt("Наименование продукта: ");
        String productBrand = prompt("Бренд производителя: ");
        double productPrice = Double.parseDouble(prompt("Цена продукта: "));

        if(product != null){
            product.setName(productName);
            product.setBrand(productBrand);
            product.setPrice(productPrice);
        }else{
            product = new Product(productName, productBrand, productPrice);
        }
        return product;
    }

    public static int getQuantity() {
        return Integer.parseInt(prompt("Количество: "));
    }
}
