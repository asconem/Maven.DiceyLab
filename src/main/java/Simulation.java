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
        this.bins = new Bins();
        this.dice = new Dice(numberOfDies);
    }

    public Integer getNumberOfDice() {
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

    public Dice getDice() {
        return dice;
    }

    public void runSimulation() {
        for (int i = 0; i < numberOfTosses; i++) {
            bins.incrementBin(dice.tossAndSum());
        }

    }

    public void printResults() {

    }
}
