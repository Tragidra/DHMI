package jdlor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by KSEnikeev on 22.09.2020.
 */
public class Test {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper ();

        File file = new File("C:\\Users\\IFShakurov\\Documents\\NetBeansProjects\\JDLOR\\src\\jdlor\\in\\file_name.json");
        String json = "{\"name\":\"Дрис\",\"age\":18,\"date\":\"2020-09-22\"}";

        try {
            Person person = mapper.readValue(file, Person.class);
            System.out.println(person);

            String html = "<!doctype html>\n<html dir=\"ltr\" lang=\"ru\"><head><meta charset=\"utf-8\">"+
                    "<title>Добро пожаловать в Chrome!</title></head><body>name:"+person.getName()+"</body></html>";

            File file1 = new File("C:\\Users\\IFShakurov\\Documents\\NetBeansProjects\\JDLOR\\src\\jdlor\\out\\file_name.html");
            FileOutputStream fos = new FileOutputStream(file1);

            fos.write(html.getBytes("utf-8"));

            fos.flush();

            fos.close();

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
