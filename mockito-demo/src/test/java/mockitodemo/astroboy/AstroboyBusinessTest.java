package astroboy;

import mockitodemo.astroboy.AstroboyBusiness;
import mockitodemo.astroboy.AstroboyDataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AstroboyBusinessTest {

    @Test
    void findFirstName() {
        AstroboyDataServiceImpl astroboyDataServiceImpl = new AstroboyDataServiceImpl();
        AstroboyBusiness astroboyBusiness = new AstroboyBusiness(astroboyDataServiceImpl);
        String name = astroboyBusiness.findFirstName();
        assertEquals("chashui", name);
    }
}


class AstroboyDataServiceImpl implements AstroboyDataService {

    @Override
    public String[] getNames() {
        return new String[]{"chashui", "mulan"};
    }
}
