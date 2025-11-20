public class Primes {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        int counter = 0;

        System.out.println("Prime numbers up to " + n +":");

        for (int i = 2; i < n+1; i++) {

            for (int j = 2; j <= i; j++){
                
  

                if ((i%j == 0)){
                    if (i ==j) {
                        System.out.println(j);
                        counter++;
                    }
                    if(i != j) break;
                      
                }
                else if (j%i == 0 && i == j){
                System.out.println(j + "j " + i +"i");
                
                }
            }

        }
        double percent = ((double)counter/(double)n)*100 ;
        System.out.println("There are " + counter + " primes between 2 and " + n + (" (" + (int)percent + "% are primes)"));
    }
}