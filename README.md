CheckPassword
==
CheckPassword是一个Java开源库，提供检测密码是否属于弱密码字典的功能。

Desc
--
#### Dictionary（字典）
可修改文件****src/main/java/com/couvrir/checkpassword/CheckPassword.java****，在****private static final String filePath =**** 处配置弱密码字典路径

#### 输出（是否属于弱密码字典）
* **false : 不属于**
* **true : 属于**   

Usage
--
在项目中引入jar包，调用****CheckPassword.checkPasswordInDic****方法
```Java
    public static void main(String[] args) {
		String passwd = "2hAj5#mne-ix.86H";
		System.out.println(CheckPassword.checkPasswordInDic(passwd));
	}
```

Download
--
[下载jar包](http://raw.githubusercontent.com/oCOUVRIRo/checkPasswd/main/CheckPassword.jar)

[下载源码](https://github.com/oCOUVRIRo/checkPasswd.git)

About
--
* Email：chengxinlan@fin-shine.com
