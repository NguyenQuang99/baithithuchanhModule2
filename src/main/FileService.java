package main;

import java.io.*;

public class FileService {
    private File file;

    public void writeToFile(String path, Manager manager) throws Exception{
        file = new File(path);
        if(!file.exists()) {
            file.createNewFile();
        }
        OutputStream outputStream = new FileOutputStream(file) ;
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(manager);


    }
    public Manager readFromFile(String path) throws IOException, ClassNotFoundException {
        File file = new File(path);
        InputStream inputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream( inputStream);
        return(Manager) objectInputStream.readObject();


    }

    public void exportToCSV(String path, Manager manager) throws Exception {
        file = new File(path);
        if(!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write("Số điện thoại" + "," + "Nhóm" + "," + "Họ tên" + "," + "Giới tính" + "," + "Địa chỉ" + "," + "Ngày sinh" + "," + "Email");
        bufferedWriter.write("\n");
        for(Contact contact : manager.getContactsList()) {
            bufferedWriter.write(contact.getPhoneNumber() + "," + contact.getGroup() + "," + contact.getName() + "," + (contact.isGender()? "Nam" : "Nữ") + "," + contact.getAddress() + "," + contact.getBirthday().toString() + "," + contact.getEmail());
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();
    }
}
