import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Carbon14DatingTest {
    //#1 Build a test for calculateAge();
    @Test
    public void testCalculateAge(){
        Carbon14Dating test = new Carbon14Dating(50);
        test.calculateAge();

        assertEquals(5730, test.calculateAge());

    }


    /*
        #2 Build a test for setRemainingAmount() in the
        scenario the given remaining value is <= 1.
    */

   /*
        #3 Build a test for setRemainingAmount() in the
        scenario the given remaining value is >= 1.
    */

    // #4 Build a test for the toString() method.
}
