package tudelft.chocolate;

/*
  Package can store specified mass built from discrete smaller components.
  Components of package can be units of 1 or 5.
  Use multiples of 5 first, followed by multiples of 1 to achieve specified mass.
  Return a sentinal value of -1 if specified mass cannot delivered with on-hand components specified.
 */

public class ChocolateBags {

    public int calculate(int small, int big, int total) {
        int maxBigBoxes = total / 5;
        int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big;
        total -= (bigBoxesWeCanUse * 5);

        if(small < total)
            return -1;
        return total;

    }

}
