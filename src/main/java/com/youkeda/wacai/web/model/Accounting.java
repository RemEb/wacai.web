package com.youkeda.wacai.web.model;

/**
 * @author Lcy
 * @date 2019/1/23 15:30
 */
public class Accounting {
    /**
     * 现金
     */
    private int cash;
    /**
     * 收入
     */
    private int income;
    /**
     * 租金
     */
    private int rent;
    /**
     * 水电
     */
    private int charges;
    /**
     * 吃饭
     */
    private int eat;
    /**
     * 请客
     */
    private int treat;
    /**
     * KTV
     */
    private int ktv;
    /**
     * 余额
     */
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    public int getEat() {
        return eat;
    }

    public void setEat(int eat) {
        this.eat = eat;
    }

    public int getTreat() {
        return treat;
    }

    public void setTreat(int treat) {
        this.treat = treat;
    }

    public int getKtv() {
        return ktv;
    }

    public void setKtv(int ktv) {
        this.ktv = ktv;
    }
}
