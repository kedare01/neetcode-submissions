class DynamicArray {

    int capacity;
    int length;
    int[] arr;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        if (i < 0 || i > length) {
            throw new IllegalArgumentException("index out of range");
        }
        arr[i] = n;
    }

    public void pushback(int val) {
        if (length == capacity) {
            resize();
        }
        arr[length++] = val;
    }

    public int popback() {
        return arr[--length];
    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        System.arraycopy(arr, 0, newArr, 0, length);
        arr = newArr;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
