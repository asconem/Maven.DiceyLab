import java.sql.SQLOutput;

public class Simulation {

    private Integer numberOfTosses;
    private Integer maxBin;
    private Integer minBin;
    private Bins bins;
    private Dice dice;


    public Simulation(Integer numberOfDies, Integer numberOfTosses) {
        this.numberOfTosses = numberOfTosses;
        this.maxBin = numberOfDies * 6;
        this.minBin = numberOfDies;
        this.bins = new Bins(minBin, maxBin);
        this.dice = new Dice(numberOfDies);
    }

    public Integer getNumberOfTosses() {
        return numberOfTosses;
    }

    public Integer getMaxBin() {
        return maxBin;
    }

    public Integer getMinBin() {
        return minBin;
    }

    public Bins getBins() {
        return bins;
    }

    public void runSimulation() {
        for (int i = 0; i < numberOfTosses; i++) {
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public void printResults() {
        System.out.println("***");
        System.out.println("Simulation of " + dice.getNumberOfDice() + " dice rolled " + numberOfTosses + " times.");
        System.out.println("***\n");

        for (int i = minBin; i <= maxBin; i++) {
            Integer binNumber = i;
            Integer numOfTimesRolled = bins.getBinsValue(binNumber);
            Double percentageRolled = (double) numOfTimesRolled / (double) numberOfTosses;

            if (i < 10) {
                System.out.print(" " + i + "'s rolled : ");
            } else if (i < 100) {
                System.out.print(+ i + "'s rolled : ");
            } else {
                System.out.print("Total " + i + "'s rolled : ");
            }
            System.out.printf("%7d: ", numOfTimesRolled);
            System.out.printf("%.2f ", percentageRolled);

            for (int stars = 1; stars < (percentageRolled * 100); stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
