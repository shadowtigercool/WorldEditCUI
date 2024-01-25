package org.enginehub.worldeditcui.fabric;

import com.viaversion.viaversion.protocols.protocol1_13to1_12_2.Protocol1_13To1_12_2;
import org.enginehub.worldeditcui.network.CUIEventPayload;

public class ViaFabricPlusHook {
    public static void enable() {
        Protocol1_13To1_12_2.MAPPINGS.getChannelMappings().put(CUINetworking.CHANNEL_LEGACY, CUIEventPayload.TYPE.id().toString());
    }
}
