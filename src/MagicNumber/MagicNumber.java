package MagicNumber;

public class MagicNumber {

    public static void main(String[] args){

        int myNumber = 1000;
        // myNumber is the original number

        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;

        System.out.println(magicNumber);





    }
}
