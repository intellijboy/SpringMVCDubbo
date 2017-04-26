import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liuburu on 2017/4/25.
 */
public class RunDubboProvider2 {
    public static void main(String[] args) throws InterruptedException{
        RunDubboProvider2 luncher=new RunDubboProvider2();
        luncher.start();
        Thread.sleep(1000*60*10);
    }

    void start(){
        String configLocation="spring/dubbo-provider.xml";
        ApplicationContext context =new ClassPathXmlApplicationContext(configLocation);
        String[] names=context.getBeanDefinitionNames();
        System.out.print("Beans:");
        for(String string : names)
            System.out.print(string+",");
        System.out.println();
    }
}
