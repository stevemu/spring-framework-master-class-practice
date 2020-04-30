import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ListTest {

    @Test
    public void test() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10);
        assertEquals(10, listMock.size());
        assertEquals(10, listMock.size());
    }

    @Test
    public void test_multipleReturns() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10).thenReturn(20).thenReturn(30);
        assertEquals(10, listMock.size());
        assertEquals(20, listMock.size());
        assertEquals(30, listMock.size());
        assertEquals(30, listMock.size());
    }

    @Test
    public void testGet_specificParameter() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("SomeString");
        assertEquals("SomeString", listMock.get(0));
        assertEquals(null, listMock.get(1));

    }

    @Test
    public void testGet_genericParameter() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenReturn("SomeString");
        assertEquals("SomeString", listMock.get(0));
        assertEquals("SomeString", listMock.get(1));

    }


}