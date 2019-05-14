package project01.services;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public enum ResourceManagerModel {

    RESOURCE_MANAGER_INSTANCE;

    private ResourceBundle resourceBundle;

    private final String resource = "project01/text";

    ResourceManagerModel(){
        resourceBundle = ResourceBundle.getBundle(resource, Locale.getDefault());
    }

    public void changeResource(Locale locale){
        resourceBundle = ResourceBundle.getBundle(resource, locale);
    }

    public String getValue(String key){
        try {
            return new String(resourceBundle.getString(key).getBytes("ISO-8859-1"), "CP1251");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
