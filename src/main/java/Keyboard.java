public class Keyboard extends Instrument implements IPlay, ISell {
    private int keys;

    public Keyboard(String material, String sound, int buyPrice, int sellPrice, int keys) {
        super(material, sound, buyPrice, sellPrice);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    public String play(){
        return this.getSound();
    }


    public int calulateMarkUp(){
        return super.getSellPrice() - super.getBuyPrice();
    }
}