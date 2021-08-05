package hello.itemservice.domain.item;

import lombok.Getter;
import lombok.Setter;

//item 객체 생성
@Getter @Setter
public class Item {
    private Long id; //아이템 id
    private String itemName; //아이템 이름
    private Integer price; //아이템 가격인데 null 값도 들어갈 수 있도록 integer로 생성
    private Integer quantity; //아이템 수량인데 price와 같은 이유로 ingteger

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
