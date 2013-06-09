package shiftcalendar.data.controller.shiftdata;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class InputControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/shiftdata/input");
        InputController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/shiftdata/input.jsp"));
    }
}
