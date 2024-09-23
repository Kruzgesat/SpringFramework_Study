package basic;

import org.springframework.http.converter.json.GsonBuilderUtils;

public class HyundaiMaker {

    public Car sell(Money money) {

        System.out.println("현대자동차(입금) : " + money.getAmount());

        Car car = new Car("iONIQ 5");

        return car;

    }

}
