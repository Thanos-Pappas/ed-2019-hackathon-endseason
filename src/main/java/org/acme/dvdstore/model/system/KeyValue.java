package org.acme.dvdstore.model.system;

import lombok.Value;

@Value
public class KeyValue<K, V> {
	private final K key;
	private final V value;
}
