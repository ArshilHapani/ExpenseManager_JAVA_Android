package com.example.expensemanager;

import java.io.Serializable;

public class ExpenseModal implements Serializable {
    private String expenseID;
    private String note;
    private String category;
    private long amount;
    private long time;
    private String type;
    private String uid;

    public ExpenseModal() {

    }

    public ExpenseModal(String expenseID, String note, String category, long amount, long time, String type, String uid) {
        this.expenseID = expenseID;
        this.note = note;
        this.category = category;
        this.amount = amount;
        this.time = time;
        this.type = type;
        this.uid = uid;
    }

    public String getExpenseID() {
        return expenseID;
    }

    public void setExpenseID(String expenseID) {
        this.expenseID = expenseID;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
