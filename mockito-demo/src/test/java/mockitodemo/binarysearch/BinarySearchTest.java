package mockitodemo.binarysearch;

import mockitodemo.MockitoDemoApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.jupiter.api.Assertions.*;

// load the context
//@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = MockitoDemoApplication.class)
@SpringBootTest
class BinarySearchTest {

    // get this bean from the context
    @Autowired
    private BinarySearch binarySearch;

    @Test
    void testBasicScenario() {

//        System.out.println(binarySearch);
        int actualResult = binarySearch.search(new int[]{}, 5);
        assertEquals(5, actualResult);
    }




}