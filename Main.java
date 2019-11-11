class Main{

    public static void main(String[] args){
        String[] transactions1 = {"Mihir gives 10 Rs. to Rahul", "Rahul gives 10 Rs. to Mihir"};
        Blockchain block1 = new Blockchain(1, transactions1);
        System.out.println("Block 1 Hash: " + block1.getCurrentHash());

        String[] transactions2 = {"Rahul gives 100 Rs. to Dhrumil", "Dhrumil gives 50 Rs. to Rahul"};
        Blockchain block2 = new Blockchain(block1.getCurrentHash(), transactions2);
        System.out.println("Block 2 Hash: " + block2.getCurrentHash());
    }
}