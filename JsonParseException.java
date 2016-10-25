/**
 * Created by yli on 25/10/16.
 */
public class JsonParseException extends JsonException {

    private final int errorIndex;

    public JsonParseException(String message, int errorIndex){
        super(message);
        this.errorIndex = errorIndex;
    }

    public JsonParseException(String message){
        this(message, -1);
    }

    /**
     * Get char index of current position when error occurred
     * @return
     */
    public int getErrorIndex(){
        return this.errorIndex;
    }
}
