package com.pluralsight;

public class UserInterface {
    public static void MainMenu(String[] args) {
        String mainMenu =
                "1 - Find vehicles within a price range\n" +
                "2 - Find vehicles by make / model\n" +
                "3 - Find vehicles by year range\n" +
                "4 - Find vehicles by color\n" +
                "5 - Find vehicles by mileage range\n" +
                "6 - Find vehicles by type (car, truck, SUV, van)\n" +
                "7 - List ALL vehicles\n" +
                "8 - Add a vehicle\n" +
                "9 - Remove a vehicle\n" +
                "0 - Quit */";


        while (true) {
            System.out.print(mainMenu);
            int command;

            command = ConsoleHelper.promptForInt(""); //prompt for main menu

            switch (command) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0: //exit
                    return;
                default:
                    System.out.println("'We don't have that service here...'");
                    break;

            }
        }
    }
    private static void processGetByPriceRequest(){

    }
    private static void processGetByMakeModelRequest(){

    }
    private static void processGetByYearRequest(){

    }
    private static void processGetByColorRequest(){

    }
    private static void processGetByMileageRequest(){

    }
    private static void processGetByVehicleTypeRequest(){

    }
    private static void processGetAllVehiclesRequest(){

    }
    private static void processAddVehicleRequest(){

    }
    private static void processRemoveVehicleRequest(){
        
    }
}
/* Features this will Include

1 - Find vehicles within a price range
2 - Find vehicles by make / model
3 - Find vehicles by year range
4 - Find vehicles by color
5 - Find vehicles by mileage range
6 - Find vehicles by type (car, truck, SUV, van)
7 - List ALL vehicles
8 - Add a vehicle
9 - Remove a vehicle
99 - Quit */