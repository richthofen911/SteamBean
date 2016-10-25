import java.util.HashMap;
import java.util.Map;

/**
 * Created by yli on 25/10/16.
 */
public class TypeAdapters {
    Map<String, TypeAdapter<?>> adapters = new HashMap<String, TypeAdapter<?>>();

    public <T> void registerTypeAdapter(Class<T> clazz, TypeAdapter<T> typeAdapter){
        adapters.put(clazz.getName(), typeAdapter);
    }

    TypeAdapter<?> getTypeAdapter(Class<?> clazz){
        return (TypeAdapter<?>) adapters.get(clazz.getName());
    }
}
