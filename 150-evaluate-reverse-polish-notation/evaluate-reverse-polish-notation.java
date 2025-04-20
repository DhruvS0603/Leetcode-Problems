class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String c : tokens) {
            if (c.equals("+")) {
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2 + num1);
            } else if (c.equals("-")) {
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2 - num1);
            } else if (c.equals("*")) {
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2 * num1);
            } else if (c.equals("/")) {
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2 / num1);
            } else {
                st.push(Integer.parseInt(c));
            }
        }
        return st.peek();
    }
}