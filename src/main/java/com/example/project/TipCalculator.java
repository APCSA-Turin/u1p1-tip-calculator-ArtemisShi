package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();

double tip = (cost * percent)/100; 
int tipB =(int) ((tip* 100) +0.5); //not a new variable to be used; placeholder for rounding; I used the tips we learned before with using 0.5 to round and using the tip we used in U1T5
tip = tipB/100.0;
double billTip = tip + cost;
double per = cost/people; // per person before tip
int perB = (int) ((per*100) + 0.5); //not a new variable to be used
per = perB/100.0;
double tipP = tip/people; //tipP is tip per person
int tipPA = (int) ((tipP * 100)+ 0.5); //not a new variable to be used
tipP = tipPA/100.0;
double totalCost = tipP + per;
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " +"$" + cost ); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent +"%" );
        result.append("Total tip: " +"$" + tip);
        result.append("Total Bill with tip: " +"$" + billTip);
        result.append("Per person cost before tip: " + "$" + per );
        result.append("Tip per person: " + "$" + tipP);
        result.append("Total cost per person: " + "$" + totalCost);
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people =6; 
        int percent = 25;
        double cost = 52.27;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
