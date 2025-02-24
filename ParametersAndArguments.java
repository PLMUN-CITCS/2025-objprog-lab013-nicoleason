public class ParametersAndArguments {

    // Method to calculate area
    public static int calculateArea(int width, int height) {
        int area = width * height;
        return area;
    }

    // Main method
    public static void main(String[] args) {
        int roomWidth = 10;
        int roomHeight = 15;

        // Call calculateArea method
        int area = calculateArea(roomWidth, roomHeight);

        // Print the result
        System.out.println("The calculated area is: " + area);
    }
}