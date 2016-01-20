/**
 * 
 */
package me.study.dubbo.client;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.study.dubbo.server.service.api.DemoServer;


public class ClientMain {
	
	public static void main(String[] args) {
		sayHello();
	}
	
	public static void sayHello() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationConsumer.xml" });
		context.start();
		DemoServer demoServer = (DemoServer) context.getBean("demoService");
		System.out.println("client: " + demoServer.sayHello("Wanggq" + "1:" + new Date()) + "3:" + new Date());
	}

}
