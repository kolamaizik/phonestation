package by.mk.training.phonestation.service;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.mk.training.phonestation.datamodel.Services;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:service-context-test.xml" })
public class ServicesTest {

	@Inject
	private ServiceService serviceService;

	Services service = new Services();

	@Before
	public void testBefire() {
		service.setName("Serv 1");

		serviceService.insert(service);
	}

	@Test
	public void testInsert() {
		Services regSer = serviceService.getServices(service.getId());
		Assert.assertNotNull(regSer);
	}

	@Test
	public void testUpd() {
		service.setName("update ser 1");
		serviceService.update(service);

		Services regSer = serviceService.getServices(service.getId());
		Assert.assertNotNull(regSer);
	}

}