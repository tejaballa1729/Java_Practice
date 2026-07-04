import java.time.LocalTime ;
import java.time.LocalDateTime ;
class TimesNow
{
	public static void main (String[] args)
	{
		LocalTime i =LocalTime.now();
		LocalDateTime j =LocalDateTime.now();
		System.out.println(i);
		System.out.println(j);
	}
}