public class Animal {
    private String name;
    private double height;
    private int weight;
    private String favFood;

    private double speed;
    private String sound;

    public void setName(String newName){ name = newName;}
    public  String getName(){return  name;}

    public void setWeight(int newWeight){
        if(newWeight > 0 ){
            weight = newWeight;
        }else {
            System.out.println("Weight must be bigger than 0");
        }
    }

    public int getWeight() { return weight; }

    public void setFavFood(String newFavFood){favFood = newFavFood;}
    private String getFavFood(){return favFood;}

    public void setSpeed(double newSpeed){ speed = newSpeed;}
    private double getSpeed(){return speed;}


    public void setSound(String newSound){ sound = newSound; }
    public String getSound(){return sound;}


    // Using Strategy Pattern with Flys interface
    public Flys flyingType;

    public String tryToFly(){
        return flyingType.fly();
    }
    public void setFlyingAbility(Flys newFlyType){
            flyingType = newFlyType;
    }


}
