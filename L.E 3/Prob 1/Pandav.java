abstract class Pandav extends Bharatvanshi {
    Pandav(boolean kind) {
        super(kind);
    }

    void obey() {
        System.out.println(this.getClass().getSimpleName() + " is obedient.");
    }
}
