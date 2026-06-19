package commerce;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    private final List<Category> categories;

    public CommerceSystem(List<Category> categories) {
        this.categories = categories;
    }

    public void start() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            for (int i = 0; i < categories.size(); i++) {
                Category category = categories.get(i);
                System.out.println( i+1 + ". " + category.getCategoryName());
            }
            System.out.println("0. 종료" + "\t| " + "프로그램 종료");
            int selectedMenu = sc.nextInt();
            if (selectedMenu == 0) break;

            // 예외처리 필요함 (카테고리 범위 벗어나는 수 입력?)
            Category selectedCategory = categories.get(selectedMenu - 1);
            List<Product> products = selectedCategory.getProducts();
            System.out.println("[ " + selectedCategory.getCategoryName() + " 카테고리 ]");
            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
                System.out.println(i+1 + ". " + product.getName()
                        + "\t| " + String.format("%,d원", product.getPrice()) + " | "  + product.getDescription());
            }
            System.out.println("0. 뒤로가기");

            selectedMenu = sc.nextInt();
            if (selectedMenu == 0) continue;

            System.out.println("선택한 상품: " + products.get(selectedMenu-1).getName()
                    + " | " + String.format("%,d원", products.get(selectedMenu-1).getPrice()) + " | "
                    + products.get(selectedMenu-1).getDescription()
                    + " | " + "재고: " + products.get(selectedMenu-1).getStock());

        }

        System.out.println("커머스 플랫폼을 종료합니다.");
        sc.close();
    }
}
