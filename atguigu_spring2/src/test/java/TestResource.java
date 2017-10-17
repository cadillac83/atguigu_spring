import com.atguigu3.spring.resource.ResourceTest;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by maxudong on 2017/4/21.
 */

public class TestResource{
    private ClassPathXmlApplicationContext ctx;
    public TestResource() {
        ctx = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
    }

    @Test
    public void testResource_classpath(){
        ResourceTest resourceTest = (ResourceTest) ctx.getBean("resourceTest");
        try {
            resourceTest.resource_classpath();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testResource_file(){
        ResourceTest resourceTest = (ResourceTest) ctx.getBean("resourceTest");
        try {
            resourceTest.resource_file();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
