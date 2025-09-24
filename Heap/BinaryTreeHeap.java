public class BinaryTreeHeap implements Queueable {
    private int tail;
    private Object[] data;

    public BinaryTreeHeap() {
        this(15);
    }

    public BinaryTreeHeap(int length) {
        tail = -1;
        data = new object[length];
    }

    private int parent(int child) {
        return (child - 1) / 2;
    }

    private int leftChild(int parent) {
        return parent * 2 + 1;
    }

    private int rightChild(int parent) {
        return parent * 2 + 2;
    }

    @Override
    public void enqueue(Object data) {
        if (isFull()) {
            System.err.println("Heap is full!");
        } else {
            tail++;
            this.data[tail] = data;
            heapifyUp(tail);
        }
    }

    @Override
    public Object dequeue() {
        Object temp = null;
        if (isEmpty()) {
            System.err.println("Heap is empty!");
        } else {
            temp = data[0];
            data[0] = data[tail];
            tail--;
            heapifyDown(0);

        }
        return temp;
    }

    private void swap(int index1, int index2) {
        Object temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    private void heapifyUp(int index) {
        int temp = parent(index);
        while (index >= 0 && (Integer) data[index] > (Integer) data[temp]) {
            swap(index, temp);
            index = temp;
            temp = parent(index);
        }
    }

    private void heapifyDown(int index) {

        int leftchild = leftChild(index);
        int rightchild = rightChild(index);

        while ((leftChild <= tail || rightChild <= tail) &&
                ((Integer) data[index] < (Integer) data[leftChild] ||
                        (Integer) data[index] < (Integer) data[rightChild])) {

            if (rightChild <= tail && (Integer) data[rightChild] > (Integer) data[leftChild]) {
                swap(rightChild, index);
                index = rightChild;
            } else {
                swap(leftChild, index);
                index = leftChild;
            }

            leftChild = leftChild(index);
            rightChild = rightChild(index);
        }
    }


    @Override
    public Object front() {
        Object temp = null;
        if (isEmpty()) {
            System.err.println("Heap is empty!");
        } else {
            temp = data[0];
        }
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return tail == -1;
    }

    @Override
    public boolean isFull() {
        return tail == data.length - 1;
    }

    @Override
    public String print() {
        return null;
    }
}