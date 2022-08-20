public class EnemyShipFactory
{
    public EnemyShip  makeEnemyShip(String newShipTpye){
        EnemyShip newShip = null;
        if(newShipTpye.equals("U")){
            return new UFOEnemyShip();
        }else
            if(newShipTpye.equals("R")){
            return new RocketEnemyShip();
        }else
            if(newShipTpye.equals("B")){
            return new BigUFOEnemyShip();
        }else
            return null;
    }
}
