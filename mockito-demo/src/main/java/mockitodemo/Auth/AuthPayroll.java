package mockitodemo.Auth;

import java.util.ArrayList;

public class AuthPayroll {
    private EmployeeService employeeService;

    public AuthPayroll(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public ArrayList<Integer> getSalary() {
        Integer[] ids = employeeService.getIds();
        ArrayList<Integer> salaries = new ArrayList<Integer>();
        for (Integer id: ids) {
            salaries.add(id * 100);
        }
        return salaries;
    }


}
