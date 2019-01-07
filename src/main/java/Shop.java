import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<>();
    }


    public ArrayList<ISell> getStock() {
        return stock;
    }


    public int countStock(){
        return stock.size();
    }

    public void addStock(ISell item){
        stock.add(item);
    }


    public void sellStock(ISell item) {
        int soldItem = stock.indexOf(item);
        stock.remove(soldItem);
    }

    public int getProfit(){
        int count = 0;
        for (ISell item : stock){
            count += item.calulateMarkUp();
        }
        return count;
    }


}
