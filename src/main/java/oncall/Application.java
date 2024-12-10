package oncall;

import oncall.controller.OncallController;
import oncall.service.OncallSerivce;

public class Application {
    public static void main(String[] args) {
        OncallSerivce oncallSerivce = new OncallSerivce();
        OncallController oncallController = new OncallController(oncallSerivce);
        oncallController.run();
    }
}
