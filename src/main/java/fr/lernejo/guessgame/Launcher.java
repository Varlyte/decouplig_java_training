package fr.lernejo.guessgame;
import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args){
        HumanPlayer human =new HumanPlayer();
        Simulation simu = new Simulation(human);
        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextInt(100);
        simu.initialize(randomNumber);
        simu.loopUntilPlayerSucceed();
    }
}
