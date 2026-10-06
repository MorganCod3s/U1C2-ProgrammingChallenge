public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        double a = (t1 + t2 + t3 + t4)/4;
        return a;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer

        //90.2 + 0.5 -> 90.7 (int) -> 90
        //90.5 + 0.5-> 91 (int) -> 91
        int roundAverage = (int) (average+0.5);
        return roundAverage;
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        boolean isPassing = true;
        if (roundedAverage < 65) {
            isPassing = false;
        }
        else{
            isPassing = true;
        }
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
        // remove 0 and return your answer  //90.8 -> 91.0 -> 91
        int roundValueChange = (int)Math.round(totalStock);
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
        int shifted = (int)(userDouble*100); //123.45 -> 12345
       int Dig1 = (int)(shifted/10000 + 1)%10;
        int Dig2 = (int)(shifted%10000/1000 + 1)%10;
        int Dig3 = (int)(shifted%1000/100 + 1)%10;
        int Dig4 = (int)(shifted%100/10 + 1)%10;
        int Dig5 = (shifted%10 + 1)%10;

        

        Dig1 = Dig1*100;
        Dig2 = Dig2*10;
        Dig3 = Dig3*1;
        double Dig4dec = (double)Dig4/10;
        double Dig5dec = (double)Dig5/100;
        double newNum= Dig1 + Dig2 + Dig3 + Dig4dec + Dig5dec;
        return newNum;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(123.90));
        //23.01
    }

}
