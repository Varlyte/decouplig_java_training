package fr.lernejo.guessgame;
import fr.lernejo.logger.*;

import java.util.Scanner;

public class HumanPlayer implements Player{
    Scanner scanner = new Scanner(System.in);
    Logger logger = LoggerFactory.getLogger("Player");
    @Override
    public long askNextGuess() {
        return 0;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
