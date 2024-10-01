/*
 * @author : mayankverma
 * Created Date : 10/1/24
 * Updated Date : 4/11/22
 */
package org;

/**
 * @author mayankverma
 */
public class Child extends Parent{

    public void methodA(){
        System.out.println("Child method");
    }

    public static void main(String[] args){
       super.methodA();
    }
}
