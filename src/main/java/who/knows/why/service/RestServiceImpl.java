package who.knows.why.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import who.knows.why.core.Dao;
import who.knows.why.core.IGodBean;
import who.knows.why.core.Transformer;
import who.knows.why.core.Verifier;
import who.knows.why.model.MyUberModel;
import who.knows.why.model.RestModel;

@Service
public class RestServiceImpl implements RestService {
    private IGodBean godBean;

    @Autowired
    public RestServiceImpl(IGodBean godBean) {
        this.godBean = godBean;
    }

    @Override
    public MyUberModel doSomething(RestModel restModel) {
        MyUberModel innerModdel = ((Transformer) godBean).transform(restModel);
        ((Verifier) godBean).verify(innerModdel);
        return ((Dao) godBean).create(innerModdel);
    }
}
