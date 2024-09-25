package inhatc.cse.seokminshop.item.controller;


import inhatc.cse.seokminshop.item.dto.ItemDataDto;
import inhatc.cse.seokminshop.item.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemController {

    @GetMapping("/item/thymeleaf1")
    public String thymeleaf1(Model model) {
        ItemDto itemDto = ItemDto.builder()
                .id(1L)
                .itemNm("상품명")
                .itemDetail("상품 상세 설명")
                .price(10000)
                .stockNumber(100)
                .build();
        
        model.addAttribute("item", itemDto);

        return "/item/thymeleaf1";
    }

    @GetMapping("item/thymeleaf2")
    public String thymeleaf2(ItemDataDto ItemDataDto,
                             Model model)  {
        System.out.println("======" + ItemDataDto);

        model.addAttribute("item", ItemDataDto);

        return "/item/thymeleaf2";
    }
}
