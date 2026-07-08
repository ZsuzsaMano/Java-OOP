class Counter {
    private int startValue;
    private int value;
    private int min = 0;
    private int max = 99;

    public Counter(int start) {
        startValue = start;
        value = start;
    }

    public void increment() {
        if (value < max) {
            value++;
        }
    }

    public void decrement() {
        if (value > min) {
            value--;
        }
    }

    public void reset() {
        value = startValue;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
