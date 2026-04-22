class MinStack {
    private List<Integer> stk;
    private List<Integer> min;

    public MinStack() {
        stk = new ArrayList();
        min = new ArrayList();
    }

    public void push(int val) {
        // System.out.println("push:" + val);
        int currentMin = min.isEmpty() ? val : Math.min(min.get(min.size() - 1), val);
        stk.add(val);
        min.add(currentMin);
    }

    public void pop() {
        // System.out.println("pop:" + stk.get(stk.size() - 1));
        stk.remove(stk.size() - 1);
        min.remove(min.size() - 1);
    }

    public int top() {
        // System.out.println("top:" + stk.get(stk.size() - 1));
        return stk.get(stk.size() - 1);
    }

    public int getMin() {
        // System.out.println("getMin:" + min.get(min.size() - 1));
        return min.get(min.size()-1);
    }
}
