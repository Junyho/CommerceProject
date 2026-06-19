package commerce;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private final List<Product> products = new ArrayList<>();
    private final String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void addProduct(Product product) {
        products.add(product);
    }


    public List<Product> getProducts() {
        return List.copyOf(products);
    }


    // 카테고리별 상품 추가 삭제 수정


}
