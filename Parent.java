package Revision;
import java.io.IOException;
import java.io.FileNotFoundException;

class Parents {
    void readFile() throws IOException {
        System.out.println("Reading parent file");
    }
}

class Child extends Parents {
    @Override
    void readFile() throws FileNotFoundException {
        System.out.println("Reading child file");
    }
}

/*
- FileNotFoundException is a subclass of IOException.
- An overriding method can throw the same checked exception, a narrower checked exception, or no checked exception.
- It cannot declare a broader checked exception, such as Exception, when the parent declares only IOException.
Interview memory trick: Child exception can be same or narrower, but not broader.


*/