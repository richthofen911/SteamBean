

/**
 * Created by yli on 17/10/16.
 */
public class JsonReader {

    final TokenReader reader;
    final JsonObjectFactory jsonObjectFactory;
    final JsonArrayFactory jsonArrayFactory;
    final ObjectMapper objectHook;
    final TypeAdapters typeAdapters;

    public Object parse(){
        Stack stack = new Stack();
        int status = STATUS_EXPECT_SINGLE_VALUE | STATUS_EXPECT_BEGIN_OBJECT | STATUS_EXPECT_BEGIN_ARRAY;
    }
}
