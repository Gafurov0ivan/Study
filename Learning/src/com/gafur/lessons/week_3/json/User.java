package com.gafur.lessons.week_3.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author igafurov
 * @since 21.10.2016
 */
public class User {
    private int id = 0;
    private String name = "User";
    private String password = "Password";

    @JsonCreator
    User(@JsonProperty("id") int id, @JsonProperty("name") String name, @JsonProperty("password") String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @JsonIgnore
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
