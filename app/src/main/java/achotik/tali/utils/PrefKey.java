package achotik.tali.utils;

public class PrefKey {
    public static  String TOKEN = "token";


    public PrefKey(String string) {
    }

    public static String getTOKEN() {
        return TOKEN;
    }

    public static void setTOKEN(String TOKEN) {
        PrefKey.TOKEN = TOKEN;
    }


}
