
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    public Money plus(Money addition){
        Money newMoney = new Money((this.euros + addition.euros), (this.cents + addition.cents));
        return newMoney;
    }
    public boolean lessThan(Money compared){
        if (this.euros < compared.euros){
            return true;
        }
        if (this.euros > compared.euros){
            return false;
        }
        if (this.cents < compared.cents){
            return true;
        }
        if (this.cents > compared.cents){
            return false;
        }
        return false;

    }
    public Money minus(Money decreaser){
        int newCents = this.cents - decreaser.cents;
        int remainder = 0;
        if (newCents < 0){
            remainder = -1;
            newCents = 100 + newCents;
        }
        int newEuros = this.euros - decreaser.euros + remainder;
        if (newEuros < 0){
            newEuros = 0;
            newCents = 0;
        }
        return new Money(newEuros, newCents);
        
    }
}
