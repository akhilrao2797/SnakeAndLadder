package com.akhil.machine.coding.models;

import java.util.List;

public class GameBoard {

    private int finalPosition;
    private List<Snake> snakeList;
    private List<Ladder> ladderList;

    GameBoard(int finalPosition){
        this.finalPosition = finalPosition;
    }

    public int getFinalPosition() {
        return finalPosition;
    }

    public void setFinalPosition(int finalPosition) {
        this.finalPosition = finalPosition;
    }

    public List<Snake> getSnakeList() {
        return snakeList;
    }

    public void setSnakeList(List<Snake> snakeList) {
        this.snakeList = snakeList;
    }

    public List<Ladder> getLadderList() {
        return ladderList;
    }

    public void setLadderList(List<Ladder> ladderList) {
        this.ladderList = ladderList;
    }
}
