import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class MyMathTest {
    MyMath myMath = new MyMath();

    @BeforeEach
    public void before() {
        System.out.println("before");
        MyMath.counter = 0;

    }
//
//    @AfterEach
//    public void afterEach() {
//        System.out.println("after");
//    }

//    @BeforeAll
//    public static void ba() {
//        System.out.println("befoe all");
//        MyMath.counter = 0;
//    }

    @Test
    void sum_with3numbers() {
//        System.out.println(myMath);
//        System.out.println("test1");
        assertEquals(6, myMath.sum(new int[]{1,2,3}));
        assertEquals(1, myMath.counter);
//        System.out.println(myMath.counter);
    }

    @Test
    void sum_with1numbers() {
//        System.out.println(myMath);
//        System.out.println("test2");
        assertEquals(3, myMath.sum(new int[]{3}));
        assertEquals(1, myMath.counter);
//        System.out.println(myMath.counter);

    }
}