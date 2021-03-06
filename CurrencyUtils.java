package ebee.auction;

public class CurrencyUtils {
    
}

public class Currency {
    private static HashMap<String, Currency> listOfCurrencies;
    private static HashMap<String, Double> listOfVAT;
    
    public static Currency currencyByCountryCode(String country){
        return listOfCurrencies.getCurrency(country);
    }

    public static Double vatByCountryCode(Sring country){
        Double countryVat = listOfVAT.getVAT(country);
        return countryVat;
    }

    public static Double currencyRate(String fromCountry, String toCountry, Date today){
        MarketProvider mkt = reutersConnector();
        Double currencyRate = mkt.currencyRate(fromCountry, toCountry, today);
        if(currencyRate <= 0){
            currencyRate = 1.0;
        }
        return currencyRate;
    }
}
