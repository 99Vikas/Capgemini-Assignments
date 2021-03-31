

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

class Transaction {
    private Trader1 trader;
    private int year;
    private int value;

    public Transaction(Trader1 trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader1 getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String  toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
public class Assignment5Q4 {
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(new Comparator<Transaction>() {
                    @Override
                    public int compare(Transaction o1, Transaction o2) {
                        return  o1.getValue()-o2.getValue();
                    }
                })
                .collect(Collectors.toList());
    }

    public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {
        return null;
    }
    public static int highestTransaction(List<Transaction> transactions){
        return 0;
    }

    public static int smallestTransaction(List<Transaction> transactions){
        return 0;
    }

    public static void main(String[] args) {}
}