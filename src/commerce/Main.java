package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Category electronics = new Category("전자제품");
        electronics.addProduct(new Product("Galaxy S25",1200000,"최신 안드로이드 스마트폰", 10));
        electronics.addProduct(new Product("iPhone 15",1350000,"Apple의 최신 스마트폰", 10));
        electronics.addProduct(new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 5));
        electronics.addProduct(new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 20));

        Category clothing = new Category("의류");
        clothing.addProduct(new Product("커버낫 후드티", 69000, "캐주얼하게 입기 좋은 커버낫 로고 후드티", 15));
        clothing.addProduct(new Product("디스이즈네버댓 T-Logo Hoodie", 87200, "스트릿 무드가 느껴지는 로고 후드티", 10));
        clothing.addProduct(new Product("마하그리드 스웨트셔츠", 51800, "데일리로 입기 좋은 그래픽 맨투맨", 12));
        clothing.addProduct(new Product("예일 투톤아치 후드", 67800, "아치 로고가 포인트인 캐주얼 후드티", 8));

        Category food = new Category("식품");
        food.addProduct(new Product("김밥", 3500, "가볍게 먹기 좋은 기본 김밥", 40));
        food.addProduct(new Product("라면", 4500, "분식집 대표 메뉴인 따뜻한 라면", 30));
        food.addProduct(new Product("떡볶이", 6000, "매콤달콤한 분식 대표 메뉴", 25));
        food.addProduct(new Product("돈까스", 9000, "바삭하게 튀긴 돈까스와 밥이 함께 나오는 메뉴", 20));

        List<Category> categories = new ArrayList<>();
        categories.add(electronics);
        categories.add(clothing);
        categories.add(food);

        CommerceSystem cs = new CommerceSystem(categories);
        cs.start();

    }
}



