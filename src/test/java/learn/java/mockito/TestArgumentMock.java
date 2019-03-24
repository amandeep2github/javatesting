package learn.java.mockito;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

public class TestArgumentMock {

    @Test
    public void testMapPassedAsArgMocked(){
        ClassToMock ctm = Mockito.mock(ClassToMock.class);
        Map<String, Integer> mapArg = new HashMap<>();
        Map<String, Integer> retVal = new HashMap<>();
        retVal.put("One", Integer.valueOf(1));
        when(ctm.addToMap(mapArg)).thenReturn(retVal);

        assertThat(ctm.addToMap(mapArg)).containsKeys("One");
    }
}
