package cn.macrotea.showcase.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {
        "classpath*:app-*"
    }
)
@RunWith(SpringJUnit4ClassRunner.class)
public class AbstractSpringTests extends AbstractJUnit4SpringContextTests {

    @Test
    public void testTemplate() {
        //assertEquals("a","a");
    }
}
