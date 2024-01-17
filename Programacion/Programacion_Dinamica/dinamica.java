import java.util.Stack;
import java.util.Scanner;

public class dinamica {

    public static void main(String[] args) {
 


    }
    public class RPNCalculator {
        private Stack<Double> stack;

        public RPNCalculator() {
            stack = new Stack<>();
        }

        public void run() {
            Scanner scanner = new Scanner(System.in);
            String input;

            do {
                System.out.print("Ingrese un número o una operación (+, -, *, /): ");
                input = scanner.nextLine();

                if (isNumeric(input)) {
                    double number = Double.parseDouble(input);
                    stack.push(number);
                } else if (isOperator(input)) {
                    if (stack.size() < 2) {
                        System.out.println("No hay suficientes operandos en la pila.");
                        continue;
                    }

                    double operand2 = stack.pop();
                    double operand1 = stack.pop();
                    double result = performOperation(input, operand1, operand2);
                    stack.push(result);
                } else if (!input.equalsIgnoreCase("q")) {
                    System.out.println("Entrada inválida.");
                }

                printStack();
            } while (!input.equalsIgnoreCase("q"));
        }

        private boolean isNumeric(String input) {
            try {
                Double.parseDouble(input);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        private boolean isOperator(String input) {
            return input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/");
        }

        private double performOperation(String operator, double operand1, double operand2) {
            switch (operator) {
                case "+":
                    return operand1 + operand2;
                case "-":
                    return operand1 - operand2;
                case "*":
                    return operand1 * operand2;
                case "/":
                    return operand1 / operand2;
                default:
                    return 0;
            }
        }

        private void printStack() {
            System.out.println("Pila: " + stack);
        }

        public static void main(String[] args) {
            RPNCalculator calculator = new RPNCalculator();
            calculator.run();
        }
    }
    
}
