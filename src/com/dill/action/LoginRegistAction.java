package com.dill.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginRegistAction extends ActionSupport {
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

    public String regist() throws Exception {
        ActionContext.getContext().getSession().put("user", getUsername());
        addActionMessage("恭喜您，" + getUsername() + "，您已经注册成功！");
        return SUCCESS;
    }

    public String login() throws Exception {
        if (getUsername().equals("dill") && getPassword().equals("233")) {
            ActionContext.getContext().getSession().put("user", getUsername());
            addActionMessage("欢迎， " + getUsername() + "，您已经登录成功！");
            return SUCCESS;
        }
        return ERROR;
    }
}
