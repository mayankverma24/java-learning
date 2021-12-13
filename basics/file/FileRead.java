package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileRead {
	private Properties properties;
	private final String propertyFilePath = "C:\\Users\\mayank\\eclipse-workspace\\java-learning\\config.properties";

	public FileRead() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("config file not found");
		}
	}

	public String getUsername() {
		String user = properties.getProperty("username");
		return user;
	}

	public String getPassword() {
		String pass = properties.getProperty("password");
		return pass;
	}

	public String geturl() {
		String url = properties.getProperty("url");
		return url;
	}

	public static void main(String[] args) {
		FileRead f = new FileRead();
		System.out.println(f.getUsername());
		System.out.println(f.getPassword());
		System.out.println(f.geturl());

	}
}
