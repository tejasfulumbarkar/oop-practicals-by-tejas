interface Vechical {
 
    void changeGear(int newgear);
    void speedUp( int increase);
    void applyBrakes( int decrese);

}

class Bike implements Vechical{
private int speed =0;
private int gear =0;
    public void changeGear(int newgear){
      gear = newgear;
      System.out.println( " bikes gear changed");
    }
    public void speedUp( int increase){
      speed +=increase;
      System.out.println( " bikes speed increased ");
    }
    public void applyBrakes( int decrese){
     speed-=decrese;
     System.out.println( " bukes speed decresseed");
    }

}

class Practical5 {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.changeGear(5);
        b1.speedUp(40);
        b1.applyBrakes(7);
    }
}