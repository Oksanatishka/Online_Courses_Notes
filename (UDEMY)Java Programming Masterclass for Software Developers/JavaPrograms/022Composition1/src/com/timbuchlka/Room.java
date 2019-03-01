package com.timbuchlka;

public class Room {
    private Bed bed;
    private Table table;
    private Chair chair;

    public Room(Bed bed, Table table, Chair chair) {
        this.bed = bed;
        this.table = table;
        this.chair = chair;
    }

    public Bed getBed() {
        return bed;
    }

    public Table getTable() {
        return table;
    }

    public Chair getChair() {
        return chair;
    }
}
