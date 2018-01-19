package com.srikanth;

/**
 * Created by Srikanth on 1/5/2018.
 */
public class DeluxeBurger extends Hamburger {
    private float soda;
    private float chips;

    public DeluxeBurger( float soda, float chips) {
        super("wheat bread", "steak", 3);
        this.soda = soda;
        this.chips = chips;
    }

    public void Deluxe(){
        float amount = getPrice() + (soda + chips + getLettuce() + getTomato() + getCarrot() + getOnions());
        System.out.println("Deluxe Burger with soda and chips, Total price is: $"+amount);
    }
}
