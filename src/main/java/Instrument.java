public abstract class Instrument {

    private String material;
    private String sound;
    private int buyPrice;
    private int sellPrice;

    public Instrument(String material, String sound, int buyPrice, int sellPrice){
        this.material = material;
        this.sound = sound;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
}
