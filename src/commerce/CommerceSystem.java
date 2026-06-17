package commerce;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    private final List<Product> products;

    public CommerceSystem(List<Product> products) {
        this.products = List.copyOf(products);
    }

    public void start() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
                System.out.println(i+1 + ". " + product.getName()
                        + "\t| " + String.format("%,d원", product.getPrice()) + " | "  + product.getDescription());
            }
            System.out.println("0. 종료" + "\t| " + "프로그램 종료");

            int selectMenu = sc.nextInt();
            if (selectMenu == 0) break;

            System.out.println("선택한 상품: " + products.get(selectMenu-1).getName()
                    + " | " + String.format("%,d원", products.get(selectMenu-1).getPrice()) + " | "
                    + products.get(selectMenu-1).getDescription()
                    + " | " + "재고: " + products.get(selectMenu-1).getStock());

        }

        System.out.println("커머스 플랫폼을 종료합니다.");
        sc.close();
    }
}
