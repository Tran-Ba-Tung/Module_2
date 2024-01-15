package P2_6_Stack;


public class MyStack implements IStack {
    private String [] student; 
    private int topIndex ;
    private int size; 
    public MyStack (int size) {
        this.size = size; 
        student = new String[size] ;
        topIndex =-1; 
    }

    @Override
    public boolean push(String nameStudent) {
        if (!isFull()) {
            topIndex ++;
            student[topIndex] = nameStudent;
            return true;
        }
        return false;
    }

    @Override
    public String pop() {
        if (!isEmpty()) {
            String nameStudent = student[topIndex];
            topIndex --;
            return nameStudent;
        }
        return null;
    }

    @Override
    public boolean isFull() {
        return topIndex >= size -1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex ==-1;
    }

    
}