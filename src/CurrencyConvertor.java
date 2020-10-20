public class CurrencyConvertor {

    double[] exchangeRates=new double[]{63.0,3.0,3.0,595.0,18.0,2.0};

    void setExchangeRates(double[] rates)
    {
        exchangeRates=rates;
    }

    void updateExchangeRates(int arrayIndex,double newVal)
    {
        exchangeRates[arrayIndex]=newVal;
    }

    double getExchangeRates(int arrayIndex)
    {
        return exchangeRates[arrayIndex];
    }

    double computeExchangeAmount(int arrayIndex,double amount)
    {
        return getExchangeRates(arrayIndex)*amount;
    }

    double computeTransferFee(int arrayIndex,double amount)
    {
        double amountTransferred=computeExchangeAmount(arrayIndex,amount);
        return 0.02*amountTransferred;
    }


    int rupee=63;
    int dirham=3;
    int real=3;
    int chilean_peso=595;
    int mexican_peso=18;
    int $yen=107;
    int _australian=2;


    void printCurrencies()
    {
        System.out.println("rupee: "+exchangeRates[0]);
        System.out.println("dirham "+exchangeRates[1]);
        System.out.println("real "+exchangeRates[2]);
        System.out.println("chilean_peso "+exchangeRates[3]);
        System.out.println("mexican_peso "+exchangeRates[4]);
        System.out.println("$yen "+exchangeRates[5]);
        System.out.println("_australian "+exchangeRates[exchangeRates.length-1]);
    }




    public static void main(String args[])
    {

        CurrencyConvertor currencyConvertor=new CurrencyConvertor();
        currencyConvertor.printCurrencies();
        double rates[]={63.0,3.0,3.0,595.5,18.0,107.20,2.0};

        currencyConvertor.setExchangeRates(rates);
        currencyConvertor.printCurrencies();

//        rates=new double[]{65.0,3.0,3.0,595.5,18.0,107.20,2.0};
//
//        currencyConvertor.setExchangeRates(rates);
//        currencyConvertor.printCurrencies();
//
//        System.out.println();
//        currencyConvertor.updateExchangeRates(0,66.0);
//        currencyConvertor.printCurrencies();

        double amount=currencyConvertor.computeExchangeAmount(0,1000);
        double tranferFee=currencyConvertor.computeTransferFee(0,1000);
       System.out.println("\nTransfer Amount: "+amount);
       System.out.println("\nTranferFee: "+tranferFee);
    }


}
