/**
 * packageName  : hello.core.beanfind
 * fileName     : ApplicationContextTest
 * author       : slykid
 * date         : 25. 3. 17.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 3. 17.          slykid         최초작성
 */
package hello.core.beanfind;


import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean()
    {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String beanName : beanDefinitionNames)
        {
            Object bean = ac.getBean(beanName);
            System.out.println("name = " + beanName + " object = " + bean);
        }
    }

    @Test
    @DisplayName("애플리케이션 빈 출력하기")
    void findAppBean()
    {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String beanName : beanDefinitionNames)
        {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanName);

            // ROLE_APPLICATION: 직접 등록한 Application Bean
            // ROLE_INFRASTRUCTURE: 스프링 내부에서 사용하는 Bean
            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION)
            {
                Object bean = ac.getBean(beanName);
                System.out.println("name = " + beanName + " object = " + bean);
            }
        }
    }
}
