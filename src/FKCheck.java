import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import utils.CommonUtils;
import utils.Logger;

public class FKCheck {

    public static String checkIid() {
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

    public static String extractString(Map<String, Object> map, String key) {
        return CommonUtils.safely(() -> {
            return Optional.ofNullable(map)
                .map(m -> m.get(key))
                .filter(String.class::isInstance)
                .map(String.class::cast)
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .orElse(null);
        }, null);
    }

    public static String check() {
        List<String> ans = new ArrayList<>();
        ans.add(extractString(Map.of("iid", "LST123"), "iid"));
        ans.add(extractString(Map.of(" iid ", "LST123"), "iid"));
        ans.add(extractString(Map.of("iid", " LST123 "), "iid"));
        // ans.add(extractString(Map.of("iid", "LST123", "iid", "LST456"), "iid"));
        return CommonUtils.join("\n", ans.toArray(new String[0]));
    }

    public static void main(String[] args) {
        Logger.info(check());
    }
}
