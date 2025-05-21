package com.google.android.gms.cast.mirroring.protocol;

import defpackage.anek;
import defpackage.fvbo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class Tags {
    private final String encodedVideoFilePath;
    private final long maxBitrate;
    private final String maxFramerate;
    private final long minLatency;
    private final String receiverProductName;
    private final String receiverVersion;
    private final String resolution;
    private final String senderBuild;
    private final long senderGmsCoreVersion;
    private final String senderModel;
    private final String senderPlatform;
    private final String senderVersion;

    public Tags(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j3, String str9) {
        fvbo.f(str3, "receiverProductName");
        fvbo.f(str4, "receiverVersion");
        fvbo.f(str5, "senderPlatform");
        fvbo.f(str6, "senderBuild");
        fvbo.f(str7, "senderModel");
        fvbo.f(str8, "senderVersion");
        this.maxBitrate = j;
        this.minLatency = j2;
        this.resolution = str;
        this.maxFramerate = str2;
        this.receiverProductName = str3;
        this.receiverVersion = str4;
        this.senderPlatform = str5;
        this.senderBuild = str6;
        this.senderModel = str7;
        this.senderVersion = str8;
        this.senderGmsCoreVersion = j3;
        this.encodedVideoFilePath = str9;
    }

    public final long component1() {
        return this.maxBitrate;
    }

    public final String component10() {
        return this.senderVersion;
    }

    public final long component11() {
        return this.senderGmsCoreVersion;
    }

    public final String component12() {
        return this.encodedVideoFilePath;
    }

    public final long component2() {
        return this.minLatency;
    }

    public final String component3() {
        return this.resolution;
    }

    public final String component4() {
        return this.maxFramerate;
    }

    public final String component5() {
        return this.receiverProductName;
    }

    public final String component6() {
        return this.receiverVersion;
    }

    public final String component7() {
        return this.senderPlatform;
    }

    public final String component8() {
        return this.senderBuild;
    }

    public final String component9() {
        return this.senderModel;
    }

    public final Tags copy(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j3, String str9) {
        fvbo.f(str3, "receiverProductName");
        fvbo.f(str4, "receiverVersion");
        fvbo.f(str5, "senderPlatform");
        fvbo.f(str6, "senderBuild");
        fvbo.f(str7, "senderModel");
        fvbo.f(str8, "senderVersion");
        return new Tags(j, j2, str, str2, str3, str4, str5, str6, str7, str8, j3, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tags)) {
            return false;
        }
        Tags tags = (Tags) obj;
        return this.maxBitrate == tags.maxBitrate && this.minLatency == tags.minLatency && fvbo.n(this.resolution, tags.resolution) && fvbo.n(this.maxFramerate, tags.maxFramerate) && fvbo.n(this.receiverProductName, tags.receiverProductName) && fvbo.n(this.receiverVersion, tags.receiverVersion) && fvbo.n(this.senderPlatform, tags.senderPlatform) && fvbo.n(this.senderBuild, tags.senderBuild) && fvbo.n(this.senderModel, tags.senderModel) && fvbo.n(this.senderVersion, tags.senderVersion) && this.senderGmsCoreVersion == tags.senderGmsCoreVersion && fvbo.n(this.encodedVideoFilePath, tags.encodedVideoFilePath);
    }

    public final String getEncodedVideoFilePath() {
        return this.encodedVideoFilePath;
    }

    public final long getMaxBitrate() {
        return this.maxBitrate;
    }

    public final String getMaxFramerate() {
        return this.maxFramerate;
    }

    public final long getMinLatency() {
        return this.minLatency;
    }

    public final String getReceiverProductName() {
        return this.receiverProductName;
    }

    public final String getReceiverVersion() {
        return this.receiverVersion;
    }

    public final String getResolution() {
        return this.resolution;
    }

    public final String getSenderBuild() {
        return this.senderBuild;
    }

    public final long getSenderGmsCoreVersion() {
        return this.senderGmsCoreVersion;
    }

    public final String getSenderModel() {
        return this.senderModel;
    }

    public final String getSenderPlatform() {
        return this.senderPlatform;
    }

    public final String getSenderVersion() {
        return this.senderVersion;
    }

    public int hashCode() {
        String str = this.resolution;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.maxBitrate;
        long j2 = this.minLatency;
        String str2 = this.maxFramerate;
        int a = (((((((((((((((((anek.a(j) * 31) + anek.a(j2)) * 31) + hashCode) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.receiverProductName.hashCode()) * 31) + this.receiverVersion.hashCode()) * 31) + this.senderPlatform.hashCode()) * 31) + this.senderBuild.hashCode()) * 31) + this.senderModel.hashCode()) * 31) + this.senderVersion.hashCode();
        long j3 = this.senderGmsCoreVersion;
        String str3 = this.encodedVideoFilePath;
        return (((a * 31) + anek.a(j3)) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "Tags(maxBitrate=" + this.maxBitrate + ", minLatency=" + this.minLatency + ", resolution=" + this.resolution + ", maxFramerate=" + this.maxFramerate + ", receiverProductName=" + this.receiverProductName + ", receiverVersion=" + this.receiverVersion + ", senderPlatform=" + this.senderPlatform + ", senderBuild=" + this.senderBuild + ", senderModel=" + this.senderModel + ", senderVersion=" + this.senderVersion + ", senderGmsCoreVersion=" + this.senderGmsCoreVersion + ", encodedVideoFilePath=" + this.encodedVideoFilePath + ")";
    }

    public /* synthetic */ Tags(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j3, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, str3, str4, str5, str6, str7, str8, j3, (i & 2048) != 0 ? null : str9);
    }
}
