package com.devsuperior.hrpayroll.entities;

public class Payment {

    private String name;
    private Double dailyInCome;
    private Integer days;

    public Payment() {
    }

    public Payment(String name, Double dailyInCome, Integer days) {
        this.name = name;
        this.dailyInCome = dailyInCome;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyInCome() {
        return dailyInCome;
    }

    public void setDailyInCome(Double dailyInCome) {
        this.dailyInCome = dailyInCome;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public double getTotal(){
       return days * dailyInCome;
    }
}
