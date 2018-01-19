package com.srikanth;

/**
 * Created by Srikanth on 1/4/2018.
 */
public class HealthyBurger extends Hamburger {
    private float kiwi;
    private float strawberry;

    public HealthyBurger( float kiwi, float strawberry) {
        super("Brown rye bread roll","Bacon",3);
        this.kiwi = kiwi;
        this.strawberry = strawberry;
    }

    public void DietBurger(){
        float amount = getPrice() + (kiwi + strawberry + getLettuce() + getTomato() + getCarrot() + getOnions());
        System.out.println("Healthy Burger Order total amount is: $"+amount);
    }
}
