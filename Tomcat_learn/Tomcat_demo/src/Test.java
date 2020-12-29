
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Properties;


public class Test {
    private static String m_confPath = "";
    private static int timeoutAC = 0;
    private static int trytimesAC = 0;
    private static int timeoutSC = 0;
    private static int trytimesSC = 0;

    private boolean initClient(String var1) throws IOException {
        String var2 = var1 + "druid.properties";
        System.out.println("client configure :" + var2);
        BufferedInputStream var3 = new BufferedInputStream(new FileInputStream(var2));
        Properties var4 = new Properties();
        var4.load(var3);
        System.out.println(var4.getProperty("filters").trim());
        var3.close();
        return true;
    }



    public static void main(String[] args) throws IOException {
        Test test = new Test();
        test.initClient("config/");
    }
}