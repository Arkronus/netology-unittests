import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class HamcrestTest {
    @Test
    void containsHamcrest(){
        List<String> list = Arrays.asList("hello", "netology", "world");
        Matchers.contains(list, Matchers.hasItems("hello", "netology"));
    }

    @Test
    void closeToHamcrest(){
        MatcherAssert.assertThat(10.3, Matchers.closeTo(10.3, 0.3));
    }
}
