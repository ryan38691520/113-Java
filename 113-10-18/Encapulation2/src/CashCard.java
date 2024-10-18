class CashCard {
    String number;
    int balance;
    int bonus;

    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    void store(int money){
        if(money>0){
            if(money >= 1000){
                this.balance += money/1000;
            }else{
                System.out.println("儲值金額為負，來亂的!");
            }
        }
    }
    void charge(int money){
        if(money > 0){
            if(money <= this.balance){
                this.balance -= money;
            }
            else{
                System.out.println("餘額不足，可憐阿");
            }
        }
        else{
            System.out.println("扣除金額為負，來亂的");
        }
    }
    int exchange(int bouns){
        if(bouns > 0){
            this.bonus -= bouns;
        }
        return this.bonus;
    }
}
