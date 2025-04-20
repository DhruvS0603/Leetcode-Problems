class MinStack {
    ArrayList<Integer> st;
    ArrayList<Integer> minValues;
    public MinStack() {
        st= new ArrayList<>();
        minValues= new ArrayList<>();
    }
    
    public void push(int val) {
        st.add(val);
        if(minValues.size()==0){
            minValues.add(val);
        }
        else{
            if(val<=minValues.get(minValues.size()-1)){
                minValues.add(val);
            }
        }
    }
    
    public void pop() {
        int len=st.size();
        int minLast=minValues.get(minValues.size()-1);
        int stLast=st.get(len-1);
        if(minLast==stLast){
            minValues.remove(minValues.size()-1);
        }
        st.remove(len-1);
    }
    
    public int top() {
        return st.get(st.size()-1);
    }
    
    public int getMin() {
        return minValues.get(minValues.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */