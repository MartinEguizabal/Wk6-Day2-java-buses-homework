import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {

  Bus bus;
  Person passenger;
  BusStop bus_stop;

  @Before
  public void before(){
    bus = new Bus("Downtown", "blue", 100);
    passenger = new Person();
  }

  @Test
  public void hasDestination(){
    assertEquals("Downtown", bus.getDestination());
  }

  @Test
  public void hasTop_speed(){
    assertEquals(100, bus.getTop_speed());
  }

  @Test
  public void setColor(){
    bus.setColor("grey");
    assertEquals("grey", bus.getColor());
  }

  @Test
  public void noPassengersAtStart(){
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void passengersAdded(){
    bus.addPassenger(passenger);
    assertEquals(1, bus.passengerCount());
  }

  @Test public void busIsFull(){
    for(int i = 0; i < 12; i++){
      bus.addPassenger(passenger);
    }
    assertEquals(12, bus.passengerCount());
  }
}