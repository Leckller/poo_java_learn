import java.util.Locale;

public class Language {
    public Locale loc = Locale.getDefault();

    void getLanguage() {
        System.out.println(loc.getLanguage());
        System.out.println(loc.getDisplayLanguage());
        System.out.println(loc.getDisplayCountry());
    }
}
