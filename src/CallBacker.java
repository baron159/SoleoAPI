import com.soleo.lsapi.http.client.APICallBack;
import com.soleo.lsapi.http.client.HttpContext;

/**
 * Created by sbaron on 2/1/2016.
 * This class is what handles the response from the API endpoint
 */
public class CallBacker implements APICallBack {
    @Override
    public void onSuccess(HttpContext httpContext, Object o)
    {
        System.out.println(httpContext.toString());
        System.out.println(o.toString());

    }

    @Override
    public void onFailure(HttpContext httpContext, Throwable throwable)
    {
        System.out.println("Ohhhh No");
    }
}
