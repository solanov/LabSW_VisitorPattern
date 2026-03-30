import java.util.Map;
import java.util.HashMap;

public class TelcoAllowance implements UsagePromo {
    private static final Map<String, String> allowanceMap = new HashMap<>();

    static {
        allowanceMap.put("Smart", "15GB");
        allowanceMap.put("Globe", "10GB");
        allowanceMap.put("Ditto", "8GB");
    }

    @Override
    public String showAllowance(String telcoName, double promoPrice) {
        String allowance = allowanceMap.getOrDefault(telcoName, "0GB");
        
        if (allowance.equals("0GB")) {
            return "Invalid Telco";
        }
        
        return "P" + promoPrice + " for " + allowance;
    }
}