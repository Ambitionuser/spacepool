package javaproxy.proxypractice;

import javaproxy.proxypractice.Actor;
import javaproxy.proxypractice.WangBaoQiang;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理演示
 * 代理类的逻辑是动态生成的
 * 需要什么样的逻辑，就可以生成什么样的逻辑
 * @author ThinkPad
 *
 */
public class Test2 {


	public static void main(String[] args) {

		Actor o1 = (Actor) Proxy.newProxyInstance(Actor.class.getClassLoader(), new Class<?>[] {Actor.class}, new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("宝宝要出场，你先给我安排10个泰森做保镖开路");

				new WangBaoQiang().act();

				System.out.println("宝宝演戏很辛苦的，演完了，你去给烤俩腰子，焦一点儿的");

				return null;
			}
		});



		Actor o2 = (Actor) Proxy.newProxyInstance(Actor.class.getClassLoader(), new Class<?>[] {Actor.class}, new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("xxoo");

				new WangBaoQiang().act();

				System.out.println("ooxx");

				return null;
			}
		});

		o1.act();

		System.out.println("--------------------");
		o2.act();


	}


}
