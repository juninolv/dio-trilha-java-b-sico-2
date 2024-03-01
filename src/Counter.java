public class Counter {
    int number1;
    int number2;
    int maxCount;

    public Counter(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        this.maxCount = Math.abs(number1 - number2);
    }

    public int getMaxCount() {
        return maxCount;
    }

    public boolean isFirstSmallerThan() throws InvalidParameterException {
        if (number1 >= number2) {
            throw new InvalidParameterException(
                "First parameter must be smaller than second"
            );
        }
        return true;
    }

    public void start() {
        for (int num = 1; num <= maxCount; num++) {
            System.out.printf("Number %d\n", num);
        }
    }
}
