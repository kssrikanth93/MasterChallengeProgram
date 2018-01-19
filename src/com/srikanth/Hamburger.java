package com.srikanth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

/**
 * Created by Srikanth on 1/3/2018.
 */
public class Hamburger {
    private String BreadRollType;
    private String Meat;
    private float price;
    private float lettuce=0.75f;
    private float tomato=0.50f;
    private float carrot=0.75f;

    public void setPrice(float price) {
        this.price = price;
    }

    public float getLettuce() {

        return lettuce;
    }

    public float getTomato() {
        return tomato;
    }

    public float getCarrot() {
        return carrot;
    }

    public float getOnions() {
        return onions;
    }

    private float onions=0.50f;

    public String getBreadRollType() {
        return BreadRollType;
    }

    public String getMeat() {
        return Meat;
    }

    public float getPrice() {
        return price;
    }

    public Hamburger(String breadRollType, String meat, float price) {
        this.BreadRollType = breadRollType;
        this.Meat = meat;
        this.price = price;

    }
    public void BaseBurger(boolean isAddition) throws IOException {
        if (isAddition){
            for (int i = 0; i<5; i++)
            {
                System.out.println("1) Lettuce\n2) Tomato\n3) Carrot\n4) Onions\n5) Healthy Burger\n6) Deluxe Burger" +
                        " \n7) None\n Enter your choice:");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int s = Integer.parseInt(br.readLine());
                if (s == 0){
                    System.out.println("Invalid number, Please enter valid number");
                }
            
                switch (s) {
                    case 1:
                        price = price + lettuce;
                        System.out.println("Lettuce added, so now the Total price is:" + price);
                        break;
                    case 2:
                        price = price + tomato;
                        System.out.println("Tomato added, so now the Total price is:" + price);
                        break;
                    case 3:
                        price = price + carrot;
                        System.out.println("Carrot added, so now the Total price is:" + price);
                        break;
                    case 4:
                        price = price + onions;
                        System.out.println("Onions added, so now the Total price is: $" + price);
                        break;
                    case 5:
                        HealthyBurger mouni = new HealthyBurger(1.5f,1.5f);
                        mouni.DietBurger();
                        break;

                    case 6:
                        DeluxeBurger db = new DeluxeBurger(2,1);
                        db.Deluxe();
                        break;

                    default:
                        System.out.println("Total Amount for your order is : $"+price);
                        break;
                }
                if(s==5 || s==6 || s==7){
                    break;
                }

            }
        }else{
            System.out.println("Total Amount for your order is : $"+price);
        }

    }
}
