package market;

import data.*;
import menu.*;

import java.util.Scanner;
import menu.Kiosk;
public class CoffeeShopTest {

    public static void main(String[] args) {
        // 필요한 객체들 생성
        Product product = new Product();
        Kiosk kiosk = new Kiosk(product);
        // Kiosktest 객체 생성
        KioskTest kioskTest = new KioskTest();
        // Kiosktest의 메서드를 호출하여 Kiosk 객체를 가져옴
        Kiosk kiosk1 = kioskTest.getKioskInstance();

        // CoffeeShop 객체 생성 시 Kiosk 객체를 전달
        CoffeeShop coffeeShop = new CoffeeShop(kiosk1);

        // 판매 기록 출력
        coffeeShop.printSalesRecord();
        kiosk1.checkStock();

    
    }
}