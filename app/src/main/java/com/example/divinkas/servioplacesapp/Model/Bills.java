package com.example.divinkas.servioplacesapp.Model;

public class Bills {
    public int Id;
    public int Number;
    public double Total;
    public String Opened;
    public String OpenUser;

    public Bills() {
    }
    public Bills(int id, int number, double total, String opened, String openUser) {
        Id = id;
        Number = number;
        Total = total;
        Opened = opened;
        OpenUser = openUser;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public String getOpened() {
        return Opened;
    }

    public void setOpened(String opened) {
        Opened = opened;
    }

    public String getOpenUser() {
        return OpenUser;
    }

    public void setOpenUser(String openUser) {
        OpenUser = openUser;
    }
}
