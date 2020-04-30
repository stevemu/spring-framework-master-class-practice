package mockitodemo.astroboy;

public class AstroboyBusiness {
    private AstroboyDataService dataService;

    public AstroboyBusiness(AstroboyDataService dataService) {
        this.dataService = dataService;
    }

    public String findFirstName() {
        return dataService.getNames()[0];
    }
}


