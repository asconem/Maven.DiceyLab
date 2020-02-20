import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

public class SimulationTest {

    @Test
    public void TestSimulation() {
        // Given
        Integer numberOfDice = 4;
        Integer numberOfTosses = 20;
        Integer expectedMinBin = 4;
        Integer expectedMaxBin = 24;

        // When
        Simulation sim = new Simulation(numberOfDice, numberOfTosses);
        Integer actualMinBin = sim.getMinBin();
        Integer actualMaxBin = sim.getMaxBin();
        Integer actualTosses = sim.getNumberOfTosses();

        // Then
        Assert.assertEquals(expectedMinBin, actualMinBin);
        Assert.assertEquals(expectedMaxBin, actualMaxBin);
        Assert.assertEquals(numberOfTosses, actualTosses);
    }

    @Test
    public void TestRunSimulation() {
        // Given
        Simulation sim = new Simulation(4, 15);

        // When
        sim.runSimulation();
        Collection<Integer> actualValues = sim.getBins().getBinMap().values();
        Integer rollsCountedInBins = 0;
        for (Integer value : actualValues) {
            rollsCountedInBins = rollsCountedInBins + value;
        }

        // Then
        Assert.assertEquals(new Integer(15), rollsCountedInBins);

    }

    @Test
    public void TestPrintResults() {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printResults();
    }
}
