package org.example;

import org.example.annotations.BETest;
import org.example.annotations.UITest;

import java.lang.reflect.Method;

public class ReflectionAPIDemo {

    public static int uiTestsNumber = 0;

    public static void checkUITestAnnotation(Class<?> testClass) {
        Method[] testMethods = testClass.getDeclaredMethods();
        for(Method method : testMethods) {
            if(method.isAnnotationPresent(UITest.class)) {
                System.out.println("UI test runned: " + method.getName());
                uiTestsNumber++;
            }
            if(method.isAnnotationPresent(BETest.class)) {
                System.out.println("BE test runned: " + method.getName() + ". Backend tests doesn't count!");
            }
        }
        System.out.println("Quantity of UI tests runned: " + uiTestsNumber);
    }
}
