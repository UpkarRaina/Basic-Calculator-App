class Divide implements Operate {
    @Override
    /* 
    *  Implements the getResult method to divide the first number by each of the 
    *  subsequent numbers sequentially and return the result.
    */
    public Double getResult(Double... numbers) {
        Double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result /= numbers[i];
        }
        return result;
    }
}