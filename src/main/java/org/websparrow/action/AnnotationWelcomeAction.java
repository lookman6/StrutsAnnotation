package org.websparrow.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@Namespace("/")
@ResultPath("/")
@Action(value = "register", results = {
    @Result(name = "success", location = "welcome.jsp"),
    @Result(name = "error", location = "index.jsp")})
public class AnnotationWelcomeAction extends ActionSupport {

    private String userId, pass, msg;

    @Override
    public String execute() throws Exception {
        if (pass.equalsIgnoreCase("admin")) {
            return SUCCESS;
        } else {
            msg = "You have entered the wrong password. Try again...";
            return ERROR;
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
