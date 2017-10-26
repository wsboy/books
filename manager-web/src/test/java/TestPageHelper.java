import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.dao.ItemDao;
import com.taotao.pojo.Item;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * User: wangpengbo
 * Date: 2017/9/14
 * Time: 下午1:16
 */
public class TestPageHelper {

    @Test
    public void testPageHelper() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:applicationContext-*.xml");
        System.out.println(applicationContext);
        ItemDao itemDao = applicationContext.getBean(ItemDao.class);
        PageHelper.startPage(2, 10);
        List<Item> list = itemDao.getItemsByPrice(20000L);
        for (Item item : list) {
            System.out.println(item.getTitle());
        }
        PageInfo<Item> pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        System.out.println("共有商品：" + total);
    }
}
