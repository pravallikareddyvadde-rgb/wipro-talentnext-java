package ObjectSerialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeEmployee {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Rahul",
                new Date(),
                "IT",
                "Software Engineer",
                65000.0
        );

        try {
            FileOutputStream fos = new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
            fos.close();

            System.out.println("Employee object serialized successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
