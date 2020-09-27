public enum RoomType {
    SINGLE(1, 50.00),
    DOUBLE(2,65.00),
    TRIPLE(3, 75.00),
    FAMILY(4,100.00);

    private final int capacity;
    private final double rate;

    RoomType(int capacity, double rate) {
        this.capacity = capacity;
        this.rate = rate;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getRate() {
        return rate;
    }
}
