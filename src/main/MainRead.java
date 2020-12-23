package main;

import model.Person;
import persistence.PersonNativeFileReader;

import java.io.File;
import java.io.IOException;

public class MainRead {

    public static void main(String[] arg) throws IOException, ClassNotFoundException {
        Person person = new PersonNativeFileReader(new File("maria.person")).read();
        System.out.println(person.getName() +" nacio el "+ person.getBirthday());
    }
}
