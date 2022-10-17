import java.util.Scanner;

public class Stock {
    static String stockName;
    static int stockPrice;
    static int shareNumber;

    public Stock(String stockName, int stockPrice, int shareNumber) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.shareNumber = shareNumber;
    }

    public static void addStock(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter stock name:");
        stockName=sc.next();
        System.out.println("Enter number of Stock:");
        shareNumber=sc.nextInt();
        System.out.println("Enter share price:");
        shareNumber=sc.nextInt();
    }
    public static void print(){
        System.out.println("Stock Name:"+stockName);
        System.out.println("Stock Number:"+shareNumber);
        System.out.println("Stock Price:"+stockPrice);
    }
    public static void buyStock(){
        int totalValue=0,numberOfStock;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of stocks you want to buy:");
        numberOfStock = sc.nextInt();
        System.out.println("Current stocks:"+shareNumber);
        totalValue=shareNumber-numberOfStock;
        System.out.println("Remaining Stocks:"+totalValue);
    }
}
