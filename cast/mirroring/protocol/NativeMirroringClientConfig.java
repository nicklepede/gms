package com.google.android.gms.cast.mirroring.protocol;

import defpackage.fvbo;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class NativeMirroringClientConfig {
    private final int appUid;
    private final Tags extraData;
    private final long maxTargetDelay;
    private final String remoteFriendlyName;
    private final List sendFormats;

    public NativeMirroringClientConfig(List list, String str, long j, int i, Tags tags) {
        fvbo.f(list, "sendFormats");
        fvbo.f(str, "remoteFriendlyName");
        fvbo.f(tags, "extraData");
        this.sendFormats = list;
        this.remoteFriendlyName = str;
        this.maxTargetDelay = j;
        this.appUid = i;
        this.extraData = tags;
    }

    public static /* synthetic */ NativeMirroringClientConfig copy$default(NativeMirroringClientConfig nativeMirroringClientConfig, List list, String str, long j, int i, Tags tags, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = nativeMirroringClientConfig.sendFormats;
        }
        if ((i2 & 2) != 0) {
            str = nativeMirroringClientConfig.remoteFriendlyName;
        }
        if ((i2 & 4) != 0) {
            j = nativeMirroringClientConfig.maxTargetDelay;
        }
        if ((i2 & 8) != 0) {
            i = nativeMirroringClientConfig.appUid;
        }
        if ((i2 & 16) != 0) {
            tags = nativeMirroringClientConfig.extraData;
        }
        long j2 = j;
        return nativeMirroringClientConfig.copy(list, str, j2, i, tags);
    }

    public final List component1() {
        return this.sendFormats;
    }

    public final String component2() {
        return this.remoteFriendlyName;
    }

    public final long component3() {
        return this.maxTargetDelay;
    }

    public final int component4() {
        return this.appUid;
    }

    public final Tags component5() {
        return this.extraData;
    }

    public final NativeMirroringClientConfig copy(List list, String str, long j, int i, Tags tags) {
        fvbo.f(list, "sendFormats");
        fvbo.f(str, "remoteFriendlyName");
        fvbo.f(tags, "extraData");
        return new NativeMirroringClientConfig(list, str, j, i, tags);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeMirroringClientConfig)) {
            return false;
        }
        NativeMirroringClientConfig nativeMirroringClientConfig = (NativeMirroringClientConfig) obj;
        return fvbo.n(this.sendFormats, nativeMirroringClientConfig.sendFormats) && fvbo.n(this.remoteFriendlyName, nativeMirroringClientConfig.remoteFriendlyName) && this.maxTargetDelay == nativeMirroringClientConfig.maxTargetDelay && this.appUid == nativeMirroringClientConfig.appUid && fvbo.n(this.extraData, nativeMirroringClientConfig.extraData);
    }

    public final int getAppUid() {
        return this.appUid;
    }

    public final Tags getExtraData() {
        return this.extraData;
    }

    public final long getMaxTargetDelay() {
        return this.maxTargetDelay;
    }

    public final String getRemoteFriendlyName() {
        return this.remoteFriendlyName;
    }

    public final List getSendFormats() {
        return this.sendFormats;
    }

    public int hashCode() {
        int hashCode = (this.sendFormats.hashCode() * 31) + this.remoteFriendlyName.hashCode();
        long j = this.maxTargetDelay;
        return (((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.appUid) * 31) + this.extraData.hashCode();
    }

    public String toString() {
        return "NativeMirroringClientConfig(sendFormats=" + this.sendFormats + ", remoteFriendlyName=" + this.remoteFriendlyName + ", maxTargetDelay=" + this.maxTargetDelay + ", appUid=" + this.appUid + ", extraData=" + this.extraData + ")";
    }
}
