package com.chess;

public class Pawn extends AbstractChessItem {
    public Pawn(int x, int y, String color) {
        super(x, y, 1, color);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void action() {
        System.out.println("Түз жүрөт, 1 же 2 жолу биринчи жүрүшүндө.");
    }
}
