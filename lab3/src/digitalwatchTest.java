import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class digitalwatchTest {
    digitalwatch x;
    String s;
    @Nested
    class buttomUp {
        @BeforeEach
        public void init() {
            x = new digitalwatch();
        }
        @Test
        public void Driver1(){
            s = x.Input('a');
            System.out.println("todays date is "+ s);
            assertEquals("todays date is "+ s,"todays date is "+ x.Y+"-"
                    +x.M+"-"+x.D);
        }
        @Test
        public void Driver2(){
            s = x.Input('a');
            s = x.Input('a');
            System.out.println("it is "+ s);
            assertEquals("it is "+ s,"it is "+ x.h+":"+x.m);
        }
        @Test
        public void Driver3(){
            digitalwatch x = new digitalwatch();
            String[][] times = new String[5][2];
            x.Input('c');
            for(int i = 0 ; i < 5 ; i ++) {
                System.out.print(x.state2);
                times[i][0] = (x.DisplayDate() + " " + x.DisplayTIME());
                x.Input('b');
                x.Input('a');
                times[i][1] = (x.DisplayDate() + " " + x.DisplayTIME());
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(times[i][j] + " ");
                }
                System.out.println();
            }}
        @AfterEach
        public void erase(){
            x=null ;
        }
    }
}