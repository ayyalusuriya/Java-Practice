 class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Custom{
    int balance = 2000;

    void withdraw(double amount)
        throws InsufficientBalanceException {
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance..");
            }
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        }
    }


    class Main {
        public static void main(String[] args) {

            Custom c = new Custom();

            try{
                c.withdraw(20000);
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }

        }

}
