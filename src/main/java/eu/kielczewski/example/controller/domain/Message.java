package eu.kielczewski.example.controller.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "pizza")
public class Message {
 
    String name;
    String text;
 
    public Message(){
         
    }
     
    public Message(String name, String text) {
        this.name = name;
        this.text = text;
    }
 
    @XmlElement(name = "title")
    public String getName() {
        return name;
    }
     
    @XmlElement(name = "_text")
    public String getText() {
        return text;
    }
 
}
