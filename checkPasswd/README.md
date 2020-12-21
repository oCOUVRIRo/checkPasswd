CheckPassword
==
CheckPassword是一个Java开源库，提供检测密码是否属于弱密码字典的功能。

Desc
--
#### Dictionary（字典）
在****private static final String filePath =**** 中配置弱密码字典路径

#### 输出（是否属于弱密码字典）
* **false : 不属于**
* **true : 属于**   

Usage
--
```Java
    public static void main(String[] args) {
		String passwd = "2hAj5#mne-ix.86H";
		System.out.println(CheckPassword.checkPasswordInDic(passwd));
	}
```

Download
--
[下载jar包](https://github.com/venshine/CheckPasswordStrength/blob/master/CheckPasswordStrength.jar)

About
--
* Email：chengxinlan@fin-shine.com
