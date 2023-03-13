package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TimeTest {

	@Test
	void testGetTotalSeconds() {
		fail("Not yet implemented");
	}		
	
	@Test
	public void testGetTotalSecondsBad()
	{
	assertThrows(
	StringIndexOutOfBoundsException.class,
	()-> {Time.getTotalSeconds("10:00");});
	}
	@ParameterizedTest
	@ValueSource(strings = { "05:00:00", "05:05:05", "05:59:59" })
	void testGetTotalSeconds(String candidate) {
	int seconds = Time.getTotalSeconds(candidate);
	assertTrue("The seconds were not calculated properly", seconds ==18305 || seconds ==18000 || seconds ==21599 );
	}
	@Test
	void testGetSeconds() {
		fail("Not yet implemented");
	}
	
	
	@ParameterizedTest

	@ValueSource(strings = { "05:00:00", "05:05:05", "05:59:59" })

	void testGetSeconds(String candidate) {

	int seconds = Time.getSeconds(candidate);

	assertTrue("The seconds were not calculated properly", seconds ==00 || seconds ==05 || seconds ==59 );

	}
	public void testGetSecondsBad()
	{

	assertThrows(

	StringIndexOutOfBoundsException.class,

	()-> {Time.getSeconds("10:00");});

	}

	@Test
	void testGetTotalMinutes() {
		fail("Not yet implemented");
	}
	@ParameterizedTest
	@ValueSource(strings = { "05:00:00", "05:05:05", "05:59:59" })
	void testGetTotalMinutes(String candidate) {
	int minutes = Time.getTotalMinutes(candidate);
	assertTrue("The minutes were not calculated properly", minutes ==00 || minutes ==05 || minutes ==59 );
	}
	@Test

	public void testGetTotalMinutesBad()

	{

	assertThrows(

	StringIndexOutOfBoundsException.class,

	()-> {Time.getTotalMinutes("08:0");});

	}

	@Test
	void testGetTotalHours() {
		fail("Not yet implemented");
	}
	@ParameterizedTest
	@ValueSource(strings = { "05:00:00", "05:15:15",
	"05:59:59" })
	void testGetTotalHours(String candidate) {
	int hours = Time.getTotalHours(candidate);
	assertTrue("The hours were not calculated properly", hours ==5);
	}
	@Test
	public void testGetTotalHoursBad()
	{
	assertThrows(
	StringIndexOutOfBoundsException.class,
	()-> {Time.getTotalHours("3");});
	}
	@Test

	public void testGetMillisecondsGood()

	{

	int milliseconds =

	Time.getMilliseconds("12:05:05:005");

	assertTrue("The milliseconds were not calculated properly", milliseconds==5);

	}
	
	@Test

	public void testGetTotalMillisecondsGood()

	{

	int milliseconds =

	Time.getTotalMilliseconds("05:05:05:005");

	assertTrue("The milliseconds were ("+milliseconds+") not calculated properly", milliseconds==18305005);

	}
}




