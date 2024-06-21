class Subtract implements Operate {
    @Override
    // Implements the getResult method to subtract all the subsequent numbers from the first number and return the result.
    public Double getResult(Double... numbers) {
        Double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }
}


