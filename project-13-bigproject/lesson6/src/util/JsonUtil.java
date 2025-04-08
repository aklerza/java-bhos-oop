package util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonUtil {
    private static final ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    public static <T> void writeListToFile(List<T> list, String filePath) throws IOException {
        mapper.writeValue(new File(filePath), list);
    }

    public static <T> List<T> readListFromFile(String filePath, Class<T[]> clazz) throws IOException {
        T[] array = mapper.readValue(new File(filePath), clazz);
        return List.of(array);
    }
}
