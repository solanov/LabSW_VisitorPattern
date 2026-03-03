public class UnliCallTextPackage implements UnliCallTextOffer {
  
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (telcoName.equals("Smart") && !unliCallText) {
            return "No free calls and texts.";
        } else if (telcoName.equals("Globe") && unliCallText) {
            return "Free calls and texts to same network.";
        } else if (telcoName.equals("Ditto") && unliCallText) {
            return "Free calls and texts to all networks.";
        } else {
            return "Invalid Telco";
        }

    }
    
}
