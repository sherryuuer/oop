package flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebsiteFactory {
    private Map<String, Website> flyweights = new HashMap<>();

    public Website getWebsiteCategory(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebsite(key));
        }
        return flyweights.get(key);
    }

    public int getWebsiteCount() {
        return flyweights.size();
    }
}
