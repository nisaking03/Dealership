package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {
    //tools needed: File/Buffer Reader , File/Buffer Writer , StringSplit , TryCatch

    public Dealership getDealership(){
        // Step 1: Read FIRST line
        // Step 2: Split first line by "|"
        // Step 3: Create Dealership object with that info

        // Step 4: Read REMAINING lines (while loop)
        // Step 5: For each line, create a Vehicle
        // Step 6: Add that Vehicle to the Dealership

        // Step 7: Return the Dealership
        try{
            FileReader fileReader = new FileReader("inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String lineFromString;

            while((lineFromString = bufferedReader.readLine()) != null){
                String[] part = lineFromString.split("\\|");
                int vin = Integer.parseInt(part[0]);
                int year = Integer.parseInt(part[1]);
                String make = part[2];
                String model = part[3];
                String vehichleType = part[4];
                String color = part[5];
                int odometer = Integer.parseInt(part[6]);
                double price = Double.parseDouble(part[7]);
            }


        }catch(Exception e){

        }
        return
    }


    public saveDealership(){
        //Using writer here

    }

}
