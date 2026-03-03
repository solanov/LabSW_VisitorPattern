public class TelcoAllowance implements UsagePromo{

    @Override
    public String showAllowance(String telcoName, double promoPrice) {
        if (telcoName.equals("Smart")) {
            return "P" + promoPrice + " for 15GB";
        } else if (telcoName.equals("Globe")) {
            return "P" + promoPrice + " for 10GB";
        } else if (telcoName.equals("Ditto")) {
            return "P" + promoPrice + " for 8GB";
        } else {
            return "Invalid Telco";
        }
    }
    
}
