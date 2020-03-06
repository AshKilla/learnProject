package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-03-02-22:17
 */
public class TestGcCount {

    public static void main(String[] args) {
        ReferenceCountingGC referenceCountingGC = new ReferenceCountingGC();
    }

}


public class ReferenceCountingGC{

    public Object instance=null;
//    private static final int_1MB=1024*1024;
//    private byte[]bigSize=new byte[2*_1MB];

    public static void testGC(){
        ReferenceCountingGC objA=new ReferenceCountingGC();
        ReferenceCountingGC objB=new ReferenceCountingGC();

        objA.instance=objB;
        objB.instance=objA;
        objA=null;
        objB=null;
        //假设在这行发生GC,objA和objB是否能被回收？

        System.gc();

    }

}