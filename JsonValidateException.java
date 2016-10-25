/**
 * Created by yli on 25/10/16.
 */
public class JsonValidateException extends JsonException {
    private final String code;
    private final String path;

    public JsonValidateException(String code, String path) {
        super("Validation failed: " + path + ", not satisfied by: " + code);
        this.code = code;
        this.path = path;
    }

    public JsonValidateException(String code, String path, Throwable cause) {
        super("Validation failed: " + path + ", not satisfied by: " + code, cause);
        this.code = code;
        this.path = path;
    }

    String getCode() {
        return this.code;
    }

    String getPath() {
        return this.path;
    }
}
