import java.text.DecimalFormat;
import java.util.Objects;

public class GetTheStock implements Runnable{

    private int startTime;
    private String stock;
    private double price;


    private  Subject stockGrabber;


    public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice){
        this.stockGrabber = stockGrabber;
        startTime = newStartTime;
        stock = newStock;
        price = newPrice;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 20; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            double randNum = (Math.random() * (.60)) -.03;
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format((price+ randNum)));

            if(Objects.equals(stock, "IBM"))((StockGrabber)stockGrabber).setIBMPrice(price); // we can also use if like this.
            if(Objects.equals(stock, "AAPL"))((StockGrabber)stockGrabber).setAAPLPrice(price);
            if(Objects.equals(stock, "GOOG"))((StockGrabber)stockGrabber).setGOOGPrice(price);

            System.out.println(stock + ":"+ df.format((price + randNum)) +
                    " " + df.format(randNum));
            System.out.println();
            //throw new RuntimeException(e);
        }
    }
}
