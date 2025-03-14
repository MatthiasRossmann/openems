package io.openems.edge.core.appmanager.validator.relaycount;

import static java.util.Collections.emptyMap;

import java.util.Map;

public class CheckRelayCountFilters {

	/**
	 * Creates a {@link InjectableComponentConfig} for a
	 * {@link CheckRelayCountFilter} which filters home relay contacts.
	 * 
	 * @param onlyHighVoltageRelays determines which relay channels are disabled
	 * @return the {@link InjectableComponentConfig}
	 */
	public static InjectableComponentConfig feneconHome(boolean onlyHighVoltageRelays) {
		return new InjectableComponentConfig(HomeFilter.COMPONENT_NAME, Map.of(//
				"onlyHighVoltageRelays", onlyHighVoltageRelays //
		));
	}

	/**
	 * Creates a {@link InjectableComponentConfig} for a
	 * {@link CheckRelayCountFilter} which filters device hardware contacts.
	 * 
	 * @return the {@link InjectableComponentConfig}
	 */
	public static InjectableComponentConfig deviceHardware() {
		return new InjectableComponentConfig(DeviceHardwareFilter.COMPONENT_NAME, emptyMap());
	}

}