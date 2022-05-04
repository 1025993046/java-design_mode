package 实验四.观察者模式;

public class Stock extends Subject {

    private Double price;

    public Stock(Double price) {
        this.price = price;
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.response();
        }
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {

        double change = price - this.price;
        System.out.println("-->股票波动：" + change / this.price * 100 + "%");
        this.price = price;
        if (change / this.price > 0.05 || change / this.price < -0.05)
            notifyObserver();

    }

}
