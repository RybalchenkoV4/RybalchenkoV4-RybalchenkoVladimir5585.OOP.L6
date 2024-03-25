package ru.geekbrains.oop.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {

    public static void saveToJson(Order order) {

        String fileName = "order.json";
        try(FileWriter fileWriter = new FileWriter(fileName, false)){
            Client client = order.getClient();
            Product product = order.getProduct();
            fileWriter.write("{\n");
            fileWriter.write("Имя клиента: " + client.getName() + ",\n");
            fileWriter.write("Фамилия клиента: " + client.getSurName() + ",\n");
            fileWriter.write("Номер телефона клиента: " + client.getPhoneNumber() + ",\n");
            fileWriter.write("Наименование продукта: " + product.getName() + ",\n");
            fileWriter.write("Бренд производителя: " + product.getBrand() + ",\n");
            fileWriter.write("Цена продукта: " + product.getPrice() + ",\n");
            fileWriter.write("Количество: " + order.getQuantity() + "\n");
            fileWriter.write("}\n");
            fileWriter.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
