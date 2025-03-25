abstract class Beverage {
    private void pourBeverage(int qty){
        if (qty<=90)
        System.out.println("Pour "+qty+" ml of Whiskey into a glass");
        else
        System.out.println("Pour "+qty+" ml of Beer into a glass");
    }
    
    protected abstract void addCondiment();
    
    protected void stir() {}; //Hook
    
    private void serve() {
        System.out.println("Serve through waiter\n");
    }
    
    final void templateMethod(int qty){
        pourBeverage(qty);
        addCondiment();
        stir();
        serve();
    }
}