import java.util.Map;
import java.util.HashMap;

public class UnliCallTextPackage implements UnliCallTextOffer {
    private static final Map<String, String> unliMessages = new HashMap<>();

    static {
        unliMessages.put("Smart", "No free calls and texts."); 
        unliMessages.put("Globe", "Free calls and texts to same network.");
        unliMessages.put("Ditto", "Free calls and texts to all networks.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return unliMessages.getOrDefault(telcoName, "Invalid Telco");
    }
}