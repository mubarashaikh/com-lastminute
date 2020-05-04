package com.lastminute.hooks;

import com.lastminute.common.Browsers;
import org.junit.After;
import org.junit.Before;

//1. create setup method(launchBrowser) 2. teardown methods(closeBrowser)
public class Hook extends Browsers {
    @Before
    public void setup(){

        launchBrowser("Chrome");
    }
    @After
    public void tearDown(){

        closeBrowser();
    }
}
