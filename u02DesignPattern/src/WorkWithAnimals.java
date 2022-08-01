public class WorkWithAnimals {
    public static void main(String[] args){
        Dog fido = new Dog();

        fido.setName("Fido");
        System.out.println(fido.getName());
        fido.digHole();
        fido.setWeight(-1);


        int randNum = 10;

        fido.changeVar(randNum);                                    // randNum in method is 12

        System.out.println("randNum after method call: "+ randNum); // randNum after method is 10

        changeObjectName(fido);                                     // static method is called without object name

        System.out.println("Dog name after method call: "+ fido.getName()); // fido name changed


        Animal doggy = new Dog();
        Animal kitty = new Cat();

        System.out.println("Dog   says: "+ doggy.getSound());
        System.out.println("Kitty says: "+ kitty.getSound());

        Animal[] animals = new  Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;

        System.out.println("Dog   says: "+ animals[0].getSound());
        System.out.println("Kitty says: "+ animals[1].getSound());

        speakAnimal(doggy);

        //doggy.digHole();  shows an error because Animal class does not know digHole Method
        //But we can still call it by casting doggy to Dog() class, as shown below
        ((Dog)doggy).digHole();

        /*
         These both lines gives an error because non-static method or variable cannot be
         called inside of static method

         System.out.println(number);
         sayHello();
         */

        // fido.bePrivate(); gives an error because private method cannot be accessed.
        fido.accessPrivate();


        // Working with Abstract Class
        Giraffe giraffe = new Giraffe();

        giraffe.setName("Frank");
        System.out.println(giraffe.getName());



    }

    public static void changeObjectName(Dog fido){
        fido.setSound("Marcus");
    }

    public static  void speakAnimal(Animal randAnimal){
        System.out.println("Animal says: "+ randAnimal.getSound());
    }

    // non-static variable or methods cannot be called inside of static methods see line 42,43
    int number = 10;
    public void sayHello(){
        System.out.println("Animal says: Hello");
    }
}
