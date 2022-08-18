package com.task17_1;

public class Farm {
    private String address, ownerName;
    private Cow[] cows;
    private Sheep[] sheep;
    private Horse[] horses;

    public Farm(String address, Cow[] cows, Horse[] horses, Sheep[] sheep, String ownerName) {
        this.address = address;
        this.ownerName = ownerName;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
    }

    @Override
    public String toString() {
        return String.format("Farm location: %s, owner: %s. Farm state:\ncows: %s\nsheep: %s\nhorses: %s\n", address, ownerName, cows.length, sheep.length, horses.length);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }
}
