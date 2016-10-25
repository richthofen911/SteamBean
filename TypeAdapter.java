/**
 * Created by yli on 25/10/16.
 */
public interface TypeAdapter<T> {
    T deserialize(String s);

    String serialize(T t);
}
