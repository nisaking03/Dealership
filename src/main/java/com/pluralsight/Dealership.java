package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership (String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public List<Vehicle> getVehicleByPrice(double min, double max){
        ArrayList<Vehicle> result = new ArrayList<>();

        for (Vehicle vehicle : inventory){
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max){
                result.add(vehicle);
            }
        }
        return result;
    }

    public List<Vehicle> getVehicleByMakeModel(String make, String model){
        ArrayList<Vehicle> result = new ArrayList<>();

        for (Vehicle vehicle : inventory){
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)){
                result.add(vehicle);
            }
        }
        return result;
    }

    public List<Vehicle> getVehicleByYear(int min, int max){
        ArrayList<Vehicle> result = new ArrayList<>();

        for (Vehicle vehicle : inventory){
            if (vehicle.getYear() >= min && vehicle.getYear() <= max){
                result.add(vehicle);
            }
        }
        return result;
    }

    public List<Vehicle> getVehicleByColor(String color){
        ArrayList<Vehicle> result = new ArrayList<>();

        for (Vehicle vehicle : inventory){
            if (vehicle.getColor().equalsIgnoreCase(color)){
                result.add(vehicle);
            }
        }
        return result;
    }

    public List<Vehicle> getVehicleByMileage(int max, int min){
        ArrayList<Vehicle> result = new ArrayList<>();

        for (Vehicle vehicle : inventory){
            if (vehicle.getOdometer() >= min && vehicle.getOdometer() <= max){
                result.add(vehicle);
            }
        }
        return result;
    }

    public List<Vehicle> getVehicleByType(String type){
        ArrayList<Vehicle> result = new ArrayList<>();

        for (Vehicle vehicle : inventory){
            if (vehicle.getVehicleType().equalsIgnoreCase(type)){
                result.add(vehicle);
            }
        }
        return result;
    }

    public List<Vehicle> getAllVehicles() {
     return inventory;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
    }
}
// The logic behind adding/searching/removing vehicles