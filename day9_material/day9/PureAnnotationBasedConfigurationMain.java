package day9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import day9_fourth.FourthTest;

public class PureAnnotationBasedConfigurationMain {

	public static void main(String[] args) {
		Class<SpringAppConfig> configClass = SpringAppConfig.class;
		AnnotationConfigApplicationContext annoCtx = 
				new AnnotationConfigApplicationContext(configClass);
		
		//Loading a bean of type : FirstTest
		FirstTest firstTest = 	annoCtx.getBean(FirstTest.class);
		//Loading a bean of type : SecondTest
		SecondTest secondTest = annoCtx.getBean(SecondTest.class);
		//Loading a bean of type : ThirdTest
		Object obj = annoCtx.getBean("third");
		ThirdTest thirdTest = (ThirdTest)obj;
		firstTest.doTest();
		secondTest.doTest();
		thirdTest.doTest();
		
		System.out.println("-------------Accessing FourthTest bean------------------");
		FourthTest fourthTest = annoCtx.getBean(FourthTest.class);
		fourthTest.doTest();
		
	}

}
