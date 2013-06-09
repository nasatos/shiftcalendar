package shiftcalendar.data.controller.shiftdata;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestMap;

import shiftcalendar.data.service.ShiftDataService;

public class InputController extends Controller {

    private ShiftDataService service = new ShiftDataService();

    @Override
    public Navigation run() throws Exception {

        service.shiftData(new RequestMap(request));
//        return forward("input.jsp");
        return redirect(basePath);
    }
}
