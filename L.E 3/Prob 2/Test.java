interface Testable {
    void display(); 
}


class Test implements Testable {
    public void display() {
        System.out.println("Test class implementing Testable");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}


abstract class AbsTest implements Testable {
    
}
