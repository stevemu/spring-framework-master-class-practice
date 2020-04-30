package business;

import mockitodemo.business.DataService;
import mockitodemo.business.SomeBusinessImpl;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//@RunWith(MockitoJUnitRunner.class)
class BusinessAnnotationTest {

    @BeforeEach
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    DataService dataService;

    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    void findTheGreatestFromAllData() {
//        System.out.println(dataService);
        when(dataService.retrieveAllData()).thenReturn(new int[] {24,15,3});
        assertEquals(24, someBusiness.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_forOneValue() {
        when(dataService.retrieveAllData()).thenReturn(new int[] {24});
        assertEquals(24, someBusiness.findTheGreatestFromAllData());
    }




}
