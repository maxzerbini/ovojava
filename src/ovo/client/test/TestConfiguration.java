package ovo.client.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

import ovo.client.model.Configuration;

public class TestConfiguration {

	Configuration _sut;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLoadFromFile() {
		try {
			_sut = Configuration.loadFromFile("config.json");
			System.out.println(_sut.ClusterNodes.get(0).getHost());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		assertTrue(_sut != null);
	}

}
