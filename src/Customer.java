public class Customer {
    private int pin;
    private String name;

    public Customer(int pin, String name){
        this.pin = pin;
        this.name = name;
    }
    public int getPIN(){return pin;}
    public void setPin(int newPin){
        pin = newPin;
     }
    //used to set pin
    /*
    -get pin
    -their base values in checkings and savings accounts
    -their choice (of which choice they choose and which account; checkings or savings) will be initialized
    -^^(which will later be utilized in ATM functions)^^

     */
}
