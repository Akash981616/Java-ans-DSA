public class Dice {
    private int numberofDice;

    Dice(int numberofDice) {
        this.numberofDice = numberofDice;

    }

    int roll() {
        return ((int)(Math.random()*(6*numberofDice-1*numberofDicenumberofDice))+1);
    }
}
