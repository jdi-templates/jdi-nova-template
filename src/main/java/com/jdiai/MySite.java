package com.jdiai;

import com.jdiai.annotations.Site;
import com.jdiai.annotations.Title;
import com.jdiai.annotations.Url;
import com.jdiai.pages.HomePage;

// TODO: CHANGE to your site domain
@Site("https://jdi-testing.github.io/jdi-light")
// TODO: RENAME to your site
public class MySite {
    // @Url("/home-page-url") @Title("YOUR PAGE TITLE TO CHECK")
    public static HomePage homePage;

}
