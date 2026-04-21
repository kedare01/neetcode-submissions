class Solution {
    public boolean isValid(String s) {
        final Deque<Character> dq = new ArrayDeque<>();
        final Map<Character, Character> map = new HashMap();
        map.put('{','}');
        map.put('(',')');
        map.put('[',']');
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                dq.push(c);
            } else {
                if (dq.isEmpty()) return false;
                char top = dq.peek();
                if(c == map.get(top)) {
                    dq.pop();
                } else {
                    return false;
                }
            }
        }
        return dq.isEmpty();
    }
}