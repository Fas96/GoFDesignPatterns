package org.code.behaviorial.template;

public class TemplateDemoCode {
    public static void main(String[] args) {
        CrossCompiler iphone = new IphoneCompiler();
        iphone.compile();
        System.out.println("==================================");
        CrossCompiler android = new AndroidCompiler();
        android.compile();
    }
}
