package coe.unosquare.util;

import java.util.HashSet;
import java.util.Set;

public class RegistrationService {

    private Set<String> uniqueIds;
    private static RegistrationService localInstance;
    private RegistrationService() {
        uniqueIds = new HashSet<>();
    }

    public static RegistrationService getInstance() {
        if(localInstance == null){
            localInstance = new RegistrationService();
        }
        return localInstance;
    }

    public boolean register(String uniqueId) {
         if(!uniqueIds.contains(uniqueId)) {
             uniqueIds.add(uniqueId);
             return true;
         }
         return false;
    }

    public boolean isRegistered(String uniqueId) {
        return uniqueIds.contains(uniqueId);
    }
}
