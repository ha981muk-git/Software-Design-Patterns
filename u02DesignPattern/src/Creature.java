abstract public class Creature {
    protected String name;
    protected int weight;
    protected String sound;


    // All methods inside of abstract class must be abstract and must be overridden

    public abstract void setName(String name);
    public abstract String getName();

    public abstract void setWeight(double newWeight);
    public abstract double getWeight();


}
