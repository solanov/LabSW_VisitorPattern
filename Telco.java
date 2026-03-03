public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;    
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText){
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        return promo.showAllowance(this.telcoName, price);
    }

    @Override
    public String accept(UnliCallTextOffer unliPackage, boolean unliCallText) {
        return unliPackage.showUnliCallsTextOffer(this.telcoName, unliCallText);
    }

    // Getters and Setters
    public void setDataAllowance(int dataAllowance){
        this.dataAllowance = dataAllowance;
    }

    public int getDataAllowance(){
        return dataAllowance;
    }

    public void setPromoPrice(double promoPrice){
        this.promoPrice = promoPrice;
    }

    public double getPromoPrice(){
        return promoPrice;
    }

    public void setTelcoName(String telcoName){
        this.telcoName = telcoName;
    }

    public String getTelcoName(){
        return telcoName;
    }

    public void setUnliCallText(boolean unliCallText){
        this.unliCallText = unliCallText;
    }

    public boolean getUnliCallText(){
        return unliCallText;
    }
}