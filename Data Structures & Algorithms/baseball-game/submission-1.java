class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        for (String op : operations) {
            if (op.equals("C")) {
                dq.removeLast();
            } else if (op.equals("D")) {
                dq.add(dq.peekLast() * 2);
            } else if (op.equals("+")) {
                int last = dq.removeLast();
                int secondLast = dq.peekLast();
                dq.add(last);
                dq.add(last + secondLast);
            } else {
                dq.add(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for(Integer it: dq) {
            sum += it;
        }
        return sum;
    }
}