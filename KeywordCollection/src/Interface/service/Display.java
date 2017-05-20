package Interface.model;


class Display implements Calculate {
    int x;
    public void cal(int item) {
        x = item * item;            
    }
}