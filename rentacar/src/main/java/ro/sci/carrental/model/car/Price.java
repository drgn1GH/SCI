package ro.sci.carrental.model.car;

public class Price {
    private double hirePrice = 0;
    private String coin;

    public Price(double hirePrice, String coin) {
        if (hirePrice > 0){
            this.hirePrice = hirePrice;
        }
        this.coin = coin;
    }

    public double getHirePrice() {
        return hirePrice;
    }

    public String getCoin() {
        return coin;
    }


    @Override
    public String toString() {
        return "Price{" +
                "hirePrice=" + hirePrice +
                ", coin='" + coin + '\'' +
                '}';
    }
}
