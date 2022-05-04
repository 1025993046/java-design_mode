package 实验四.观察者模式;

public class Stocker implements Observer {

    private String name;
    private Stock stock;

    public Stocker(String name, Stock stock) {
        this.name = name;
        this.stock = stock;
    }

    @Override
    public void response() {
        System.out.println(name + "购买的股票发生了变化，新价格为：" + stock.getPrice());
    }
}
