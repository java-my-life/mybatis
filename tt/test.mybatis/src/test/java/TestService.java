
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.entity.User;
import test.service.UserService;
import tk.mybatis.mapper.common.Mapper;


@RunWith(SpringJUnit4ClassRunner.class) //
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestService {
	@Autowired
	UserService userService;
	 @Autowired
	private Mapper<User> mapper;
	@Test
	public void test(){
		List<User> list = mapper.selectAll();
		System.out.println(list.size());
		
	}
	@Test
	public void insert(){
		User user = new User();
		user.setUsername("aa");
		user.setPassword("aa");
		mapper.insert(user);
	}
}
