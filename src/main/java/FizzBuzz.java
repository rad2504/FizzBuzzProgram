
public class FizzBuzz {

    public String printFizzBuzz(int value) {
        
        if(value<1 || value>100) {
            throw new IllegalArgumentException("Input should be in range of One To Hundred");
        }
        
        int storingCopyOfValue=value,digitIsThree=0;
        while (storingCopyOfValue>0)
        {
           int lastDigit=storingCopyOfValue%10;
           if(lastDigit==3)
           {
               digitIsThree=1;
               break;
           }
           storingCopyOfValue=storingCopyOfValue/10;
        }
        
        int storingCopyOfValue1 =value,digitIsFive=0;
        while (storingCopyOfValue1>0)
        {
            int lastDigit=storingCopyOfValue1%10;
            if(lastDigit==5)
            {
                digitIsFive=1;
                break;
            }
            storingCopyOfValue1=storingCopyOfValue1/10;
        }
        
        if((value%3==0 &&value%5==0) || (digitIsThree==1 && digitIsFive==1))
        {
            return "FizzBuzz";
        }
        
        else if(value%3==0 || digitIsThree==1)
        {
            return "Fizz";
        }
        
        else if(value%5==0 || digitIsFive==1)
        {
            return "Buzz";
        }
        
        else
        {
            return String.valueOf(value);
        }

    }
}
