public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        double a = t1 + t2 + t3 + t4;
        return a;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        int roundAverage = Math.round((int)average);
        return roundAverage;
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        boolean isPassing = true;
        if (roundedAverage < 65) {
            isPassing = false;
        }
        else
            isPassing = true;
        return isPassing;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        double valueChange = shares * price;
        return valueChange;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        int roundValueChange = Math.round((int)totalStock);
        return roundValueChange;
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        /*
        123.01
        234.12

        123.01*100-> 12301%10 = 1 12301 % 100 = 01/10 -> 0 12301 % 1000 = 301 /100 -> 3
        */

        // remove 0.0 and return your answer
       int Dig1 = (int)userDouble + 1;
        int Dig2 = (int)userDouble  + 1;
        int Dig3 = (int)userDouble + 1;
        int Dig4 = (int)userDouble + 1;
        int Dig5 = (int)userDouble + 1;

        if (Dig1 == 10){
            Dig1 = 0;
        }
        if (Dig2 == 10){
            Dig2 = 0;
        }
        if (Dig3 == 10){
            Dig3 = 0;
        }
        if (Dig4 == 10){
            Dig4 = 0;
        }
        if (Dig5 == 10){
            Dig5 = 0;
        }
        double adjustDigits = (Dig1 + Dig2 + Dig3 + Dig4 + Dig5); */
        return adjustDigits;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(12.90));
        //23.01
    }

}
