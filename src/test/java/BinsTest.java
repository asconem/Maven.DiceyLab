import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void TestBins() {
        //Given
        Bins bins = new Bins(2, 12);

        //When
        Integer actual = bins.getBinMap().get(5);
        Integer notAKey = bins.getBinMap().get(1);
        Integer mapSize = bins.getBinMap().size();


        //Then
        Assert.assertEquals(new Integer(0), actual);
        Assert.assertNull(notAKey);
        Assert.assertEquals(new Integer(11), mapSize);
    }

    @Test
    public void TestGetBinValues() {
        // Given
        Bins bins = new Bins(2, 12);
        Integer expected = 2;
        bins.getBinMap().replace(5, expected);

        // When
        Integer actual = bins.getBinsValue(5);
        Integer zeroValue = bins.getBinsValue(12);

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(new Integer(0), zeroValue);
    }

    @Test
    public void TestIncrementBins(){
        // Given
        Bins bins = new Bins(5, 30);
        bins.getBinMap().replace(7, 8);

        // When
        bins.incrementBin(7);
        Integer actual = bins.getBinsValue(7);
        bins.incrementBin(5);
        Integer actualBin = bins.getBinsValue(5);

        // Then
        Assert.assertEquals(new Integer(9), actual);
        Assert.assertEquals(new Integer(1), actualBin);

    }
}
