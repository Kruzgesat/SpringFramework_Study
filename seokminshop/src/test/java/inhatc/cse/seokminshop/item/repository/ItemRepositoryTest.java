package inhatc.cse.seokminshop.item.repository;

import inhatc.cse.seokminshop.item.entity.Item;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void test() {
        System.out.println("testsetssetetst");
    }

    @Test
    @DisplayName("상품 등록 테스트")
    public void insertItemTest() {
        Item item = Item.builder()
                .itemNm("신상품2")
                .itemDetail("신상품 상세 설명2")
                .price(20000)
                .stockNumber(120)
                .build();

        Item savedItem = itemRepository.save(item);

        System.out.println(savedItem);
        //assertEquals(savedItem.getId(), 4);
    }

    @Test
    public void findByItemNmTest() {
        List<Item> itemList = itemRepository.findByItemNm("신상품2");
//        for(Item item : itemList) {
//            System.out.println(item);
//        }

        itemList.forEach(item -> System.out.println(item));
        itemList.forEach(System.out::println);
    }



}