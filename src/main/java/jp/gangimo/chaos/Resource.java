package jp.gangimo.chaos;

import org.glassfish.jersey.server.mvc.Viewable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gangimo
 */
@Path("/")
public class Resource {

    @GET
    public Viewable index(){
        Map<String, String> model = new HashMap<>();
        model.put("HOGE","hoge");
        return new Viewable("/index", model);
    }
}
