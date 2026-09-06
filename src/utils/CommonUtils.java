package utils;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.Supplier;

public class CommonUtils {

    public static final String DEFAULT_LOCALE = "en";

    public static boolean isNullOrEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty() || str.trim().equalsIgnoreCase("null");
    }
    public static boolean isNullOrEmpty(Map map) {
        return (map == null || map.isEmpty());
    }

    public static <T> T safely(Supplier<? extends T> supplier, T defaultValue) {
        try {
            return supplier.get();
        } catch (Throwable e) {
//            log.debug("Exception while executing: {}", supplier.getClass().getSimpleName());
            return defaultValue;
        }
    }

    public static <T> T safely(Optional<? extends T> supplier, T defaultValue) {
        return supplier.isPresent() ? safely(supplier::get, defaultValue) : defaultValue;
    }

    public static String getPidFromListingId(String listingId) {
        if (isNullOrEmpty(listingId) || listingId.length() < 12) {
            return null;
        }
        String pid = listingId.substring(3, listingId.length() - 6);
        if (pid.substring(0, 3).equals("BOK") || pid.substring(0, 3).equals("GVO")) {
            return pid.substring(3);
        }
        return pid;
    }

    public static String tryAndFetch(String defaultValue, Map<String, Object> map, String key) {
        if (map != null && map.containsKey(key)) {
            return (String) map.get(key);
        }
        return defaultValue;
    }

    public static String resolveLangId(String locale) {
        return locale != null ? locale : DEFAULT_LOCALE;
    }

    /*Join the set of string given using a delimiter */
    public static String join(String delimiter, String... keys) {
        if (keys == null) {
            return null;
        }

        StringJoiner sj = new StringJoiner(delimiter);
        for (String key : keys) {
            sj.add(key);
        }
        return sj.toString();
    }
}
