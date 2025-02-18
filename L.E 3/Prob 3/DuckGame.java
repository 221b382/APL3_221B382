public class DuckGame {
    public static void main(String[] args) {
        Duck rd = new RubberDuck();
        Duck wd = new WoodenDuck();
        Duck rhd = new RedHeadDuck();
        Duck ld = new LakeDuck();
        
        System.out.println("Rubber Duck:");
        rd.performQuack();
        rd.performFly();
        rd.swim();
        
        System.out.println("\nWooden Duck:");
        wd.performQuack();
        wd.performFly();
        wd.swim();
        
        System.out.println("\nRedHead Duck:");
        rhd.performQuack();
        rhd.performFly();
        rhd.swim();
        
        System.out.println("\nLake Duck:");
        ld.performQuack();
        ld.performFly();
        ld.swim();
    }
}
