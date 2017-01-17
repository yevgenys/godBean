package who.knows.why.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import who.knows.why.model.MyUberModel;
import who.knows.why.model.RestModel;
import who.knows.why.service.RestService;

@RestController
@RequestMapping(value = "/rest/v1/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public class RestCtrl {

    private RestService service;

    @Autowired
    public RestCtrl(RestService service) {
        this.service = service;
    }

    @RequestMapping(value = "echoSay")
    public MyUberModel userSaid(@RequestBody RestModel restModel) {
        return service.doSomething(restModel);
    }

}
