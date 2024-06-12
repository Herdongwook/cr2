package common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static List<UserDTO> readUsersFromFile(String fileName) {
        List<UserDTO> users = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            users = (List<UserDTO>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public static void writeUsersToFile(String fileName, List<UserDTO> users) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(users);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

