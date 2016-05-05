package by.mk.training.phonestation.service;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.mk.training.phonestation.datamodel.Measures;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:service-context-test.xml" })
public class MeasureTest {
	
	@Inject
	private MeasuresService measureService;
	
	Measures measureIns = new Measures();
	
	@Test
	public void testInsert() {
		measureIns.setName("Mes 1");
		measureIns.setValue(2.5);
		
		measureService.insert(measureIns);
		
		Measures regMes = measureService.getMeasures(measureIns.getId());

        Assert.assertNotNull(regMes);
	}
	
}