public class Sheep implements Animal {
    public Sheep(){

        System.out.println("Sheep is Made");
    }
    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is Being Made");
        Sheep sheepObject = null;
        try {
            sheepObject = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


        return sheepObject;
    }

    public String toString(){
        return "Dolly is my Hero, Baaaa...";
    }
}
