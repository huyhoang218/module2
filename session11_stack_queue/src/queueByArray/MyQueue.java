package queueByArray;

public class MyQueue {
    private int capacity;
    private int queueArray[];
    private int head = 0;
    private int tail = -1;
    private int size = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArray = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (size == capacity) {
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (size == 0) {
            status = true;
        }
        return  status;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Đã đầy, ko thể thêm phần tử " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArray[tail] = item;
            size++;
            System.out.println("Phần tử " + item + " đã được thêm vào hàng đợi");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Ko thể xóa phần tử");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("đã xóa: " + queueArray[head - 1]);
                head = 0;
            }else {
                System.out.println("đã xóa: " + queueArray[head - 1]);
            }
            size--;
        }
    }
}
