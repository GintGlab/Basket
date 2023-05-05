import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> basket = new ArrayList<>();
        boolean isAddInBasket = true;
        while(isAddInBasket) {
            System.out.println("Что добавить в корзину?");
            basket.add(scan.nextLine());
            System.out.println("Показать корзину?");
            if (scan.nextLine().equals("да")) {
                for (String el: basket) {
                    System.out.println(el);
                    isAddInBasket = false;
                    scan.close();
                }
            }
        }
    }
}
