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
double perC = perB/100.0;
double tipP = tip/people; //tipP is tip per person
int tipPA = (int) ((tipP * 100)+ 0.5); //not a new variable to be used
double tipPC = tipPA/100.0;
double totalCost = ((int) ((tipP + per)*100)/100.0);
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " +"$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent +"%\n" );
        result.append("Total tip: " +"$" + tip + "\n");
        result.append("Total Bill with tip: " +"$" + billTip + "\n");
        result.append("Per person cost before tip: " + "$" + perC +"\n");
        result.append("Tip per person: " + "$" + tipPC + "\n");
        result.append("Total cost per person: " + "$" + totalCost + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people =12; 
        int percent = 15;
        double cost = 566.97;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
