public class Problem2 {
    public static void main(String[] args) {
        int nValues = 50;
        // boolean isPrime = true;
        outerLoop:
        for(int i = 2; i <= nValues; i++){
        // isPrime = true; 
         for (int j = 2; j < Math.sqrt(i); j++){
            if (i % j == 0)
            {
            continue outerLoop; // the outer loop will terminate for the current number as soon as non prime number is found.
            }
        }
        // if (isPrime)
         System.out.println(i);
        }
    }
}
