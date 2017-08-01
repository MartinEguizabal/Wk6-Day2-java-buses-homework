import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest {

  BusStop bus_stop;
  Person passenger;
  Bus bus;

  @Before
  public void before(){
    bus_stop = new BusStop("uptown");
    passenger = new Person();
  }

  @Test
  public void noPassengersAtStart(){
    assertEquals(0, bus_stop.queCount());
  }

  @Test
  public void testAddToBus(){
    assertEquals(1, bus.passengerCount());
  }



}

