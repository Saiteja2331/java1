package day3;

import java.util.Scanner;

public class SalesPromotion {
    
    // Method to calculate earnings for each colony
    public static void calculateEarnings(int numColonies, int[][] colonies, int[][] heights) {
        for (int i = 0; i < numColonies; i++) {
            int n = colonies[i][0];  // number of buildings in the colony
            int earning = colonies[i][1];  // earning per building
            
            int[] buildingHeights = heights[i];  // heights of the buildings
            
            int maxHeightSeen = 0;  // Keeps track of the tallest building seen so far
            int visibleBuildings = 0;  // Counts how many buildings Rahul can see
            
            // Iterate over each building in the colony
            for (int j = 0; j < n; j++) {
                if (buildingHeights[j] > maxHeightSeen) {
                    visibleBuildings++;  // Rahul can see this building
                    maxHeightSeen = buildingHeights[j];  // Update max height
                }
            }
            
            // Print the total earnings for the colony
            System.out.println(visibleBuildings * earning);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of colonies
        int numColonies = scanner.nextInt();
        
        // Arrays to store colony data
        int[][] colonies = new int[numColonies][2];  // stores [n, earning] for each colony
        int[][] heights = new int[numColonies][];  // stores heights of buildings for each colony
        
        // Read data for each colony
        for (int i = 0; i < numColonies; i++) {
            // Read number of buildings and earning per building
            colonies[i][0] = scanner.nextInt();  // number of buildings
            colonies[i][1] = scanner.nextInt();  // earning per building
            
            // Read the heights of buildings
            heights[i] = new int[colonies[i][0]];
            for (int j = 0; j < colonies[i][0]; j++) {
                heights[i][j] = scanner.nextInt();
            }
        }
        
        // Call the method to calculate earnings for each colony
        calculateEarnings(numColonies, colonies, heights);
        
        // Close scanner to prevent resource leaks
        scanner.close();
    }
}
