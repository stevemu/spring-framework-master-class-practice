package mockitodemo.Auth;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AuthPayrollTest {

    @Test
    void getSalary() {
        EmployeeService employeeService = mock(EmployeeService.class);
        when(employeeService.getIds()).thenReturn(new Integer[]{4,5,6});
        AuthPayroll authPayroll = new AuthPayroll(employeeService);

        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(400);
        result.add(500);
        result.add(600);

        assertEquals(result, authPayroll.getSalary());
    }
}