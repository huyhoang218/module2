package repositories;

import models.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static final String SRC_USER = "C:\\codegym\\module2\\session\\case_study\\src\\data\\user\\user.csv";
    private List<User> users = new ArrayList<>();
    private static UserRepository instance;
    private UserRepository() {
        users = readUser();
    }
    public synchronized static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public User loginUser(String username, String password) {
        for (User user : users) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public User registerUser(User user) {
        users.add(user);
        writeUser();
        return user;
    }

    private List<User> readUser() {
        List<User> userList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(SRC_USER))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                userList.add(new User(temp[0], temp[1], temp[2]));
            }
        } catch (FileNotFoundException e) {
            System.err.println("File không tìm thấy");
        } catch (IOException e) {
            System.out.println("Lỗi đọc dữ liệu");
        }
        return userList;
    }

    private void writeUser() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(SRC_USER))) {
            for (User user : users) {
                bw.write(user.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Lỗi ghi File");
        }
    }

    public List<User> getAll() {
        return new ArrayList<>(users);
    }
}
