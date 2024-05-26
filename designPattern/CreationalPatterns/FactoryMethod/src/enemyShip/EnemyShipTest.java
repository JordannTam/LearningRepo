package enemyShip;

import java.util.Scanner;

public class EnemyShipTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EnemyShip enemyShip = null;
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        System.out.println("Create a ship with (U/R/B): ");
        if (sc.hasNextLine()){
            enemyShip = shipFactory.createEnemyShip(sc.nextLine());
        }
        if (enemyShip != null){
            doStuff(enemyShip);
        }
    }
    public static void doStuff(EnemyShip enemyShip) {
        enemyShip.display();
    }
}
