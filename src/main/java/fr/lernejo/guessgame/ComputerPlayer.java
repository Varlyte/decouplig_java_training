package fr.lernejo.guessgame;

public class ComputerPlayer implements Player{
    private long starter;
    public ComputerPlayer(long starter){
        this.starter = starter;
    }
    @Override
    public long askNextGuess() {
        long guess = starter;
        return guess;
    }


    @Override
    public void respond(boolean lowerOrGreater) {}
}

