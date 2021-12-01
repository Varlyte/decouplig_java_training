package fr.lernejo.guessgame;
import fr.lernejo.logger.ConsoleLogger;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player ;  //TODO add variable type
    private long numberToGuess; //TODO add variable type
    public Simulation(Player player) {
        this.player = player;
    }


    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    private boolean nextRound() {

        Scanner scanner = new Scanner(System.in);
        long nbr = scanner.nextLong();
        if(nbr > numberToGuess){
            logger.log("Plus petit");
        }
        else if(nbr < numberToGuess){
            logger.log("Plus grand");
        }
        else {
            return true;
        }
        return false;
    }

    public void loopUntilPlayerSucceed() {
        while(!this.nextRound());
    }
}

