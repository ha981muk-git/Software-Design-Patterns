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

    }

    public static void changeObjectName(Dog fido){
        fido.setSound("Marcus");
    }
}
