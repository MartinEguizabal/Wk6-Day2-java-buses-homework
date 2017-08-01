class BusStop{
  private String location;
  private Person[] que;

  public BusStop(String location){
    this.location = location;
    this.que = new Person[10];
  }

  public int queCount(){
    int count = 0;

    for (Person passenger : this.que){
      if (passenger != null){
        count++;
      }
    }
    return count;
  }

  public void addToBus(){
    if (queEmpty()){
      return;
    }
    int queAmount = queCount();
    que[queAmount] = null;
    bus.addPassenger(Person passenger);
  }

  // issue above

  public boolean queEmpty(){
    return queCount() == 0;
  }


}