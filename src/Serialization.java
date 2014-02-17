import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable {
    private int size;
    private transient String name;

    public Serialization (int size, String name) {
        this.size = size;
        this.name = name;
    }

    public String toString() {
        return name + " " + size;
    }

    public static void main(String[] args) throws Exception {
        Serialization serialization = new Serialization(10, "Test");

        ByteOutputStream byteOutputStream = new ByteOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteOutputStream);
        objectOutputStream.writeObject(serialization);

        ObjectInputStream objectInputStream = new ObjectInputStream(byteOutputStream.newInputStream());
        Serialization serialized = (Serialization) objectInputStream.readObject();

        System.out.println("Original: " + serialization);
        System.out.println("De-serialized: " + serialized);
    }
}
