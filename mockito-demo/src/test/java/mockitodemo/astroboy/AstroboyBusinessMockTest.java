package astroboy;

import mockitodemo.astroboy.AstroboyBusiness;
import mockitodemo.astroboy.AstroboyDataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AstroboyBusinessMockTest {

    @Test
    void findFirstName() {
        AstroboyDataService astroboyDataServiceMock = mock(AstroboyDataService.class);
        when(astroboyDataServiceMock.getNames()).thenReturn(new String[] {"chashui", "b"});
        AstroboyBusiness astroboyBusiness = new AstroboyBusiness(astroboyDataServiceMock);
        String name = astroboyBusiness.findFirstName();
        assertEquals("chashui", name);
    }
}