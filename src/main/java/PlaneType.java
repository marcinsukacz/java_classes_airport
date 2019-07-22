public enum PlaneType {

    BOING737(130, 30000),
    BOING777(380, 120000),
    AIRBUSS_A380(850, 277000),
    ATR666(12, 5000);

    private final int capacity;
    private final int weight;


    PlaneType(int capacity, int weight) {

        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {

        return capacity;
    }

    public int getWeight() {

        return weight;
    }
}
