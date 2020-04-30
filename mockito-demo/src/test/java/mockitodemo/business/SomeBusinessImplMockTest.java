//package business;
//
//import mockitodemo.business.DataService;
//import mockitodemo.business.SomeBusinessImpl;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//class SomeBusinessImplAnnotationTest {
//
//    @Test
//    void findTheGreatestFromAllData() {
//        DataService dataServiceMock = mock(DataService.class);
//        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
//        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
//        int result = someBusiness.findTheGreatestFromAllData();
//        assertEquals(24, result);
//    }
//
//    @Test
//    void findTheGreatestFromAllData_forOneValue() {
//        DataService dataServiceMock = mock(DataService.class);
//        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24});
//        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
//        int result = someBusiness.findTheGreatestFromAllData();
//        assertEquals(24, result);
//    }
//
//
//
//
//}
