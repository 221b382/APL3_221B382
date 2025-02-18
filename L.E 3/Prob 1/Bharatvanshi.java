abstract class Bharatvanshi {
    boolean kind;

    
    Bharatvanshi(boolean kind) {
        this.kind = kind;
    }

    
    void fight() {
        System.out.println(this.getClass().getSimpleName() + " is fighting!");
    }
}
