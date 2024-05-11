public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return endTime - startTime;
    }
    // sắp xếp chọn
    public static void sort(int[] arr) {
        int max;
        for (int i = 0; i < arr.length - 1; i++) {
            max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[max] < arr[j])
                    max = j;
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];
        //random phần tử trong mảng
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * arr.length);
        }

        StopWatch stopWatch = new StopWatch();
        //thiết lập time
        stopWatch.start();
        sort(arr);
        stopWatch.stop();

        System.out.println("Thời gian thực thi thuật toán sắp xếp chọn là: " + stopWatch.getElapsedTime() + " milisecond giây");
    }
}
