package com.fondofit.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;
  
  //eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTYxNTk5NzM3NCwiaWF0IjoxNjE1MzkyNTc0fQ.4_c38vz_PG1Qk7L9Zd9ycmjHhh6k5_xtYFGy7KjDtBZYLbpnRchp9HhSE8uB9WNn7vsKjssskrY2sBmsn8vqfQ"

  private String username;
    private String password;

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

