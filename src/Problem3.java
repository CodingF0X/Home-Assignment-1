public class Problem3 {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
            +"Whether `tis nobler in the mind to suffer" 
            +" the slings and arrows of outrageous fortune,"
            +" or to take arms against a sea of troubles,"
            +" and by opposing end them?";
            int spaces = 0;
            int vowels = 0;
            int letters = 0;

            for (char c : text.toCharArray()) {
                if (c ==' ') {
                    spaces++;
                } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    letters++;
                }
            }
            // System.out.println("number of letters = " + letters);
            System.out.println("The text contained vowels: " + vowels + "\n" + "Constants : " + (letters - vowels ) +"\n" + "Spaces : " + spaces );
           
          
    }
}
