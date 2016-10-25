/**
 * Created by yli on 25/10/16.
 */

/**
 * All types of token read by TokenReader
 */

enum Token {

    END_DOCUMENT,

    BEGIN_OBJECT,
    END_OBJECT,

    BEGIN_ARRAY,
    END_ARRAY,

    SEP_COLON,
    SEP_COMMA,

    STRING,

    BOOLEAN,

    NUMBER,

    NULL
}
