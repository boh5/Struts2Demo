package com.dill.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        ActionContext context = ActionContext.getContext();
        Integer counter = (Integer) context.getApplication().get("counter");
        if (counter == null) {
            counter = 1;
        } else {
            counter = counter + 1;
        }
        context.getApplication().put("counter", counter);
        context.getSession().put("user", getUsername());
        if (getUsername().equals("dill") && getPassword().equals("233")) {
//            ActionContext.getContext().getSession().put("user", getUsername());
            context.put("tip", "服务器提示：您已经成功登录");
            return SUCCESS;
        }
        context.put("tip", "服务器提示：登录失败");
        return ERROR;
    }
}
