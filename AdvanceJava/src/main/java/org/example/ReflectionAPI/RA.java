package org.example.ReflectionAPI;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Overview:
 *
 * @Feature:
 *      Lấy thông tin về lớp
 *      Lấy thông tin về trường(field)
 *      Lấy thông tin về method
 *      Lấy thông tin về annotation
 *      Thay đổi tính năng của class
 *      Dynamic Proxy: Can thiệp vào cuộc gọi phương thức
 */
public class RA {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Lấy đối tượng class
        Class<?> clazz = User.class;

        // Tạo đối tượng của lớp đó
        Object obj = clazz.getDeclaredConstructor().newInstance();

        // Lấy phương thức và gọi nó
        Method method = clazz.getDeclaredMethod("print");
        method.setAccessible(true);
        method.invoke(obj);

        // Create Dynamic Proxy Manually (with interface)
        IUser user = new User();
        System.out.println("=====Option1========");
        user.goodBye();
        user.meetAgain();

        System.out.println("=========Option2=========");
        InvocationHandler userInvocationHandler = new UserInvocationHandler(user);

        IUser proxy = (IUser) Proxy.newProxyInstance(user.getClass().getClassLoader(), user.getClass().getInterfaces(), userInvocationHandler);
        proxy.goodBye();
        proxy.meetAgain();

    }
}
