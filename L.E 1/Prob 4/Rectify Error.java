class One {
    One(int x) {
        System.out.println("One's constructor called with value: " + x);
    }
}

class Two extends One {
    Two() {
        super(10); 
        System.out.println("Two's constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        Two obj = new Two(); // This will now work
    }
}
