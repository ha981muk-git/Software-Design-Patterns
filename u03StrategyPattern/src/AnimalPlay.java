public class AnimalPlay {
    public static void main(String[] args){
        Animal sparky = new Dog();
        Animal tweety = new Bird();
        Animal kitty  = new Cat();
        
        System.out.println("Dog: "+sparky.tryToFly());
        System.out.println("Bird:"+tweety.tryToFly());
        System.out.println("Cat: " +kitty.tryToFly());

        sparky.setFlyingAbility(new ItFlys());// setting new flying ability to dog
        System.out.println("Dog: "+sparky.tryToFly());
    }
}
