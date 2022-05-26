import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import javafx.application.Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Proba {

    public static void main(String[] args) throws IOException {

        Application.launch(SzoszamlaloApplication.class, args);

        //var objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        //var ref = new TypeReference<Map<String, String>>() {};
        //Main kereso = new Main();
        //Main underTest = new Main();

        //System.out.println(new Main() = underTest.Szokereso("love"));
        //System.out.println(kereso.Szokereso("C:/Users/User/Documents/PTI_4_felev/Szoftverfejlesztes/Tmp_Transfer/Szokereso_Kiserlet_2//romeo.txt").get("romeo"));
        //System.out.println(kereso.Szokereso("C:/Users/User/Documents/PTI_4_felev/Szoftverfejlesztes/Tmp_Transfer/Szokereso_Kiserlet_2//romeo.txt"));
        //System.out.println(kereso.Szokereso("C:/Users/User/Documents/PTI_4_felev/Szoftverfejlesztes/Probaszokereso.txt"));




        //var s = objectMapper.writeValueAsString(kereso.Szokereso("C:/Users/User/Documents/PTI_4_felev/Szoftverfejlesztes/Tmp_Transfer/Szokereso_Kiserlet_2//romeo.txt"));
        //System.out.println(s);
        //System.out.println(objectMapper.readValue(s,szavak.class));
        //Map<String, String> map = objectMapper.readValue(s, ref);
        //System.out.println(map);
    }
}


//------------------------------------------------------------------------------------


