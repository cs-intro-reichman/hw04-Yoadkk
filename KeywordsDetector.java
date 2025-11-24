
import java.awt.SystemColor;
import java.lang.ref.Cleaner;

public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);


    }

    public static boolean contains(String str1, String str2){

        String myString = "";
        String finalString = "";
        boolean isCont = false;


        for (int i = 0; i < str1.length(); i++) {
            myString += str1.charAt(i);
            if (str1.charAt(i) == 32){
                for (int j = 0; j < str2.length(); j++) {
                    if ((myString.charAt(j) == str2.charAt(j) && myString.length()-1 == str2.length())){
                        finalString += myString;
                        isCont = true;
                        break;
                        
                    }
                    else break;

                }
                myString = "";
            }

        }






        return isCont;
    }

    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {


            for (int j = 0; j < keywords.length; j++) {

            if (contains(sentences[i].toLowerCase(), keywords[j].toLowerCase()) == true){
                System.out.println(sentences[i]);

            }
                
                
            }
            
        }
    }




 }
