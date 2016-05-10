package by.mk.training.phonestation.service;

import java.math.BigDecimal;
import java.util.Date;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.mk.training.phonestation.datamodel.Price;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:service-context-test.xml" })
public class PriceTest {

	@Inject
	private PriceService priceService;
	
	@Inject
	private ServiceService serviceService;

	Price price = new Price();

	@Before
	public void testBefire() {
		price.setPrice(new BigDecimal(1.0));
		price.setDateBegin(new Date());
		price.setService(serviceService.getServices(new Long(1)));

		priceService.insert(price);
	}

	@Test
	public void testInsert() {
		Price regPrice = priceService.getPrice(price.getId());
		Assert.assertNotNull(regPrice);
	}

	@Test
	public void testUpd() {
		price.setPrice(new BigDecimal(2.1));
		price.setDateBegin(new Date());
		priceService.update(price);

		Price regPrice = priceService.getPrice(price.getId());
		Assert.assertNotNull(regPrice);
	}
}