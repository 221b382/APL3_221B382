public class Mahabharat {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        
        arjun.fight();
        arjun.obey();

        bheem.fight();
        bheem.obey();

        duryodhan.fight();
        System.out.println("Duryodhan is disobedient.");

        vikarn.fight();
        vikarn.obey();
    }
}
