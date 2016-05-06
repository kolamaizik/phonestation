package by.mk.training.phonestation.service;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.mk.training.phonestation.datamodel.Measure;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:service-context-test.xml" })
public class MeasureTest {

	@Inject
	private MeasuresService measureService;

	Measure measure = new Measure();

	@Before
	public void testBefire() {
		measure.setName("Mes 1");
		measure.setValue(2.5);

		measureService.insert(measure);
	}

	@Test
	public void testInsert() {
		Measure regMes = measureService.getMeasures(measure.getId());
		Assert.assertNotNull(regMes);
	}

	@Test
	public void testUpd() {
		measure.setName("update mes1");
		measure.setValue(3.5);
		measureService.update(measure);

		Measure regMes = measureService.getMeasures(measure.getId());
		Assert.assertNotNull(regMes);
	}

}