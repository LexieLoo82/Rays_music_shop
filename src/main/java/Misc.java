public class Misc implements ISell {
    private String description;
    private int buyPrice;
    private int sellPrice;

    public Misc(String description, int buyPrice, int sellPrice){
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public int calulateMarkUp(){
        return sellPrice - buyPrice;
    }


}
