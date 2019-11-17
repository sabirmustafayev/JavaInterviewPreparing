package group06;

import javax.swing.*;

public class FrequenceOfCharacters {
    public static void main(String[] args) {

        String str1  = FrequencyOfChars("AAABBBCCCD");
                            //                0123456789
        System.out.println(str1);
    }

       public           static      String        FrequencyOfChars(String str2) {
    // access modifier  specifier   retrun-type   method name      parameter

           String noDuplicated = "";


           for (int i=0; i < str2.length(); i++){

               if (!noDuplicated.contains(""+str2.charAt(i)))
               noDuplicated +=""+str2.charAt(i); // noDuplicated = ABCD
           }




                   String expectedResult = "";

                   for (int j = 0; j < noDuplicated.length();j++){
                       int count =0;

                       for (int i = 0; i < str2.length(); i++) {
                           if (str2.charAt(i) == noDuplicated.charAt(j))
                               count++;
                           }

                           expectedResult +=  noDuplicated.charAt(j)+""+count;
                       }
        return expectedResult;
    }
}
