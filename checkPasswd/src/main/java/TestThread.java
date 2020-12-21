import java.io.*;
import java.util.HashSet;
import java.util.Set;


public class TestThread implements Runnable {
    private static Set<String> readFile(String filePath) throws IOException {
        return getStrings(filePath);
    }

    private static Set<String> getStrings(String filePath) throws IOException {
        Set<String> hashSet = new HashSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath)));

        for (String line = br.readLine(); line != null; line = br.readLine()) {
//            System.out.println(line);
            hashSet.add(line);
        }
        br.close();
        return hashSet;
    }

    public static void main(String[]args){
        TestThread thread_target = new TestThread();
        //通过new Thread(target,name)的方式创建线程
        for(int i = 1; i <= 10000;i++){
            String name = "线程" + i;
            new Thread(thread_target, name).start();
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        Set<String> hashSet = null;
        try {
            hashSet = readFile("D:\\Desktop\\Couvrir\\temp\\password.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        String passwd="abcde";
        assert hashSet != null;
        System.out.println(hashSet.contains(passwd));
    }
}
