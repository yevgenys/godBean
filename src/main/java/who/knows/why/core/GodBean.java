package who.knows.why.core;

import org.springframework.stereotype.Component;
import who.knows.why.model.MyUberModel;
import who.knows.why.model.RestModel;

import java.util.UUID;

@Component
public class GodBean implements Transformer, Verifier, Dao, IGodBean {

    @Override
    public MyUberModel create(MyUberModel model) {
        System.out.println("I'm saving something");
        model.id = UUID.randomUUID();
        return model;
    }

    @Override
    public void verify(MyUberModel model) {
        System.out.println("I'm verifing something");
    }

    @Override
    public MyUberModel transform(RestModel object) {
        return new MyUberModel(object.say);
    }
}
