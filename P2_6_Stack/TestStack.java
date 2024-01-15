package P2_6_Stack;

public class TestStack {
    public static void main(String[] args) {
        // 1. tạo một Stack để chứa danh sách sinh viên
        MyStack test = new MyStack(3);
        // 2. lần lượt cho các sinh viên vào Stack
        test.push("A");
        test.push("B");
        test.push("C");
        // 3. lần lượt cho các sinh viên ra khỏi Stack
        test.pop() ; // cho sinh viên "C" ra khỏi Stack
        test.pop() ; // cho sinh viên "B" ra khỏi Stack
        test.pop() ; // cho sinh viên "A" ra khỏi Stack
    }
}
