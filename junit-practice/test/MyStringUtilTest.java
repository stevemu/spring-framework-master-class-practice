import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStringUtilTest {

    MyStringUtil myStringUtil = new MyStringUtil();

    @Test
    void concat() {
        assertEquals("aabb", myStringUtil.concat("aa", "bb"));
    }
}