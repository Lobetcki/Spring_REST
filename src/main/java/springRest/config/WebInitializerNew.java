package springRest.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


                    //  Настройка dispatcherServlet.
public class WebInitializerNew extends AbstractAnnotationConfigDispatcherServletInitializer {


    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ConfigNew.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
