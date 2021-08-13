/** Hot Hands
 * Project4
 * @author Mehjamila Bonny
 *@date February 28,2021
 */
public class HotHands {

    public static void main(String[] args) {

        int countOfTrials = 5000;
        int countOfTosses = 100;

        double sumOutcome = 0;
        //We loop the until the number of trials
        for (int i = 0; i < countOfTrials; i++) {
            //We instantiate a char result array every time we start a trial
            char[] results = new char[100];
            for (int j = 0; j < countOfTosses; j++) {
                double coinToss = Math.random();

                //This is the condition we determine if heads or tails <0.5 is h and >=0.5 is t
                //since probability of getting heads and tails is 50/50
                if(coinToss <0.5) {
                    //This is the Heads result
                    results[j] = 'h';
                } else {
                    //This is the tails result
                    results[j] = 't';
                }
            }

            //We initialize the values we need to determine here

            //This is for the hhhh
            double count4H = 0;

            //This is for the hhhhh
            double count5H = 0;

            //a counter to hold 'h' temporarily
            int tempCounter = 0;

           
            for (char c : results) {
                if(c == 'h') {
                    //add 1 to the counter each time get a head
                    tempCounter += 1;
                } else {
                    //reset the counter to 0 if we get a tails
                    tempCounter = 0;
                }

                //We always start the check if we got past 4 'h's
                if (tempCounter >= 4) {
                    //add counter to 4 Heads
                    count4H ++;
                    //check if the temp counter already has 5 'h's
                    if(tempCounter >= 5) {
                        //We add counter to 5 heads
                        count5H ++;
                    }
                }
            }

            //After the trial, we get the ratio of the results
            //We divide the number of five heads by four heads
            double ratio = count5H / count4H;
            //check if the result in NaN or Not A Number to avoid ArithmeticException
            if (Double.isNaN(ratio)) {
                //We default the value of ratio to 0.0 if the ratio is Not A Number
                ratio = 0.0;
            }

            //We print the result of the trial
            System.out.println(
                    "Trial #" + (i+1) +
                            " Count hhhh = " + count4H +
                            " Count hhhhh = " + count5H +
                            " Ratio = " + ratio);

          //adding sum of ratio of all trials
            sumOutcome = Double.sum(sumOutcome, ratio);
        }
        //compute for the average
        double average =  sumOutcome / countOfTrials;
        //print the average of the ratios after executing all trials
        System.out.println("Average ratio of trials is " + average);
    }
}