import java.io.IOException;
import java.io.Reader;

/**
 * Created by yli on 25/10/16.
 *
 * An easy way to read(peek) or fetch next char, and auto-fill its buffer
 */
public class CharReader {

    static final int BUFFER_SIZE = 1024;

    int readed = 0;

    int pos = 0;

    int size = 0;

    final char[] buffer;
    final Reader reader;

    public CharReader(Reader reader){
        this.buffer = new char[BUFFER_SIZE];
        this.reader = reader;
    }

    public boolean hasMore() throws IOException{
        if(pos < size)
            return true;

        fillBuffer(null);
        return pos < size;
    }

    public String next(int size) throws IOException{
        StringBuilder stringBuilder = new StringBuilder(size);
        for(int i = 0; i < size; i++)
            stringBuilder.append(next());
        return stringBuilder.toString();
    }

    public char next() throws IOException{
        if(this.pos == this.size)
            fillBuffer("EOF");
        char ch = this.buffer[this.pos];
        this.pos++;
        return ch;
    }

    public char peek() throws IOException{
        if(this.pos == this.size)
            fillBuffer("EOF");
        assert(this.pos < this.size);
        return this.buffer[this.pos];
    }

    void fillBuffer(String eofErrorMessage) throws IOException{
        int n = reader.read(buffer);
        if(n == (-1)){
            if(eofErrorMessage != null)
                throw new JsonParseException(eofErrorMessage, this.readed);
            return;
        }
        this.pos = 0;
        this.size = n;
        this.readed += n;
    }
}
