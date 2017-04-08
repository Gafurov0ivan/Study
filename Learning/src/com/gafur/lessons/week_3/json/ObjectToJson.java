package com.gafur.lessons.week_3.json;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author igafurov
 * @since 21.10.2016
 */
public class ObjectToJson {

    public static void main(String[] args) {
        User user = new User(1, "Ivan", "123");
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("C:\\Users\\Student23\\gafur\\user.json"), user);
            String UserJson = mapper.writeValueAsString(user);
            User deserializedUser = mapper.readValue(UserJson, User.class);
            System.out.println(deserializedUser.getName());

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
