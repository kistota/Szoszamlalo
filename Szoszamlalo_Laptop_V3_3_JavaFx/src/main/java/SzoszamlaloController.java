import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.sun.jdi.VoidValue;
import javafx.application.Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;

import java.util.Map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class SzoszamlaloController {

    @FXML
    private Label result;

    @FXML
    private TextField path;

    @FXML
    private TextField szo;

    @FXML
    private ScrollPane leltareredmeny;


    @FXML
    private Label leltareredmeny2;


    public void performLeltar(ActionEvent actionEvent) throws JsonProcessingException {

        var objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        var ref = new TypeReference<Map<String, String>>() {};
        Main kereso = new Main();
        var s = objectMapper.writeValueAsString(kereso.Szokereso(path.getText()));
        Map<String, String> map = objectMapper.readValue(s, ref);
        //leltareredmeny2.setText(String.valueOf(s));
        leltareredmeny2.setText(String.valueOf(map));
        //System.out.println(map);
   }


    public void perform(ActionEvent actionEvent) {
        Main kereso = new Main();

        if ((kereso.Szokereso(path.getText()).get(szo.getText()))==null) {
           //throw new InvalidWordException("Nem talalhato");
            result.setText("nem talahato");
        } else
         result.setText(Integer.toString(kereso.Szokereso(path.getText()).get(szo.getText())));
    }
}
