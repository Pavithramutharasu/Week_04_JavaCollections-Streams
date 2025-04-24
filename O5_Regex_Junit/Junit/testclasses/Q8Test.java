package testclasses;

import static org.junit.jupiter.api.Assertions.*;

import javaclasses.Q8;

import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.*;

class Q8Test {
	private Q8 obj = new Q8();
	private final String testfile = "testfile.txt";
	
	@AfterEach 
	void cleanup() {
		File file = new File(testfile);
		if(file.exists()) file.delete();
	}

	@Test
	void writeandreadtest() throws IOException {
		String content = "Hello ,  World";
		obj.writeToFile(testfile, content);
		
		String readContent = obj.readFromFile(testfile);
		assertEquals(content,readContent);
	}
	@Test
	void testfileExistsAfterWrite() throws IOException{
		obj.writeToFile(testfile, "Sample text");
		File file = new File(testfile);
		assertTrue(file.exists());
	}
	@Test
    void testReadFromMissingFileThrowsIOException() {
        String nonExistentFile = "missing_file.txt";
        assertThrows(IOException.class, () -> obj.readFromFile(nonExistentFile));
    }

}
