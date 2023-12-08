package class9;
/*
Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
Then print all values from that array using 2 different loops and calculate how many total countries been stored.
 */
public class Hw3 {
    public static void main(String[] args) {

        System.out.println("Nested Loops:");
        String [][] countries={
                {"Mexico", "United States", "Canada"},
                {"Argentina", "Brazil", "Colombia"},
                {"Portugal", "Italy", "Germany"},
                {"Japan", "China", "India"},
                {"Uganda", "Rwanda", "Morocco"}
        };
        int totalCountries=0;
        for(int i=0; i< countries.length; i++){
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                totalCountries++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total countries sorted are "+totalCountries);
        System.out.println();
        System.out.println("Enhanced Loop:");
        int total=0;
        for(String[] country:countries){
            for(String c:country){
                System.out.print(c+" ");
                total++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total countries are "+total);
        }
    }

