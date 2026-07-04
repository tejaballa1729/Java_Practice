package btr_inc;
public class Insurance_Admin
{
	String policy_num="000000000000000";
	String insured_name="                     ";
	private float face_value = 15000.00f;
	public void policy_Print(Insurance_Admin i)
	{
		System.out.println(i.policy_num);
		System.out.println(i.insured_name);
		System.out.println(i.face_value);
	}
	public static void main(String[] args)
	{
	String a = "00000000002";
	String b = "Balla Teja";
	float c = 25000.00f;
	Insurance_Admin abcd = new Insurance_Admin();
/*	abcd.policy_num = "0000000001";
	abcd.insured_name= "Tejeswara Rao";
	abcd.face_value = 15000.00f; */
	abcd.policy_num = a;
	abcd.insured_name= b;
	abcd.face_value = c;
	abcd.policy_Print(abcd);

	}
}