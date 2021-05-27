package com.example.Sample.ProjectAndrewJar;

public interface IntefaceClass {
    public abstract void mm1();
    public abstract void mm2();
    public abstract void mm3();
}
 abstract class impliment implements IntefaceClass{
     public void mm1() {
         System.out.println("this is mm1" );
     }
 }
 class Test extends impliment {
     public void mm2(){
         System.out.println("this is mm2");
     }
     public void mm3(){
         System.out.println("this is mm3");
     }
 }

