package mB1.ch5;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class GetALLKEYVALUEpairs {

    public static void main(String[] a){
            Locale locale = new Locale("de");
            ResourceBundle rb = ResourceBundle.getBundle("mB1.ch5_source.Zoo", locale);
            Enumeration<String> bundleKeys = rb.getKeys();
                     while (bundleKeys.hasMoreElements()) {
                             String key = (String)bundleKeys.nextElement();
                             String value = rb.getString(key);
                             System.out.println("key = " + key + ", " + "value = " + value);
                    }

                   
        }
}

