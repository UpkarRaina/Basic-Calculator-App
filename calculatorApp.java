import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

class CalculatorApp {
    public static void main(String[] args) {

        //  These queues will store the operators and numbers from the input expression respectively.
        Queue<String> operations;
        Queue<String> numbers;
 
        // This line calls the read method from the ReadInput class to get the user's input expression as a string.
        final String inputExp = ReadInput.read();

        // Splits the expression into numbers and operators.
        String numbersArr[] = inputExp.split("[*\\-/+]");
        String operArr[] = inputExp.split("[0-9]+");

        /*
         * numbers: A queue of numbers extracted from the input expression.
         *operations: A queue of operators extracted from the input expression.
         */
        numbers = new LinkedList<>(Arrays.asList(numbersArr));
        operations = new LinkedList<>(Arrays.asList(operArr));

        // Remove the first empty string from operations (if present)
        if (operations.peek().isEmpty()) {
            operations.poll();
        }

        //  Initializes the result (res) with the first number in the queue, converting it from a string to a double.
        Double res = Double.parseDouble(numbers.poll());
        while (!numbers.isEmpty()) {
            String opr = operations.poll();
            Operate operation;
            switch (opr) {
                case "+":
                    operation = new Add();
                    break;
                case "-":
                    operation = new Subtract();
                    break;
                case "*":
                    operation = new Multiply();
                    break;
                case "/":
                    operation = new Divide();
                    break;
                default:
                    continue;
            }
            Double num = Double.parseDouble(numbers.poll());
            res = operation.getResult(res, num);
        }
        System.out.println("Result: " + res);
    }
}






