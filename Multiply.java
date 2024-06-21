class Multiply implements Operate {
    @Override
    // Implements the getResult method to multiply all the provided numbers and return the product.
    public Double getResult(Double... numbers) {
        Double result = 1.0;
        for (Double num : numbers) {
            result *= num;
        }
        return result;
    }
}

