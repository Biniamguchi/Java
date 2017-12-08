public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across the right angle. 
        // calculate the value of c given legA and legB
        double a = legA * legA;
        double b = legB * legB;
        double c = Math.sqrt(a + b);
        return c;
    }
}
