package xml;

public class HyundaiMaker implements CarMaker {
    @Override

    public Car sell(Money money) {

        System.out.println("현대자동차(입금) : " + money.getAmount());

        Car car = new Car("iONIQ 5");

        return car;

    }

}
