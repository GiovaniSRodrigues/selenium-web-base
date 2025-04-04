package testcommons.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T fromJson(String json, Class<T> clazz) throws Exception {
        return mapper.readValue(json, clazz);
    }

    public static String toJson(Object obj) throws Exception {
        return mapper.writeValueAsString(obj);
    }
}