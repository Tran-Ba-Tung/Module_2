 package P2_5_Queue;

public class MyQueue implements IQueue{
    private String [] student; 
    private int size; 
    private int headIndex; 
    private int tailIndex; 

    public MyQueue (int size) {
        this.size = size; 
        student = new String[size]; 
        headIndex = tailIndex =-1; 
    }
    @Override
    public boolean push(String nameStudent) {
        if (!isFull()) {
            tailIndex ++ ;
            student[tailIndex] = nameStudent; 
            return true;
        }
        return false;
    }

    @Override
    public String pop() {
        if (!isEmpty()) {
            if (headIndex > tailIndex) {
                headIndex = tailIndex =-1; 
            }
            String nameStudent = student[headIndex]; 
            headIndex ++; 
            return nameStudent;
        }
        return null;
    }

    @Override
    public boolean isFull() {
        return tailIndex >= size -1;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Array is empty!");
        } else {
            for (String x : student) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean isEmpty() {
        return (headIndex ==-1) && (tailIndex ==-1);
    }

}