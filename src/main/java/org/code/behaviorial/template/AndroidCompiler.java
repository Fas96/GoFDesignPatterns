package org.code.behaviorial.template;

public class AndroidCompiler extends CrossCompiler {
    protected void collectSource() {
        System.out.println("Collecting Android source code");
    }

    protected void compileToTarget() {
        System.out.println("Compiling Android code to ARM target");
    }
    @Override
    protected void  afterCompileHook() {
        System.out.println("Running Android specific post-compilation steps");
    }
}
