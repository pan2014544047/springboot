package com.cn.test;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cn.bean.User;
import com.cn.repository.UserRepository;
import com.cn.springboot.HelloController;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ApplicationTests.class)
public class ApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void test() throws Exception {

		// ����10����¼
		userRepository.save(new User("AAA", 10));
		userRepository.save(new User("BBB", 20));
		userRepository.save(new User("CCC", 30));
		userRepository.save(new User("DDD", 40));
		userRepository.save(new User("EEE", 50));
		userRepository.save(new User("FFF", 60));
		userRepository.save(new User("GGG", 70));
		userRepository.save(new User("HHH", 80));
		userRepository.save(new User("III", 90));
		userRepository.save(new User("JJJ", 100));

		// ����findAll, ��ѯ���м�¼
		Assert.assertEquals(10, userRepository.findAll().size());

		// ����findByName, ��ѯ����ΪFFF��User
		Assert.assertEquals(60, userRepository.findByName("FFF").getAge().longValue());

		// ����findUser, ��ѯ����ΪFFF��User
		Assert.assertEquals(60, userRepository.findUser("FFF").getAge().longValue());

		// ����findByNameAndAge, ��ѯ����ΪFFF��������Ϊ60��User
		Assert.assertEquals("FFF", userRepository.findByNameAndAge("FFF", 60).getName());

		// ����ɾ������ΪAAA��User
		userRepository.delete(userRepository.findByName("AAA"));

		// ����findAll, ��ѯ���м�¼, ��֤�����ɾ���Ƿ�ɹ�
		Assert.assertEquals(9, userRepository.findAll().size());

	}


}