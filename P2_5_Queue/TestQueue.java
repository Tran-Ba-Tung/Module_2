package P2_5_Queue;


public class TestQueue {

    public static void main(String[] args) {
        // 1. tạo một Queue để chứa danh sách sinh viên
        MyQueue test = new MyQueue(3);
        // 2. lần lượt cho các sinh viên vào Queue
        test.push("A");
        test.push("B");
        test.push("C");
        // 3. lần lượt cho các sinh viên ra khỏi Queue
        test.pop(); // cho sinh viên "A" ra Queue
        test.pop(); // cho sinh viên "B" ra Queue
        test.pop(); // cho sinh viên "C" ra Queue
    }
}