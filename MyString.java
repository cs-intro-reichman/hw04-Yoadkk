public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        char[] capLet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] lowcLet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        

        String lowcString = "";

        for (int i = 0 ; i < str.length() ; i++ ){
            for (int j=0 ; j < capLet.length ; j++){

                if (lowcLet[j] == str.charAt(i)){
                    lowcString += str.charAt(i);

                }
                
                else if (capLet[j] == str.charAt(i)){
                    lowcString += lowcLet[j];
                    
                }

                else if (str.charAt(i)>31 && str.charAt(i)<65 ){
                    lowcString += str.charAt(i);
                    break;

                }

                
                    
                


            }

        }
        return lowcString;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        boolean doesContain = false;
        String myString = "";
        //unhappy happy 
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                
                
                if (str1.charAt(i) == str2.charAt(j)){
                    myString += str2.charAt(j);


                }
                for (int k = 0 ; k < myString.length() ; k++){

                    if (myString.length() != str2.length()){
                        break;
                    }

                    else if (myString.charAt(k) != str2.charAt(k)){
                        doesContain = false;
                        break;
                    } 
                    else if (myString.charAt(k) == str2.charAt(k)){
                        doesContain = true;
                        break;
                    }

                }


            }
        }
        return doesContain;
    }
}
