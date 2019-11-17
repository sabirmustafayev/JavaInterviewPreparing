package group06;

public class ReversString {
    public static void main(String[] args) {

        String str = StringReverse("SABIR");
        System.out.println(str);
    }
        public static String StringReverse(String str2){
            String reversed = "";
            for (int i =  str2.length()-1; i >= 0 ; i--) {
                 reversed += str2.charAt(i);

            }


        return reversed;
    }
}
