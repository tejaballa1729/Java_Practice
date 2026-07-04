package btr_inc;
public class Insurance_Client
{
	public static void main(String[] args)
	{
		Insurance_Admin i = new Insurance_Admin();
		String a = "00000000003";
		String b = "Balla Teja Rao";
		float c = 35000.00f;
		i.policy_num = a;
		i.insured_name= b;
		i.policy_Print(i);
		
	}
}