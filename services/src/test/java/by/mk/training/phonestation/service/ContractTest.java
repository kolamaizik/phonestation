package by.mk.training.phonestation.service;

import java.util.Date;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.mk.training.phonestation.datamodel.Contract;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:service-context-test.xml" })
public class ContractTest {

	@Inject
	private ContractService contractService;
	
	@Inject
	private UserProfileService userProfileService;

	Contract contract = new Contract();

	@Before
	public void testBefire() {
		contract.setDateBegin(new Date());
		contract.setDateEnd(new Date());
		contract.setPhoneNumber(1234);
		contract.setUser(userProfileService.getUserProfile(new Long(33)));

		contractService.insert(contract);
	}

	@Test
	public void testInsert() {
		Contract regContract = contractService.getContract(contract.getId());
		Assert.assertNotNull(regContract);
	}

	@Test
	public void testUpd() {
		contract.setPhoneNumber(4321);
		contractService.update(contract);

		Contract regContract = contractService.getContract(contract.getId());
		Assert.assertNotNull(regContract);
	}

}