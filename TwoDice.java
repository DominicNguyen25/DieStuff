public class TwoDice
{
    public TwoDice() {
        die1 = new Die6();
        die2 = new Die6();
    }

    public int getValue() {
        return die1.getValue() + die2.getValue();
    }

    public void roll() {
        die1.roll();
        die2.roll();
    }

    public int rollAndGetValue() {
        this.roll();
        return getValue();
    }
    
    private Die6 die1;
    private Die6 die2;
}