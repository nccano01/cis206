import java.util.ArrayList;
import java.util.List;

/*
 File: Main.java
 Description: This is a program for my final
 Created: Wednesday, June 7, 2023, 9:25:00
 Author: Nathan Calderon-Cano
 email: nathanc8635@student.vvc.edu
*/

class Mountain {
    private String name;
    private String country;
    private double elevation;

    public Mountain(String name, String country, double elevation) { 
        this.name = name;
        this.country = country;
        this.elevation = elevation;
    }

    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public double getElevation() {
        return elevation;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCountry(String Country) {
        this.country = country;
    }
    public void setElevation(double elevation) {
        this.elevation = elevation;
    }
    public double toMeters() { //converting feet into meters
        return elevation / 3.2808;
    }
}

public class main {
    public static void main(String[] args) {
        List<Mountain> mountains = new ArrayList<>();
        // creates mountain objects and adds them to the list
        Mountain mountain1 = new Mountain("Chimborzo", "Ecuador", 20549);
        Mountain mountain2 = new Mountain("Matterhorn", "Switzerland", 14692);
        Mountain mountain3 = new Mountain("Olympus", "Greece(Macedonia)", 9573);
        Mountain mountain4 = new Mountain("Everest", "Nepal", 29029);
        Mountain mountain5 = new Mountain("Mount Marcy", "United States", 5344);
        Mountain mountain6 = new Mountain("Mount Mitchell", "United States", 6684);
        Mountain mountain7 = new Mountain("Zugspitze", "Switzerland", 9719);

        mountains.add(mountain1);
        mountains.add(mountain2);
        mountains.add(mountain3);
        mountains.add(mountain4);
        mountains.add(mountain5);
        mountains.add(mountain6);
        mountains.add(mountain7);

        System.out.println("Mountain\t\tCountry\t\t\tElevation(feet)\t\tElevation(meters)");
        System.out.println("----------------------------------------------------------------------------------------");


        for (Mountain mountain : mountains) { //iterates through mountains and outputs them in a table like fashion
            System.out.printf("%-25s%-25s%.0f\t\t\t%.2f%n", mountain.getName(), mountain.getCountry(), mountain.getElevation(), mountain.toMeters());
        }
        System.out.println("----------------------------------------------------------------------------------------");
    Mountain shortestMountain = minElevation(mountains); //prints minimum elevation 
    System.out.println("Shortest mountain: " + shortestMountain.getName());
    System.out.println("Elevation in feet: " + shortestMountain.getElevation());
    System.out.println("Elevation in meters: " + shortestMountain.toMeters());

    }

    public static Mountain minElevation(List<Mountain> mountains) { 
        Mountain minMountain = null;
        double minElevation = Double.MAX_VALUE;

        for (Mountain mountain : mountains) { //finds minimum elevation by iterating through mountains
            double elevation = mountain.getElevation();
            if (elevation < minElevation) {
                minElevation = elevation;
                minMountain = mountain;

            }
        }

    return minMountain;
    }
}