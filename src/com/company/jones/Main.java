package com.company.jones;

import java.util.HashMap;
import java.util.Scanner;



public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cities=gather(input, "give me a list of cities with a space betwixt each city name");

        HashMap<String, String[]> cityTemp=new HashMap<>();
        String[] temps;
        for (int i=0; i<cities.length; i++){
            temps=gather(input, "okay now give me the average daily temperature for each of the next five days for "+cities[i]+" with a spece in between each temperature");


            cityTemp.put(cities[i], temps);

        }

            theOutPutFunction(cityTemp, cities);

        }


    private static void theOutPutFunction(HashMap<String, String[]> cityTemp, String[] cities) {
        for (int i=0; i<cities.length; i++){
            System.out.println("the avg tamp over five day for "+cities[i]+" is "+tempAvg((cityTemp.get(cities[i]))));
        }
    }

    private static String[] gather(Scanner input, String message){
        System.out.println(message);
        String list=input.nextLine();

        return list.split(" ");
    }
    private static String tempAvg (String[] obamiumMines){
double total=0;
for (int i=0;i<5;i++){
total+=Double.parseDouble(obamiumMines[i]);

}
return Double.toString(total/5);

}
}