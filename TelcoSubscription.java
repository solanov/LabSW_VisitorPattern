public interface TelcoSubscription {
    String accept(UsagePromo promo, double price);
    String accept(UnliCallTextOffer unliPackage, boolean unliCallText);
    
    // Necessary for your main class to access these via the interface
    String getTelcoName();
    double getPromoPrice();
    boolean getUnliCallText();
}