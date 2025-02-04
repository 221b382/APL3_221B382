public class Voice2 {
    abstract class Animal {
        abstract void makeVoice();
    }
    class Cow extends Animal {
        @Override
        void makeVoice() {
            System.out.println("Cow says: Moo");
        }
    }

    class Dog extends Animal {
        @Override
        void makeVoice() {
            System.out.println("Dog says: Woof");
        }
    }

    class Pig extends Animal {
        @Override
        void makeVoice() {
            System.out.println("Pig says: Oink");
        }
    }

    class Goat extends Animal {
        @Override
        void makeVoice() {
            System.out.println("Goat says: Baa");
        }
    }

    class Lion extends Animal {
        @Override
        void makeVoice() {
            System.out.println("Lion says: Roar");
        }
    }

    private Animal[] animals;

    private void prepareVoice() {
        animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    private void hear() {
        if (animals == null) {
            System.out.println("Error: Animals have not been prepared yet.");
            return;
        }
        for (Animal animal : animals) {
            animal.makeVoice(); 
        }
    }

    public void templateMethod() {
        prepareVoice();
        hear();
    }
}