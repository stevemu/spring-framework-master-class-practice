package business;

import mockitodemo.business.DataService;
import mockitodemo.business.SomeBusinessImpl;

import static org.junit.jupiter.api.Assertions.*;

//class SomeBusinessImplStubTest {
//
//    @org.junit.jupiter.api.Test
//    void findTheGreatestFromAllData() {
//        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub());
//        int result = someBusiness.findTheGreatestFromAllData();
//        assertEquals(3, result);
//    }
//}

//class DataServiceStub implements DataService {
//
//    @Override
//    public int[] retrieveAllData() {
//        return new int[]{1,2,3};
//    }
//}

//class DataServiceStub implements DataService {
//
//    @Override
//    public int[] retrieveAllData() {
//        return new int[]{};
//    }
//}
//
//
//class DataServiceStub implements DataService {
//
//    @Override
//    public int[] retrieveAllData() {
//        return new int[]{4};
//    }
//}