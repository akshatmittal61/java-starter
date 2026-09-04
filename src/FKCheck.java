import java.util.Arrays;
import java.util.List;
import utils.Logger;

public class FKCheck {

    public static String check() {
        String slotId = "1";
        String widgetType = "ATLAS_CHECK";
        // String entityId = "LST123";
        String entityId = null;
        String reqId = "1-2-3-4";

        List<String> params = Arrays.asList(slotId, widgetType, entityId, reqId);

        // return String.join(".", slotId, widgetType, entityId, reqId);
        return params.stream()
            // .filter(p -> p != null && !p.toString().isEmpty())
            .map(p -> p == null || p == "" ? "" : p)
            .map(Object::toString)
            .collect(java.util.stream.Collectors.joining("."));

    }

    public static void main(String[] args) {
        Logger.info(check());
    }
}
