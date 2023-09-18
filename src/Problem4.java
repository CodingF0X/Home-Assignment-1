public class Problem4 {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
        +"Whether `tis nobler in the mind to suffer" 
        +" the slings and arrows of outrageous fortune,"
        +" or to take arms against a sea of troubles,"
        +" and by opposing end them?";

        String words [] = null;
        words = text.split(" ");
        String temp = null;
        boolean swapped = false;

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^a-zA-Z]", ""); // remove all non-alphabetical characters
        }

            for( int i =  0; i < words.length - 1 ; i++) {
                 swapped = false;
                for (int j = 0; j < words.length -1  ; j++) {
                    if (words[j].compareToIgnoreCase(words[j+1])>0){
                        temp = words[j];
                        words[j] = words[j+1];
                        words[j+1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped) {
                    break;
                }
    
            }
             for (String word : words) {
                System.out.println(word);
        }
         
    }
}
