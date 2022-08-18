package com.chess;

public abstract class AbstractChessItem {
    private int x, y, value;
    private String color;
    private int[][] battlefield = new int[8][8];

    public AbstractChessItem(int x, int y, int value, String color) {
        setX(x);
        setY(y);
        this.value = value;
        this.color = color;
    }

    public void draw(){
        System.out.println(getClass().getSimpleName() + ", x: " + getX() + ", y: " + getY() + ", value: " +getValue() +", color:" + getColor());
    }

    public abstract void action();

    @Override
    public String toString(){
        return getClass().getSimpleName() + ", x: " + getX() + ", y: " + getY() + ", color:" + getColor();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x <= 8) this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y <= 8) this.y = y;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBattlefield() {
        String result="";
        result+="  1 2 3 4 5 6 7 8\n";
        for (int i = 0; i < battlefield.length; i++) {
            result+=(i+1)+":";
            for (int j = 0; j < battlefield[i].length; j++) {
                result+=battlefield[i][j] + " ";
            }
            result+="\n";
        }
        return result;
    }

    public void setBattlefield(int[][] battlefield) {
        this.battlefield = battlefield;
    }
}
