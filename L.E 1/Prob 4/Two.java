public class Two extends One {
    private int y;

    public Two(int x, int y) {
        super(x); 
        this.y = y;
    }

    public void display() {
        super.display(); 
        System.out.println("Value of y: " + y);
    }
}
