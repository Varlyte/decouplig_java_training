package fr.lernejo.guessgame;
import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args){
        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextInt(100);
        int MAX_VALUE = 6;
        try {
            if (args[0].equals("-interactive")) {
                HumanPlayer human = new HumanPlayer();
                Simulation simu = new Simulation(human);
                simu.initialize(randomNumber);
                simu.loopUntilPlayerSucceed(MAX_VALUE);
            } else if (args[0].equals("-auto")) {
                try {
                    long parser = Long.valueOf(args[1]);
                    ComputerPlayer robot = new ComputerPlayer(parser);
                    Simulation simurobot = new Simulation(robot);
                    simurobot.initialize(randomNumber);
                    simurobot.loopUntilPlayerSucceed(1000);
                } catch (NumberFormatException nfe) {
                    System.out.println("Second argument \""+ args[1]+"\" is not a long");
                }
            }
        } catch (Exception e) {
            System.out.println("no argument given, add \"-interactive\" or \"-auto <long>\" to run the program");
        }
    }
}
