import java.io.*;
public class Filespgm
{
	public static void main (String[] args)
	{
		File file_obj =new File("btr.cbl");
		try
		{
			if (file_obj.createNewFile())
			{
				System.out.println("File is created : " + file_obj.getName());
			}
			else
			{
				if (file_obj.exists())
					System.out.println("Files is alredy created and located in : " + file_obj.getAbsolutePath());
			}
		}
		catch (IOException e)
		{
			System.out.println("Issues in creating the files");
		}
	}
}