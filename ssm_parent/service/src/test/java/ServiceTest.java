import com.xl.pojo.Items;
import com.xl.service.ItemsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService itemsService = (ItemsService)applicationContext.getBean("itemsServiceImpl");
        Items items = new Items();
        items.setName("测试事务");
        itemsService.save(items);
    }
}
