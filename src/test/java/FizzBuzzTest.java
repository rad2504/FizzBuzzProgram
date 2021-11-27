import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {
    
    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        
        fizzBuzz=new FizzBuzz();
    }
    
    @Test
    void shouldPrintSameValueIfInputIsOne()  {

        assertThat(fizzBuzz.printFizzBuzz(1),is("1"));
    }

    @Test
    void shouldPrintFizzIfInputIsThreeOrDivisibleByThree() {

        assertThat(fizzBuzz.printFizzBuzz(3),is("Fizz"));
    }

    @Test
    void shouldPrintBuzzIfInputIsFiveOrDivisibleByFive() {

        assertThat(fizzBuzz.printFizzBuzz(5),is("Buzz"));
    }

    @Test
    void shouldPrintBuzzIfInputIsDivisibleByThreeAndFive() {

        assertThat(fizzBuzz.printFizzBuzz(15),is("FizzBuzz"));
    }

    @Test
    void shouldPrintExceptionIfInputIsGreaterThanHundredOrLessThanOne() {

        assertThrows(IllegalArgumentException.class,()-> fizzBuzz.printFizzBuzz(101));
    }

    @Test
    void shouldPrintFizzIfInputContainsThree() {

        assertThat(fizzBuzz.printFizzBuzz(23),is("Fizz"));
    }

    @Test
    void shouldPrintBuzzIfInputContainsFive() {

        assertThat(fizzBuzz.printFizzBuzz(25),is("Buzz"));
    }

    @Test
    void shouldPrintFizzBuzzIfInputContainsFiveAndThree() {

        assertThat(fizzBuzz.printFizzBuzz(53),is("FizzBuzz"));
    }

}
