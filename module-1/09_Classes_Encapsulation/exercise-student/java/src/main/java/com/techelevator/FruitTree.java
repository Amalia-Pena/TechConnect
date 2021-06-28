package com.techelevator;

public class FruitTree {

    String typeOfFruit = "";

    int piecesOfFruitLeft;

    public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public boolean pickFruit(int numberOfPiecesToRemove) {
        if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
            piecesOfFruitLeft -= numberOfPiecesToRemove;
            return true;
        }
        return false;
    }
}

