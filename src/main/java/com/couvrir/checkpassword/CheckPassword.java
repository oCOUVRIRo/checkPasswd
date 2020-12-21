//
// @author 程馨兰
// 2020/12/18,16:57
//
package com.couvrir.checkpassword;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CheckPassword {
//    配置弱密码字典路径
    private static final String filePath = "D:\\Desktop\\Couvrir\\temp\\password.txt";

    public CheckPassword() {
    }

    private static Set<String> readFile() throws IOException {
        return getStrings();
    }
//    逐行读取弱密码字典，存入HashSet
    private static Set<String> getStrings() throws IOException {
        Set<String> hashSet = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(CheckPassword.filePath)));

        for (String line = br.readLine(); line != null; line = br.readLine()) {
            hashSet.add(line);
        }
        br.close();
        return hashSet;
    }

//    查询输入的密码是否在弱密码字典中
    public static boolean checkPasswordInDic(String password) {
        Set<String> hashSet = null;
        try {
            hashSet = readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert hashSet != null;
        return hashSet.contains(password);
    }
}
