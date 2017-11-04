package util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author aleff
 */
public class LimiteDigitos extends PlainDocument{

    private int qtdeMax;

    public LimiteDigitos(int maxLen) {
        super();
        if (maxLen <= 0) {
            throw new IllegalArgumentException("Especifique a quantidade!");

        }
        qtdeMax = maxLen;
    }
    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null || getLength() == qtdeMax) {
            return;
        }
        int quantiaTotal = (getLength() + str.length());
        if (quantiaTotal <= qtdeMax) {
            super.insertString(offset, str.replaceAll("[A-Z|a-z|2-9]", ""), attr);
            return;
        }
        String nova = str.substring(0,getLength()-qtdeMax);
        super.insertString(offset, nova, attr);
    }

}
