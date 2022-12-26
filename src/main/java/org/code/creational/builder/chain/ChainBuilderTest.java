package org.code.creational.builder.chain;

public class ChainBuilderTest {
    public static void main(String[] args) {
        Account account = Account.builder()
                .setName("张三")
                .setPassword("123456")
                .setAddress("北京")
                .setEmail("sds@gmail.com")
                .setPhone("123456789")
                .build();
        System.out.println(account);
    }
}
