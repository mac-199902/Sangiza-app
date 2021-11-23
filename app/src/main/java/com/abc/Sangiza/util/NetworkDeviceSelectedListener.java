package com.abc.Sangiza.util;

import com.abc.Sangiza.model.NetworkDevice;

public interface NetworkDeviceSelectedListener
{
    boolean onNetworkDeviceSelected(NetworkDevice networkDevice, NetworkDevice.Connection connection);

    boolean isListenerEffective();
}
