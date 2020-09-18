package org.jefesimpson.blog;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(new LocalDateSerializer());
        mapper.registerModule(module);

        Users u = new Users("john15", "john_1995@gmail.com", Users.RoleEnum.COMMON, "john199515", LocalDate.of(2007,1,12));
        System.out.println(mapper.writeValueAsString(u));

    }
}
