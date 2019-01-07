public class Guitar extends Instrument implements IPlay, ISell {
    private int strings;

    public Guitar(String material, String sound, int buyPrice, int sellPrice, int strings) {
        super(material, sound, buyPrice, sellPrice);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public String play(){
        return this.getSound();
    }


    public int calulateMarkUp(){
        return super.getSellPrice() - super.getBuyPrice();
    }

}
