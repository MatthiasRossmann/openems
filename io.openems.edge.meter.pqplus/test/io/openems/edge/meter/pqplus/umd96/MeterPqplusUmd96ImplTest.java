package io.openems.edge.meter.pqplus.umd96;

import static io.openems.common.types.MeterType.GRID;

import org.junit.Test;

import io.openems.edge.bridge.modbus.test.DummyModbusBridge;
import io.openems.edge.common.test.ComponentTest;
import io.openems.edge.common.test.DummyConfigurationAdmin;

public class MeterPqplusUmd96ImplTest {

	@Test
	public void test() throws Exception {
		new ComponentTest(new MeterPqplusUmd96Impl()) //
				.addReference("cm", new DummyConfigurationAdmin()) //
				.addReference("setModbus", new DummyModbusBridge("modbus0")) //
				.activate(MyConfig.create() //
						.setId("meter0") //
						.setModbusId("modbus0") //
						.setType(GRID) //
						.build()) //
		;
	}

}
