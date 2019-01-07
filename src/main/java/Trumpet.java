public class Trumpet extends Instrument implements IPlay, ISell {
    private int valves;

    public Trumpet(String material, String sound, int buyPrice, int sellPrice, int valves) {
        super(material, sound, buyPrice, sellPrice);
        this.valves = valves;
    }

    public int getValves() {
        return valves;
    }

    public void setValves(int valves) {
        this.valves = valves;
    }

    public String play(){
        return this.getSound();
    }


    public int calulateMarkUp(){
        return super.getSellPrice() - super.getBuyPrice();
    }
}