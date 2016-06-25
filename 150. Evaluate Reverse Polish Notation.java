public class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        int num1;
        int num2;
        for (String top: tokens){
            
            switch (top){
                case "+":
                    num1= stack.pop();
                    num2 = stack.pop();
                    stack.push(num1 + num2);
                    break;
                case "-":
                    num1= stack.pop();
                    num2 = stack.pop();
                    stack.push(num2 - num1);
                    break;
                case "*":
                    num1= stack.pop();
                    num2 = stack.pop();
                    stack.push(num1 * num2);
                    break;
                case "/":
                    num1= stack.pop();
                    num2 = stack.pop();
                    stack.push(num2 / num1);
                    break;
                default:
                    stack.push(Integer.parseInt(top));
            }
        }
        return stack.pop();
        
    }
}