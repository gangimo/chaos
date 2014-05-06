package jp.gangimo.chaos;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.MvcFeature;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

/**
 * @author gangimo
 */
public class Application extends ResourceConfig{
    public Application(){
        this.packages(Application.class.getPackage().getName())
                .property(MvcFeature.TEMPLATE_BASE_PATH, "/WEB-INF/jsp")
                .register(JspMvcFeature.class);
    }

}
