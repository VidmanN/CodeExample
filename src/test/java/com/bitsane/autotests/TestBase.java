package com.bitsane.autotests;

import com.bitsane.autotests.applications.User;
import org.testng.annotations.*;

import java.io.File;

public class TestBase {

    public static ThreadLocal<User> tlApp = new ThreadLocal<>();
    public User app;
    public String path_to_chrome;

    @BeforeTest
    public void start() {
        String os_name = System.getProperty("os.name");
        if (os_name.contains("Windows")){
            path_to_chrome = new File("src/test/resources/Windows/chromedriver.exe").getAbsolutePath();
        } else {
            path_to_chrome = new File("src/test/resources/Linux/chromedriver").getAbsolutePath(); ///usr/bin/chromedriver
        }
        System.setProperty("webdriver.chrome.driver", path_to_chrome);

        if (tlApp.get() != null) {
            app = tlApp.get();
            return;
        }

        app = new User();
        tlApp.set(app);

        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> { app.quit(); app = null; }));
    }

}
