import com.soleo.lsapi.*;
import com.soleo.lsapi.controllers.ProductionController;
import com.soleo.lsapi.APIException;
import com.soleo.lsapi.http.client.UnirestClient;

public class SDKMain 
{
	static public void main(String args[])
	{
		String key = "kkwaggwy5tkg2f6cvsuc7335";
		String url = "https://api.soleo.com/businesses?Category=Restaurants&City=Chicago&State=IL&APIKey=kkwaggwy5tkg2f6cvsuc7335";

		try{
			//UnirestClient uc = new UnirestClient();

			ProductionController productionController = new ProductionController(key);

	        String acc = "BLAH";
	        String ani = "3159417994";
	        String category = "Restaurants";
	        String city = "Chicago";
	        String state = "IL";

	        CallBacker cb = new CallBacker();

	        productionController.getBusinessesAsync(acc, ani, category, city, null, null, null, null,
	                null, null, null,null, "123", null, "baron", state, null, null, cb);
		} catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
		
        
	}
}
