package Lessons.Lesson14;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user1 = new User(15, "Vasya", "Petrov");
        String userJsonValue = objectMapper.writeValueAsString(user1);
        System.out.println(userJsonValue);
        System.out.println("===========================================================");
        User user2 = objectMapper.readValue(userJsonValue, User.class);
        System.out.println(user2);
    }
}
