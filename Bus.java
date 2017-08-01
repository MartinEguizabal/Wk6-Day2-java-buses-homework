class Bus {
  private String destination;
  private String color;
  private int top_speed;
  private Person[] passengers;

  public Bus(String destination, String color, int top_speed){
    this.destination = destination;
    this.color = color;
    this.top_speed = top_speed;
    this.passengers = new Person[12];
  }

  public String getDestination(){
    return this.destination;
  }

  public String getColor(){
    return this.color;
  }

  public int getTop_speed(){
    return this.top_speed;
  }

  public void setColor(String color){
    this.color = color;
  }

  public int passengerCount(){
    int count = 0;

    for(Person passenger : this.passengers){
      if(passenger != null){
        count++;
      }
    }
    return count;
  }

  public void addPassenger(Person passenger){
    if (busFull()){
      return;
    }
    int passengerAmount = passengerCount();
    passengers[passengerAmount] = passenger;
  }

  public boolean busFull(){
    return passengerCount() == passengers.length;
  }

}