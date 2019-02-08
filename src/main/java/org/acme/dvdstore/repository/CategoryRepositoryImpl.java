package org.acme.dvdstore.repository;

import java.util.concurrent.atomic.AtomicLong;

import org.acme.dvdstore.model.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryRepositoryImpl extends AbstractRepository<Category> implements CategoryRepository {
	private final AtomicLong SEQUENCE = new AtomicLong(1);

	@Override
	public AtomicLong getSequence() {
		return SEQUENCE;
	}
}
