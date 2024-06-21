class Add implements Operate {
    @Override
    // Implements the getResult method to add all the provided numbers and return the sum.
    
    public Double getResult(Double... numbers) {
        Double sum = 0.0;
        for (Double num : numbers) {
            sum += num;
        }
        return sum;
    }
}
