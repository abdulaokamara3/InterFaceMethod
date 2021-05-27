package com.example.Sample.ProjectAndrewJar;

public interface IClassMethod {
   public static final double pi = 2.34;
}
abstract class excutePI implements IClassMethod {
    public static void main(String[] args) {
        System.out.println(pi);
    }

}


