package generalUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {
    private static ConfigFile instance;
    private Properties properties;
    private final String resourcesPAth = "src//main//resources//";


    private ConfigFile(String fileName) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(resourcesPAth + fileName));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + resourcesPAth + fileName);
        }
    }

    public static void init(String configName) {
        if (configName == null) return;
        ConfigFile.instance = new ConfigFile(configName);
    }

    public static ConfigFile getInstance() {
        if (ConfigFile.instance == null) {
            init("configuration.properties");
        }
        return ConfigFile.instance;
    }

    public String getConfigFileValueFromName(String name) {
        String username = properties.getProperty(name);
        if (username != null) return username;
        else throw new RuntimeException(name + " not specified in the Configuration.properties file.");
    }

    public String getBrowser() {
        String browser = properties.getProperty("browser");
        if (browser != null) return browser;
        else throw new RuntimeException("browser not specified in the Configuration.properties file.");
    }

    public String getPassword() {
        String browser = properties.getProperty("Password");
        if (browser != null) return browser;
        else throw new RuntimeException("browser not specified in the Configuration.properties file.");
    }

    public String getBMSUrl() {
        String url = properties.getProperty("BmsUrl");
        if (url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

    public String getTenantUrl() {
        String url = properties.getProperty("TenantUrl");
        if (url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }
}
