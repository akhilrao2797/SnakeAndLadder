package com.akhil.machine.coding.service;

import com.akhil.machine.coding.models.GameBoard;
import com.akhil.machine.coding.models.Ladder;
import com.akhil.machine.coding.models.Player;
import com.akhil.machine.coding.models.Snake;

import java.util.LinkedList;

public class SnakeAndLadderService {
    private GameBoard board;
    private LinkedList<Player> players;

    SnakeAndLadderService(GameBoard board, LinkedList<Player> players){
        this.board = board;
        this.players = players;
    }

    public Player startGame(){
        boolean gameFinishStatus = false;
        Player currentPlayer = null;
        while(!gameFinishStatus){
            currentPlayer = players.pollFirst();
            int diceValue = DiceService.roll();
            gameFinishStatus = checkPosition(currentPlayer, diceValue);
            players.add(currentPlayer);
        }
        return currentPlayer;
    }

    private boolean checkPosition(Player currentPlayer, int diceValue) {
        int newPosition = currentPlayer.getPosition() + diceValue;
        int earlierPosition;

        do{
            earlierPosition = newPosition;
            for(Snake snake: board.getSnakeList()){
                if(snake.getHead() == newPosition){
                    newPosition = snake.getTail();
                }
            }

            for(Ladder ladder: board.getLadderList()){
                if(ladder.getStart() == newPosition){
                    newPosition = ladder.getEnd();
                }
            }

        }while(newPosition != earlierPosition);
        currentPlayer.setPosition(newPosition);

        return currentPlayer.getPosition() == board.getFinalPosition();
    }
}
