package fr.lernejo.guessgame;
import fr.lernejo.logger.*;

import java.util.Scanner;

public class HumanPlayer implements Player{
    Scanner scanner = new Scanner(System.in);
    Logger logger = LoggerFactory.getLogger("Player");
    @Override
    public long askNextGuess() {
        return scanner.nextLong();
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(!lowerOrGreater)
        {
            logger.log("plus petit ou plus grands");
        }
        else {
            lowerOrGreater = true;
        }
    }
}
