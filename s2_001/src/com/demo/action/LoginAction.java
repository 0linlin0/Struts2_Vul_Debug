package com.demo.action;

/**
 * @auther Skay
 * @date 2020/12/9 14:06
 * @description
 */

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private String username = null;
    private String password = null;

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() throws Exception {
        if ((this.username.isEmpty()) || (this.password.isEmpty())) {
            return "error";
        }
        if ((this.username.equalsIgnoreCase("admin"))
                && (this.password.equals("admin"))) {
            return "success";
        }
        return "error";
    }
}