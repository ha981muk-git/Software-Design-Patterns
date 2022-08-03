public class GrabStocks {
    public static void main(String[] args){
        StockGrabber stockGrabber   = new StockGrabber();
        StockObserver stockObserver1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(233.33);
        stockGrabber.setAAPLPrice(2324.232);
        stockGrabber.setGOOGPrice(123.00);

        StockObserver stockObserver2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(33.33);
        stockGrabber.setAAPLPrice(224.232);
        stockGrabber.setGOOGPrice(13.00);

        stockGrabber.unregister(stockObserver1);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 120);
        Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 1220);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 12240);

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();

    }
}
