package by.mk.training.phonestation.dataaccess.impl;

import by.mk.training.phonestation.dataaccess.PaymentDao;
import by.mk.training.phonestation.datamodel.Payment;

public class PaymentDaoImpl extends AbstractDaoImpl<Payment, Long> implements PaymentDao {

	protected PaymentDaoImpl(Class<Payment> entityClass) {
		super(entityClass);
	}
}
