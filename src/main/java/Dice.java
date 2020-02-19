import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dice {
    int numberOfDice;

    private static final Logger logger = Logger.getLogger(Dice.class.getName());

    public Dice(int numOfDice) {
        //logger.log(Level.INFO, faceValue + "");
        this.numberOfDice = numOfDice;
    }

    public void setNumberOfDice(Integer numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public Integer getNumberOfDice() {
        return numberOfDice;
    }

    public Integer rollDice() {
        Random roll = new Random();
        return roll.nextInt(6) + 1;
    }

    public Integer tossAndSum(int numberOfDice) {
        Integer sum = 0;

        for (int i = 1; i <= numberOfDice; i++) {
            sum += rollDice();
        }
        return sum;
    }

}
