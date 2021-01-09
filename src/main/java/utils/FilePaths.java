package utils;

import java.io.File;

public class FilePaths {


    public static String XmlFilePath =  new File("src/main/resources/config/extent-config.xml").getAbsolutePath();
    public static String ConfigFilePath =  new File("src/main/resources/testData/config.properties").getAbsolutePath();
    public static String ErrorShotsPath =  new File("src/main/resources/errorshots").getAbsolutePath();


}
