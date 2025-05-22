package com.google.android.gms.cast.mirroring.protocol;

import defpackage.apfs;
import defpackage.euei;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class NativeMirroringClientConfigWithIpAddress {
    public static final apfs Companion = new apfs();
    private static final euei gson = new euei();
    private final String ipAddress;
    private final NativeMirroringClientConfig jsonConfig;

    public NativeMirroringClientConfigWithIpAddress(String str, NativeMirroringClientConfig nativeMirroringClientConfig) {
        fxxm.f(str, "ipAddress");
        fxxm.f(nativeMirroringClientConfig, "jsonConfig");
        this.ipAddress = str;
        this.jsonConfig = nativeMirroringClientConfig;
    }

    public static /* synthetic */ NativeMirroringClientConfigWithIpAddress copy$default(NativeMirroringClientConfigWithIpAddress nativeMirroringClientConfigWithIpAddress, String str, NativeMirroringClientConfig nativeMirroringClientConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeMirroringClientConfigWithIpAddress.ipAddress;
        }
        if ((i & 2) != 0) {
            nativeMirroringClientConfig = nativeMirroringClientConfigWithIpAddress.jsonConfig;
        }
        return nativeMirroringClientConfigWithIpAddress.copy(str, nativeMirroringClientConfig);
    }

    public final String component1() {
        return this.ipAddress;
    }

    public final NativeMirroringClientConfig component2() {
        return this.jsonConfig;
    }

    public final NativeMirroringClientConfigWithIpAddress copy(String str, NativeMirroringClientConfig nativeMirroringClientConfig) {
        fxxm.f(str, "ipAddress");
        fxxm.f(nativeMirroringClientConfig, "jsonConfig");
        return new NativeMirroringClientConfigWithIpAddress(str, nativeMirroringClientConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeMirroringClientConfigWithIpAddress)) {
            return false;
        }
        NativeMirroringClientConfigWithIpAddress nativeMirroringClientConfigWithIpAddress = (NativeMirroringClientConfigWithIpAddress) obj;
        return fxxm.n(this.ipAddress, nativeMirroringClientConfigWithIpAddress.ipAddress) && fxxm.n(this.jsonConfig, nativeMirroringClientConfigWithIpAddress.jsonConfig);
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final NativeMirroringClientConfig getJsonConfig() {
        return this.jsonConfig;
    }

    public int hashCode() {
        return (this.ipAddress.hashCode() * 31) + this.jsonConfig.hashCode();
    }

    public String toString() {
        return "NativeMirroringClientConfigWithIpAddress(ipAddress=" + this.ipAddress + ", jsonConfig=" + this.jsonConfig + ")";
    }
}
