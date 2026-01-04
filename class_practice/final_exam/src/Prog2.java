import java.util.Scanner;

class CashCard {
    Integer card = 0;

    void topUp(Integer num) {
        this.card += num;
    }

    void deduct(Integer num) {
        if (this.card - num < 0) {
            System.out.println("error");
        } else {
            this.card -= num;
        }
    }

    void showBalance() {
        System.out.println(this.card);
    }

}

public class Prog2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CashCard card = new CashCard();
        while(true){
            switch (scanner.nextInt()) {
                case 1: card.topUp(100); break;
                case 2: card.deduct(10); break;
                case 3: card.deduct(50); break;
                case 4: card.showBalance();break;
                case 9: System.exit(0);
                default: break;
            }
        }
    }
}
