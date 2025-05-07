package com.example.library_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;

@SpringBootApplication
public class LibraryAppApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(LibraryAppApplication.class);
    }

    @Override
    public void onStartup(@org.springframework.lang.NonNull javax.servlet.ServletContext servletContext) throws javax.servlet.ServletException {
        // Register or configure servlets, filters, or listeners here if needed
        servletContext.setInitParameter("exampleParam", "exampleValue");
    }

    public static void main(String[] args) {
        SpringApplication.run(LibraryAppApplication.class, args);
    }

    @jakarta.annotation.PreDestroy
    public void cleanUp() throws Exception {
        AbandonedConnectionCleanupThread.checkedShutdown();
    }
}
