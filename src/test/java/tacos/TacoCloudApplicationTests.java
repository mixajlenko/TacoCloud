package tacos;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) //@RunWith это в JUnit аннотации, обеспечение выполнения тестов, которая ведет JUnit в выполнении теста
@SpringBootTest(classes = TacoCloudApplication.class) // замена привычному SpringJUnit4ClassRunner
public class TacoCloudApplicationTests {

    @Test
    public void contextLoads(){
        System.out.println("Hi there");
    }
}
