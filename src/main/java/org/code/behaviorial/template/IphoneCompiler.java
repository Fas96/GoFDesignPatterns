package org.code.behaviorial.template;

public class IphoneCompiler extends CrossCompiler{
    public IphoneCompiler() {
        super();
    }
    protected void collectSource() {
        System.out.println("Collecting Iphone source code");
    }

    protected void compileToTarget() {
        System.out.println("Compiling Iphone code to ARM target");
    }
    @Override
    protected void  afterCompileHook() {
        System.out.println("Running Iphone specific post-compilation steps");
    }
}
