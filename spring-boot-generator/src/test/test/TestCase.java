package test;

import com.boot.generator.GeneratorApplication;
import com.boot.sample.mapper.UserMapper;
import com.boot.sample.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GeneratorApplication.class)
public class TestCase {

        @Autowired
        private UserMapper userMapper;
    @Test
    public void insert(){

        User u =new User();
//        u.setId(25l);
        u.setPassword("1234556");
        u.setUsername("huadusfhu");
        u.setSex(1);
        userMapper.insert(u);

    }



    @Test
    public void findall(){
        userMapper.selectAll().forEach(e->System.out.println(e.getId()+"\t"+e.getUsername()));

    }
}
