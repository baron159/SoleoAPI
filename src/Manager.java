import java.net.HttpURLConnection;
import java.net.URL;

public class Manager 
{
	public Manager()
	{
		
	}
	
	public int GetResponse(String url)
	{
		HttpURLConnection connect = null;
		try{
			URL target = new URL(url);
			connect = (HttpURLConnection)target.openConnection();
			connect.setRequestMethod("POST");
			
		}
		
		return 0;
	}

}
