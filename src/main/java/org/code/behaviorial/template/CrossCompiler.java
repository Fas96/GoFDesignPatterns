package org.code.behaviorial.template;

public abstract class CrossCompiler {
    public final void compile() {
        collectSource();
        reserveRam ();
        afterCompileHook();
        compilationStatusNotification();
    }

    private void compilationStatusNotification() {
        System.out.println("Compilation completed");
    }

    protected void afterCompileHook() {
        // do nothing

    }

    protected void reserveRam() {
        System.out.println("Reversing RAM");
    }

    protected void collectSource() {
        System.out.println("Collecting source code");
    }

}
