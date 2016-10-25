import java.util.Map;

/**
 * Created by yli on 25/10/16.
 */
public interface JsonObjectFactory {
    /**
     * Called when a Json object is about to create. Expect a Map object.
     *
     * @return Java Map object.
     */
    Map<String, Object> createJsonObject();
}
