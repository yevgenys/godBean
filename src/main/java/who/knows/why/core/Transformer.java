package who.knows.why.core;

import who.knows.why.model.MyUberModel;
import who.knows.why.model.RestModel;

public interface Transformer {

    MyUberModel transform(RestModel object);

}
