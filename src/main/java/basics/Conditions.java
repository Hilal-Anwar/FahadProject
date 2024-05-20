package basics;

import java.util.*;
import java.util.stream.Collectors;

public class Conditions
{
    public static void main(String[] args) {
       HashSet<String> currencySet= Currency.getAvailableCurrencies().
               stream().map(Currency::getCurrencyCode).collect(Collectors.toCollection(HashSet::new));
    }
}