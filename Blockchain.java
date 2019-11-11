import java.util.Arrays;

public class Blockchain{
    private int currentHash;
    private int previousHash;
    private String[] data;

    Blockchain(int previousHash, String[] data)
    {
        this.previousHash = previousHash;
        this.data = data;
        Object[] contains = {Arrays.hashCode(data), this.previousHash};
        currentHash = Arrays.hashCode(contains);
    }

    
    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getData() {
        return data;
    }

    public int getCurrentHash() {
        return currentHash;
    }
}