package com.fanshe;

import java.io.Serializable;
import java.lang.instrument.ClassFileTransformer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Calendar;

import com.mysql.jdbc.Field;

public class TestReflect implements Serializable{
	private static final long serialVersionUID = -2862585049955236662L;
	public static void main(String[] arges) throws Exception{
		/*
		//通过一个对象获得完整的包名和类名
		TestReflect testReflect = new TestReflect();
		System.out.println(testReflect.getClass().getName());
		//结果为：com.fanshe.TestReflect
		*/
		
		
		/*
		//实例化class类对象
		Class<?> class1 = null;
		Class<?> class2 = null;
		Class<?> class3 = null;
		//一般采用这三种方式
		class1 = Class.forName("com.fanshe.TestReflect");
		class2 = new TestReflect().getClass();
		class3 = TestReflect.class;
		System.out.println("类名称         "+class1.getName());
		System.out.println("类名称         "+class2.getName());
		System.out.println("类名称         "+class3.getName());
		*/
		
		
		
		
		/*
		//获取一个对象的父类与实现的接口
		Class<?> clazz = Class.forName("com.fanshe.TestReflect");
		//取得父类
		Class<?> parentClass = clazz.getSuperclass();
		System.out.println("clazz的父类为："+parentClass.getName());
		//clazz的父类为：java.lang.Object
		//获取所有的接口
		Class<?> intes[] = clazz.getInterfaces();
		System.out.println("clazz实现的接口有：");
		for(int i=0;i<intes.length;i++){
			System.out.println((i+1)+":"+intes[i].getName());
		}
		//clazz实现的接口有：1:java.io.Serializable
		 */
		
		
		
		
	/*	//通过反射机制实例化一个类的对象
		Class<?> class1 = null;
		class1 = Class.forName("com.fanshe.User");
		//第一种方法，实例化默认构造方法，调用set赋值
		User user = (User) class1.newInstance();
		user.setAge(20);
		user.setName("Rollen");
        System.out.println(user);
        // 结果 User [age=20, name=Rollen]
        // 第二种方法 取得全部的构造函数 使用构造函数赋值
        Constructor<?> cons[] = class1.getConstructors();
        // 查看每个构造方法需要的参数
        for (int i = 0; i < cons.length; i++) {
            Class<?> clazzs[] = cons[i].getParameterTypes();
            System.out.print("cons[" + i + "] (");
            for (int j = 0; j < clazzs.length; j++) {
                if (j == clazzs.length - 1){
                    System.out.print(clazzs[j].getName());
                }else{
                    System.out.print(clazzs[j].getName() + ",");
                }
            }
            System.out.println(")");
        }
        // 结果
        // cons[0] (java.lang.String)
        // cons[1] (int,java.lang.String)
        // cons[2] ()
        user = (User) cons[0].newInstance("Rollen");
        System.out.println(user);
        // 结果 User [age=0, name=Rollen]
        user = (User) cons[1].newInstance(20, "Rollen");
        System.out.println(user);
        // 结果 User [age=20, name=Rollen]		
        */         
		
		
		
		/*//获取某个类的全部属性
		Class<?> clazz = Class.forName("com.fanshe.TestReflect");
		System.out.println("==========本类属性=============");
		//取得本类属性
		java.lang.reflect.Field[] field = clazz.getDeclaredFields();
		for(int i=0;i<field.length;i++){
			//权限修饰符
			int mo = field[i].getModifiers();
			String priv = Modifier.toString(mo);
			//属性类型
			Class<?> type = field[i].getType();
			System.out.println(priv+" "+type.getName()+" "+field[i].getName()+";");
		}
		System.out.println("=============实现的接口或者父类的属性===========");
		//取得实现的接口或者父类的属性
		java.lang.reflect.Field[] filed1 = clazz.getFields();
		for(int j=0;j<filed1.length;j++){
			//权限修饰符
			int mo = ((Member) filed1[j]).getModifiers();
			String priv = Modifier.toString(mo);
			//属性类型
			Class<?> type = filed1[j].getType();
			System.out.println(priv+" "+type.getName()+" "+filed1[j].getName()+";");
		}*/
		
		
		
		
		
		/*//获取某个类的全部方法
		Class<?> clazz = Class.forName("com.fanshe.TestReflect");
		Method method[] = clazz.getMethods();
		for(int i=0;i<method.length;i++){
			Class<?> returnType = method[i].getReturnType();
			Class<?> para[] = method[i].getParameterTypes();
			int temp = method[i].getModifiers();
			System.out.println(Modifier.toString(temp)+" ");
			System.out.println(returnType.getName()+" ");
			System.out.println(method[i].getName()+" ");
			System.out.println("(");
			for(int j=0;j<para.length;j++){
				System.out.println(para[j].getName()+" "+"arg"+j);
				if(j<para.length-1){
					System.out.println(",");
				}
			}
			Class<?> exce[] = method[i].getExceptionTypes();
			if(exce.length>0){
				System.out.println(") throws");
				for(int k=0;k<exce.length;++k){
					System.out.println(exce[k].getName()+" ");
					if(k<exce.length-1){
						System.out.println(",");
					}
				}
			}else {
				System.out.println(")");
			}
			System.out.println();
		}*/
		
		
		
		
		//通过反射机制调用某个类的方法
		Class<?> clazz = Class.forName("com.fanshe.TestReflect");
		//调用TestReflect类中的reflect1方法
		Method method = clazz.getMethod("reflect1");
		method.invoke(clazz.newInstance());
		//java 反射机制 - 调用某个类的方法1
		//调用TestReflect的reflect2方法
		method = clazz.getMethod("reflect2", int.class,String.class);
		method.invoke(clazz.newInstance(), 20,"张三");
		//Java 反射机制 - 调用某个类的方法2
		//age - 20.name -张三
	}		
}

