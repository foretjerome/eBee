package ebee.auction;

public class AuctionFlow {
    private Date openingTime;
    private Date closingTime;
    
    public void startAuction(Item item) {
        Date currentTime = Date.now();
        if(currentTime < openingTime){
            return 0.0;
        }
        Buyer bestBuyer = null;
        while(currentTime < closingTime){
            bestBuyer = acquireBets(item);
        }
        
        distributeCash(bestBuyer, item);
    }

    public Buyer acquireBets(Item item){
        List<Buyer> bettors = User.all(item);
        User maxBettor = null;
        for(User bettor : bettors){
            if(maxBettor == null){
                maxBettor = bettor;
            }
            if(bettor.bet > maxBettor.bet){
                maxBettor.bet = bettor.bet;
            }
        }
        item.lastBuyerBet = maxBettor.bet;
        return maxBettor;
    }

    public void distributeCash(Buyer lastBuyer,Item item){
        Double fees = eBee.eBeeEndOfAuction(item);
        Double toWithdraw = lastBuyer.buyerEndOfAuction(item);
        Double toPay = item.owner.sellerEndOfAuction(item, fees);
    }
}
