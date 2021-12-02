package fr.lernejo.guessgame;
import fr.lernejo.logger.ConsoleLogger;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;
    private boolean guess;
    public Simulation(Player player) {
        this.player = player;
    }


    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    private boolean nextRound() {
        if(player.askNextGuess() > numberToGuess){
            logger.log("It's less !");
        }
        else if(player.askNextGuess() < numberToGuess){
            logger.log("It's more !");
        }
        else {
            logger.log("Good guess !");
            guess = true;
            return true;
        }
        guess=false;
        return false;
    }

    public void loopUntilPlayerSucceed(int maxIteration) {
        String formattedTime;
        long time1 = System.currentTimeMillis();
        while(!this.nextRound() && maxIteration-1 > 0){
            maxIteration--;
            logger.log(""+maxIteration+" left");
            this.nextRound();
        }
        long time2 = System.currentTimeMillis();
        long timeEllapsed = time2 - time1;
        long time_millis = timeEllapsed % 1000;
        long time_seconds = (timeEllapsed / 1000) % 60;
        long time_minutes = (timeEllapsed / (1000 * 60)) % 60;
        formattedTime = String.format("%d:%d.%d", time_minutes, time_seconds, time_millis);
        if(guess)
            logger.log("Number found in "+formattedTime);
        else
            logger.log("Player didn't find the number. It was "+numberToGuess+"\nTime ellapsed : "+formattedTime);
    }
}

