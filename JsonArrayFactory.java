import java.util.List;

/**
 * Created by yli on 25/10/16.
 */
public interface JsonArrayFactory {
    /**
     * Called when a Json object is about to create. Expects a List object.
     *
     * @return A Java List object.
     */
    List<Object> createJsonArray();
}
