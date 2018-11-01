package workshop;

import act.app.ActionContext;
import act.controller.Controller;
import act.util.Global;
import org.osgl.inject.annotation.Configuration;
import org.osgl.mvc.annotation.Before;
import org.osgl.mvc.annotation.PostAction;
import org.osgl.util.S;

public class LoginService extends Controller.Util {

    @Configuration("username")
    private String username;

    @Configuration("password")
    private String password;

    @Global
    @Before(except = "login")
    public void authenticate(ActionContext context) {
        if (context.req().path().startsWith("/~")) {
            return;
        }
        unauthorizedIfNot(context.isLoggedIn());
    }

    @PostAction("/login")
    public void login(String username, String password, ActionContext context) {
        unauthorizedIfNot(S.eq(this.username, username) &&
                S.eq(this.password, password));
        context.login(username);
    }

}
