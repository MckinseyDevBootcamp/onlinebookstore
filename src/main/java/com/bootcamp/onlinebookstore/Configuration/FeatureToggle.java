package com.bootcamp.onlinebookstore.Configuration;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FeatureToggle {
    Map<String, Boolean> features = new HashMap<>();
    public Boolean isEnabled(String featureName){
        return features.get(featureName);
    }

    public void setFeatureToggle(String featureName, Boolean isEnabled) {
        features.put(featureName, isEnabled);
    }
}
