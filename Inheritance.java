package inherit_oop;
public class Inheritance
{
	public class father
	{
		public void wealth()
		{
			System.out.println("Father : I have one million");
		}
	}
	public class son extends father
	{
/// trail of inheritance
		public void wealth()
		{
			super.wealth(); /* it automatically getting the things from class father */
			System.out.println("Son : I will get one million once you die");
		}
/// trail of polymorphism
		public void speak()
		{
			System.out.println("Son : I am going to be rich");
		}
	}
/* seperate main */
	public void main (String[] args)
	{
		son i1 = new son();
		father i2= new father();
		i2.wealth();
		i1.speak();
		i1.wealth();
	}
}