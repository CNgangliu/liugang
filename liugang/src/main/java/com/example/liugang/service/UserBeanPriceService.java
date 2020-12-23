package com.example.liugang.service;


import com.example.liugang.model.UserBeanPrice;
import com.example.liugang.repository.UserBeanPriceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author liugang
 * @Classname UserBeanPriceService
 * http://doc.internal.taqu.cn/pages/viewpage.action?pageId=13292941
 * @Description 用户趣豆单价
 * @Date 2020/12/8 10:33
 */
@Service
@Transactional
public class UserBeanPriceService {
	@Autowired
	private UserBeanPriceDao userBeanPriceDao;

	//3.循环写入数据
	public Integer statistic() {
		UserBeanPrice userBeanPrice = new UserBeanPrice();
		userBeanPrice.setAccountUuid("aaaa1231");
		userBeanPrice.setMonth(12);
		userBeanPrice.setYear(2020);
		//写入数据
		for (int i = 0; i < 6; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
			userBeanPriceDao.save(userBeanPrice);
			if (i == 5) {
				userBeanPrice.setAccountUuid(null);
			}
			System.out.println(userBeanPrice.getAccountUuid());
		}


		return 1000;
	}
}
