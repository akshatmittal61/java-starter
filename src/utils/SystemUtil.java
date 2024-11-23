package utils;

import java.time.OffsetDateTime;

public class SystemUtil {
    public static String getUtcTimestamp() {
        return OffsetDateTime.now().toString();
    }
    public static String getCurrentDir() {
        String currentDirPath = System.getProperty("user.dir");
        String[] parts = currentDirPath.split("/");
        String currentDir = parts[parts.length - 1];
        return currentDir;
    }
}
