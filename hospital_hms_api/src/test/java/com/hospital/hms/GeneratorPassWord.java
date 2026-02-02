package com.hospital.hms;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.MD5;

public class GeneratorPassWord {

    // 定义常量，用于截取 MD5 加密结果中的前缀和后缀部分
    private static final int PREFIX_LENGTH = 6;  // 从MD5哈希中获取的前缀长度
    private static final int SUFFIX_LENGTH = 3;  // 从MD5哈希中获取的后缀长度

    public static void main(String[] args) {
        String password = encryptPassword("admin", "admin1122");
        System.out.println(password);
    }

    private static String encryptPassword(String username, String password) {
        // 创建MD5实例来进行加密
        MD5 md5 = MD5.create();
        // 使用MD5对用户名进行加密生成哈希字符串
        String temp = md5.digestHex(username);
        // 从MD5结果中提取出前缀部分（前6个字符）
        String tempStart = StrUtil.subWithLength(temp, 0, PREFIX_LENGTH);
        // 从MD5结果中提取出后缀部分（最后3个字符）
        String tempEnd = StrUtil.subSuf(temp, temp.length() - SUFFIX_LENGTH);
        // 将前缀、密码和后缀拼接起来，并对拼接结果进行MD5加密
        return md5.digestHex(tempStart + password + tempEnd);
    }
}
