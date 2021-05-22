package com.jdiai.states;

import com.jdiai.JDI;
import com.jdiai.tools.Cookies;

import static com.jdiai.JDI.$;
import static com.jdiai.MySite.homePage;
import static org.apache.commons.lang3.ObjectUtils.*;

public class States {
    // TODO: REMOVE Place test preconditions here
    public static void loggedOut() {
        if (isNotEmpty(Cookies.getCookies().size())) {
            Cookies.clearAllCookies();
            JDI.refreshPage();
        }
    }
    // TODO: REMOVE Place test preconditions here
    public static void loginFormOpened() {
        loggedOut();
        if (homePage.userName.isHidden()) {
            $("#user-icon").click();
        }
    }
}
