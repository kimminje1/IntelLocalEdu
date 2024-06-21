package market;

import java.util.ArrayList;

import data.*;
import menu.Kiosk;

public class CoffeeShop {
    private Kiosk kiosk;

    public CoffeeShop(Kiosk kiosk) {
        this.kiosk = kiosk;
    }

    public void printSalesRecord() {
        System.out.println("판매 기록:");
        ArrayList<Product> userList = kiosk.getUserList();
        if (userList.isEmpty()) {
            System.out.println("판매된 음료가 없습니다.");
        } else {
            for (Product product : userList) {
                System.out.println(product.getName() + " - " + product.getPrice() + "원");
            }
        }
    }
}