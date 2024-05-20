public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPeriemter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPeriemter(int radius) {
        double perimeter = 2 * Math.PI  * radius;
        return perimeter;
    }

    private static double getBaseArea(int radius) {
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }
}