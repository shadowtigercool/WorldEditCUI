package org.enginehub.worldeditcui.fabric;

import com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13;
import org.enginehub.worldeditcui.network.CUIEventPayload;

public class ViaFabricPlusHook {
    public static void enable() {
        Protocol1_12_2To1_13.MAPPINGS.getChannelMappings().put(CUINetworking.CHANNEL_LEGACY, CUIEventPayload.TYPE.id().toString());
    }
}
