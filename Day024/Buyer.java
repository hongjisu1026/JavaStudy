import java.util.Vector;

public class Buyer {
    int money = 1000;    // 소유금액
    int bonusPoint = 0;    // 보너스점수
    // Product[] item = new Product[10]; // 구입한 제품을 저장하기 위한 배열
    Vector<Product> vector = new Vector<Product>(10);

    public void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
            return;
        }

        money -= p.price;            // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
        vector.add(p);               // 제품을 Product[] item에 저장한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    public void refund(Product p) {
        money += p.price;
        bonusPoint -= p.bonusPoint;
        System.out.println(p + "을/를 반품하였습니다.");
        vector.remove(p);
    }

    public void summary() {            // 구매한 물품에 대한 정보를 요약해서 보여 준다.
        int sum = 0;            // 구입한 물품의 가격합계
        String itemList = "";    // 구입한 물품목록

        for(Product p : vector) {
            sum += p.price;
            itemList += p + " ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
