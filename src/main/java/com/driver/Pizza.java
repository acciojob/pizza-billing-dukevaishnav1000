package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;

    private int toppingsPrice;

    private int takeAwayPrice;

    boolean ischeeseAdded=false;
    boolean istoppingsAdded=false;
    boolean istakeaway=false;
    boolean isBillGenerated=false;

    public Pizza(Boolean isVeg){
        if(isVeg==true){
            this.price=300;
            this.toppingsPrice=70;
        }
        else
        {
            this.price=300;
            this.toppingsPrice=120;
        }
        this.isVeg = isVeg;
        this.cheesePrice=80;
        this.takeAwayPrice=20;

        this.bill="Base Price Of The Pizza "+this.price+"\n";
        // your code goes here
    }

    public int getPrice(){


        return this.price;
    }

    public void addExtraCheese(){
        if(!this.ischeeseAdded){
            this.price+=cheesePrice;
            this.ischeeseAdded=true;
        }
    }

    public void addExtraToppings(){
        if(!this.istoppingsAdded){
            this.price+=toppingsPrice;
            this.istoppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.istakeaway){
        this.price+=takeAwayPrice;
        istakeaway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!this.isBillGenerated){
            if(this.ischeeseAdded)
                this.bill+="Extra Cheese Added: "+this.cheesePrice+"\n";
            if(this.istoppingsAdded)
                this.bill+="Extra Toppings Added: "+this.toppingsPrice+"\n";
            if(this.istakeaway)
                this.bill+="Paperbag Added: "+this.takeAwayPrice+"\n";
            this.bill+="Total Price: "+this.price+"\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}
