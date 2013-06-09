package shiftcalendar.data.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ShiftDataTest extends AppEngineTestCase {

    private ShiftData model = new ShiftData();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
