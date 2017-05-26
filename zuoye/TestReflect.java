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
		//ͨ��һ�������������İ���������
		TestReflect testReflect = new TestReflect();
		System.out.println(testReflect.getClass().getName());
		//���Ϊ��com.fanshe.TestReflect
		*/
		
		
		/*
		//ʵ����class�����
		Class<?> class1 = null;
		Class<?> class2 = null;
		Class<?> class3 = null;
		//һ����������ַ�ʽ
		class1 = Class.forName("com.fanshe.TestReflect");
		class2 = new TestReflect().getClass();
		class3 = TestReflect.class;
		System.out.println("������         "+class1.getName());
		System.out.println("������         "+class2.getName());
		System.out.println("������         "+class3.getName());
		*/
		
		
		
		
		/*
		//��ȡһ������ĸ�����ʵ�ֵĽӿ�
		Class<?> clazz = Class.forName("com.fanshe.TestReflect");
		//ȡ�ø���
		Class<?> parentClass = clazz.getSuperclass();
		System.out.println("clazz�ĸ���Ϊ��"+parentClass.getName());
		//clazz�ĸ���Ϊ��java.lang.Object
		//��ȡ���еĽӿ�
		Class<?> intes[] = clazz.getInterfaces();
		System.out.println("clazzʵ�ֵĽӿ��У�");
		for(int i=0;i<intes.length;i++){
			System.out.println((i+1)+":"+intes[i].getName());
		}
		//clazzʵ�ֵĽӿ��У�1:java.io.Serializable
		 */
		
		
		
		
	/*	//ͨ���������ʵ����һ����Ķ���
		Class<?> class1 = null;
		class1 = Class.forName("com.fanshe.User");
		//��һ�ַ�����ʵ����Ĭ�Ϲ��췽��������set��ֵ
		User user = (User) class1.newInstance();
		user.setAge(20);
		user.setName("Rollen");
        System.out.println(user);
        // ��� User [age=20, name=Rollen]
        // �ڶ��ַ��� ȡ��ȫ���Ĺ��캯�� ʹ�ù��캯����ֵ
        Constructor<?> cons[] = class1.getConstructors();
        // �鿴ÿ�����췽����Ҫ�Ĳ���
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
        // ���
        // cons[0] (java.lang.String)
        // cons[1] (int,java.lang.String)
        // cons[2] ()
        user = (User) cons[0].newInstance("Rollen");
        System.out.println(user);
        // ��� User [age=0, name=Rollen]
        user = (User) cons[1].newInstance(20, "Rollen");
        System.out.println(user);
        // ��� User [age=20, name=Rollen]		
        */         
		
		
		
		/*//��ȡĳ�����ȫ������
		Class<?> clazz = Class.forName("com.fanshe.TestReflect");
		System.out.println("==========��������=============");
		//ȡ�ñ�������
		java.lang.reflect.Field[] field = clazz.getDeclaredFields();
		for(int i=0;i<field.length;i++){
			//Ȩ�����η�
			int mo = field[i].getModifiers();
			String priv = Modifier.toString(mo);
			//��������
			Class<?> type = field[i].getType();
			System.out.println(priv+" "+type.getName()+" "+field[i].getName()+";");
		}
		System.out.println("=============ʵ�ֵĽӿڻ��߸��������===========");
		//ȡ��ʵ�ֵĽӿڻ��߸��������
		java.lang.reflect.Field[] filed1 = clazz.getFields();
		for(int j=0;j<filed1.length;j++){
			//Ȩ�����η�
			int mo = ((Member) filed1[j]).getModifiers();
			String priv = Modifier.toString(mo);
			//��������
			Class<?> type = filed1[j].getType();
			System.out.println(priv+" "+type.getName()+" "+filed1[j].getName()+";");
		}*/
		
		
		
		
		
		/*//��ȡĳ�����ȫ������
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
		
		
		
		
		//ͨ��������Ƶ���ĳ����ķ���
		Class<?> clazz = Class.forName("com.fanshe.TestReflect");
		//����TestReflect���е�reflect1����
		Method method = clazz.getMethod("reflect1");
		method.invoke(clazz.newInstance());
		//java ������� - ����ĳ����ķ���1
		//����TestReflect��reflect2����
		method = clazz.getMethod("reflect2", int.class,String.class);
		method.invoke(clazz.newInstance(), 20,"����");
		//Java ������� - ����ĳ����ķ���2
		//age - 20.name -����
	}		
}

