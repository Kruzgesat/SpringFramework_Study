package basic;

public class OrderManager {

    private KiaMaker Maker;

    public OrderManager() {
        this.Maker = new KiaMaker();

    }

    public void order(int cost) {
        Money money = new Money(cost);
        Car car = Maker.sell(money);

        System.out.println("판매상(인수) : " + car.getName());



    }
}
