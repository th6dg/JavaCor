package org.example.ReflectionAPI;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// Liên kết method và proxy instance
public class UserInvocationHandler implements InvocationHandler {
    private Object target;

    public UserInvocationHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Run befor method");
        Object result = method.invoke(target,args);
        System.out.println("Run after method");
        return null;
    }
}
