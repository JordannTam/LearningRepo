package enemyShip;

public class EnemyShipFactory {
    public EnemyShip createEnemyShip(String shipType){
        switch (shipType) {
            case "R":
                return new RocketEnemyShip();
            case "U":
                return new UFOEnemyShip();
            case "B":
                return new BigEnemyShip();
        }
        return null;
    };
}
