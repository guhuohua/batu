package com.ch.ch;

import com.ch.dao.BtSysMenuMapper;
import com.ch.entity.BtSysMenu;
import com.ch.util.IdUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChApplicationTests {

	@Autowired
	BtSysMenuMapper btSysMenuMapper;

//	@Test
	public void contextLoads() {
		BtSysMenu menu  = new BtSysMenu();
		menu.setMenuId(IdUtil.createIdByUUID());
		menu.setName("测试");
		btSysMenuMapper.insert(menu);
	}

}
