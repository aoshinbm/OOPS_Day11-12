public class Bank {
    static int balance=100000;
        int amount;
        Bank(int amount){
            this.amount=amount;
        }

        void debit(){
            if (amount>balance){
                System.out.println("Debit amount exceeded account balance.");
            }
            else {
                balance=balance-amount;
                System.out.println("Amount has debited.");
                System.out.println("Account balance is "+balance);
            }
        }

        public static void main(String[] args) {
            System.out.println("BANK ACCOUNT ");

            Bank obj=new Bank(25000);
            obj.debit();

            Bank obj1=new Bank(50000);
            obj1.debit();

            Bank obj3=new Bank(60000);
            obj3.debit();
        }
    }