import java.util.ArrayList;
import java.util.HashMap;

public class Bins {
    HashMap<Integer, Integer> bin;

    public Bins() {
        this.bin = new HashMap<>();
    }

    public HashMap<Integer, Integer> getBin() {
        return bin;
    }

    public void setBin(Integer key, Integer value) {
        bin.put(key, value);
    }

    public Integer getBin(Integer binNumber) {
        return bin.get(binNumber);
    }

    public void binCounter(Integer binNumber) {
        Integer addBin = getBin(binNumber) + 1;
        bin.put(binNumber, addBin);
    }
}
