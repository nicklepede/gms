package com.google.android.gms.cast.mirroring.protocol;

import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.apfp;
import defpackage.apfv;
import defpackage.apfw;
import defpackage.fxxm;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class Stream {
    private String aesIvMask;
    private String aesKey;
    private Long bitRate;
    private Long channels;
    private apfp codecName;
    private String codecParameter;
    private String errorRecoveryMode;
    private long index;
    private Boolean intraRefreshEnable;
    private String level;
    private Long maxBitRate;
    private String maxFrameRate;
    private String profile;
    private String protection;
    private String receiverRtcpDscp;
    private boolean receiverRtcpEventLog;
    private List resolutions;
    private List rtpExtensions;
    private long rtpPayloadType;
    private String rtpProfile;
    private Long sampleRate;
    private long ssrc;
    private long storeTime;
    private long targetDelay;
    private String timeBase;
    private apfv type;

    public Stream(long j, apfv apfvVar, apfp apfpVar, long j2, long j3, String str, List list, boolean z, long j4, long j5, String str2, String str3, Long l, Long l2, Long l3, String str4, String str5, String str6, String str7, Long l4, String str8, String str9, List list2, Boolean bool, String str10, String str11) {
        fxxm.f(apfvVar, "type");
        fxxm.f(apfpVar, "codecName");
        fxxm.f(str, "rtpProfile");
        fxxm.f(list, "rtpExtensions");
        fxxm.f(str2, "timeBase");
        fxxm.f(str3, "errorRecoveryMode");
        this.index = j;
        this.type = apfvVar;
        this.codecName = apfpVar;
        this.ssrc = j2;
        this.rtpPayloadType = j3;
        this.rtpProfile = str;
        this.rtpExtensions = list;
        this.receiverRtcpEventLog = z;
        this.targetDelay = j4;
        this.storeTime = j5;
        this.timeBase = str2;
        this.errorRecoveryMode = str3;
        this.channels = l;
        this.bitRate = l2;
        this.sampleRate = l3;
        this.profile = str4;
        this.level = str5;
        this.codecParameter = str6;
        this.receiverRtcpDscp = str7;
        this.maxBitRate = l4;
        this.maxFrameRate = str8;
        this.protection = str9;
        this.resolutions = list2;
        this.intraRefreshEnable = bool;
        this.aesIvMask = str10;
        this.aesKey = str11;
    }

    public static /* synthetic */ Stream copy$default(Stream stream, long j, apfv apfvVar, apfp apfpVar, long j2, long j3, String str, List list, boolean z, long j4, long j5, String str2, String str3, Long l, Long l2, Long l3, String str4, String str5, String str6, String str7, Long l4, String str8, String str9, List list2, Boolean bool, String str10, String str11, int i, Object obj) {
        long j6;
        long j7;
        String str12;
        String str13;
        long j8;
        String str14;
        Long l5;
        Long l6;
        String str15;
        String str16;
        String str17;
        String str18;
        Long l7;
        String str19;
        String str20;
        List list3;
        Boolean bool2;
        Stream stream2;
        Long l8;
        String str21;
        apfv apfvVar2;
        apfp apfpVar2;
        long j9;
        long j10;
        String str22;
        List list4;
        boolean z2;
        long j11;
        long j12 = (i & 1) != 0 ? stream.index : j;
        apfv apfvVar3 = (i & 2) != 0 ? stream.type : apfvVar;
        apfp apfpVar3 = (i & 4) != 0 ? stream.codecName : apfpVar;
        long j13 = (i & 8) != 0 ? stream.ssrc : j2;
        long j14 = (i & 16) != 0 ? stream.rtpPayloadType : j3;
        String str23 = (i & 32) != 0 ? stream.rtpProfile : str;
        List list5 = (i & 64) != 0 ? stream.rtpExtensions : list;
        boolean z3 = (i & 128) != 0 ? stream.receiverRtcpEventLog : z;
        long j15 = (i & 256) != 0 ? stream.targetDelay : j4;
        if ((i & 512) != 0) {
            j6 = j12;
            j7 = stream.storeTime;
        } else {
            j6 = j12;
            j7 = j5;
        }
        long j16 = j7;
        String str24 = (i & 1024) != 0 ? stream.timeBase : str2;
        String str25 = (i & 2048) != 0 ? stream.errorRecoveryMode : str3;
        String str26 = str24;
        Long l9 = (i & 4096) != 0 ? stream.channels : l;
        Long l10 = (i & 8192) != 0 ? stream.bitRate : l2;
        Long l11 = (i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0 ? stream.sampleRate : l3;
        String str27 = (i & 32768) != 0 ? stream.profile : str4;
        String str28 = (i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0 ? stream.level : str5;
        String str29 = (i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) != 0 ? stream.codecParameter : str6;
        String str30 = (i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0 ? stream.receiverRtcpDscp : str7;
        Long l12 = (i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) != 0 ? stream.maxBitRate : l4;
        String str31 = (i & 1048576) != 0 ? stream.maxFrameRate : str8;
        String str32 = (i & 2097152) != 0 ? stream.protection : str9;
        List list6 = (i & 4194304) != 0 ? stream.resolutions : list2;
        Boolean bool3 = (i & 8388608) != 0 ? stream.intraRefreshEnable : bool;
        String str33 = (i & 16777216) != 0 ? stream.aesIvMask : str10;
        if ((i & 33554432) != 0) {
            str13 = str33;
            str12 = stream.aesKey;
            str14 = str26;
            l5 = l9;
            l6 = l10;
            str15 = str27;
            str16 = str28;
            str17 = str29;
            str18 = str30;
            l7 = l12;
            str19 = str31;
            str20 = str32;
            list3 = list6;
            bool2 = bool3;
            l8 = l11;
            str21 = str25;
            apfvVar2 = apfvVar3;
            apfpVar2 = apfpVar3;
            j9 = j13;
            j10 = j14;
            str22 = str23;
            list4 = list5;
            z2 = z3;
            j11 = j15;
            j8 = j16;
            stream2 = stream;
        } else {
            str12 = str11;
            str13 = str33;
            j8 = j16;
            str14 = str26;
            l5 = l9;
            l6 = l10;
            str15 = str27;
            str16 = str28;
            str17 = str29;
            str18 = str30;
            l7 = l12;
            str19 = str31;
            str20 = str32;
            list3 = list6;
            bool2 = bool3;
            stream2 = stream;
            l8 = l11;
            str21 = str25;
            apfvVar2 = apfvVar3;
            apfpVar2 = apfpVar3;
            j9 = j13;
            j10 = j14;
            str22 = str23;
            list4 = list5;
            z2 = z3;
            j11 = j15;
        }
        return stream2.copy(j6, apfvVar2, apfpVar2, j9, j10, str22, list4, z2, j11, j8, str14, str21, l5, l6, l8, str15, str16, str17, str18, l7, str19, str20, list3, bool2, str13, str12);
    }

    public final long component1() {
        return this.index;
    }

    public final long component10() {
        return this.storeTime;
    }

    public final String component11() {
        return this.timeBase;
    }

    public final String component12() {
        return this.errorRecoveryMode;
    }

    public final Long component13() {
        return this.channels;
    }

    public final Long component14() {
        return this.bitRate;
    }

    public final Long component15() {
        return this.sampleRate;
    }

    public final String component16() {
        return this.profile;
    }

    public final String component17() {
        return this.level;
    }

    public final String component18() {
        return this.codecParameter;
    }

    public final String component19() {
        return this.receiverRtcpDscp;
    }

    public final apfv component2() {
        return this.type;
    }

    public final Long component20() {
        return this.maxBitRate;
    }

    public final String component21() {
        return this.maxFrameRate;
    }

    public final String component22() {
        return this.protection;
    }

    public final List component23() {
        return this.resolutions;
    }

    public final Boolean component24() {
        return this.intraRefreshEnable;
    }

    public final String component25() {
        return this.aesIvMask;
    }

    public final String component26() {
        return this.aesKey;
    }

    public final apfp component3() {
        return this.codecName;
    }

    public final long component4() {
        return this.ssrc;
    }

    public final long component5() {
        return this.rtpPayloadType;
    }

    public final String component6() {
        return this.rtpProfile;
    }

    public final List component7() {
        return this.rtpExtensions;
    }

    public final boolean component8() {
        return this.receiverRtcpEventLog;
    }

    public final long component9() {
        return this.targetDelay;
    }

    public final Stream copy(long j, apfv apfvVar, apfp apfpVar, long j2, long j3, String str, List list, boolean z, long j4, long j5, String str2, String str3, Long l, Long l2, Long l3, String str4, String str5, String str6, String str7, Long l4, String str8, String str9, List list2, Boolean bool, String str10, String str11) {
        fxxm.f(apfvVar, "type");
        fxxm.f(apfpVar, "codecName");
        fxxm.f(str, "rtpProfile");
        fxxm.f(list, "rtpExtensions");
        fxxm.f(str2, "timeBase");
        fxxm.f(str3, "errorRecoveryMode");
        return new Stream(j, apfvVar, apfpVar, j2, j3, str, list, z, j4, j5, str2, str3, l, l2, l3, str4, str5, str6, str7, l4, str8, str9, list2, bool, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stream)) {
            return false;
        }
        Stream stream = (Stream) obj;
        return this.index == stream.index && this.type == stream.type && this.codecName == stream.codecName && this.ssrc == stream.ssrc && this.rtpPayloadType == stream.rtpPayloadType && fxxm.n(this.rtpProfile, stream.rtpProfile) && fxxm.n(this.rtpExtensions, stream.rtpExtensions) && this.receiverRtcpEventLog == stream.receiverRtcpEventLog && this.targetDelay == stream.targetDelay && this.storeTime == stream.storeTime && fxxm.n(this.timeBase, stream.timeBase) && fxxm.n(this.errorRecoveryMode, stream.errorRecoveryMode) && fxxm.n(this.channels, stream.channels) && fxxm.n(this.bitRate, stream.bitRate) && fxxm.n(this.sampleRate, stream.sampleRate) && fxxm.n(this.profile, stream.profile) && fxxm.n(this.level, stream.level) && fxxm.n(this.codecParameter, stream.codecParameter) && fxxm.n(this.receiverRtcpDscp, stream.receiverRtcpDscp) && fxxm.n(this.maxBitRate, stream.maxBitRate) && fxxm.n(this.maxFrameRate, stream.maxFrameRate) && fxxm.n(this.protection, stream.protection) && fxxm.n(this.resolutions, stream.resolutions) && fxxm.n(this.intraRefreshEnable, stream.intraRefreshEnable) && fxxm.n(this.aesIvMask, stream.aesIvMask) && fxxm.n(this.aesKey, stream.aesKey);
    }

    public final String getAesIvMask() {
        return this.aesIvMask;
    }

    public final String getAesKey() {
        return this.aesKey;
    }

    public final Long getBitRate() {
        return this.bitRate;
    }

    public final Long getChannels() {
        return this.channels;
    }

    public final apfp getCodecName() {
        return this.codecName;
    }

    public final String getCodecParameter() {
        return this.codecParameter;
    }

    public final String getErrorRecoveryMode() {
        return this.errorRecoveryMode;
    }

    public final long getIndex() {
        return this.index;
    }

    public final Boolean getIntraRefreshEnable() {
        return this.intraRefreshEnable;
    }

    public final String getLevel() {
        return this.level;
    }

    public final Long getMaxBitRate() {
        return this.maxBitRate;
    }

    public final String getMaxFrameRate() {
        return this.maxFrameRate;
    }

    public final String getProfile() {
        return this.profile;
    }

    public final String getProtection() {
        return this.protection;
    }

    public final String getReceiverRtcpDscp() {
        return this.receiverRtcpDscp;
    }

    public final boolean getReceiverRtcpEventLog() {
        return this.receiverRtcpEventLog;
    }

    public final List getResolutions() {
        return this.resolutions;
    }

    public final List getRtpExtensions() {
        return this.rtpExtensions;
    }

    public final long getRtpPayloadType() {
        return this.rtpPayloadType;
    }

    public final String getRtpProfile() {
        return this.rtpProfile;
    }

    public final Long getSampleRate() {
        return this.sampleRate;
    }

    public final long getSsrc() {
        return this.ssrc;
    }

    public final long getStoreTime() {
        return this.storeTime;
    }

    public final long getTargetDelay() {
        return this.targetDelay;
    }

    public final String getTimeBase() {
        return this.timeBase;
    }

    public final apfv getType() {
        return this.type;
    }

    public int hashCode() {
        int a = (((apfw.a(this.index) * 31) + this.type.hashCode()) * 31) + this.codecName.hashCode();
        int a2 = (((((((a * 31) + apfw.a(this.ssrc)) * 31) + apfw.a(this.rtpPayloadType)) * 31) + this.rtpProfile.hashCode()) * 31) + this.rtpExtensions.hashCode();
        int i = true != this.receiverRtcpEventLog ? 1237 : 1231;
        int a3 = (((((((((a2 * 31) + i) * 31) + apfw.a(this.targetDelay)) * 31) + apfw.a(this.storeTime)) * 31) + this.timeBase.hashCode()) * 31) + this.errorRecoveryMode.hashCode();
        Long l = this.channels;
        int hashCode = ((a3 * 31) + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.bitRate;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.sampleRate;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.profile;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.level;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.codecParameter;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.receiverRtcpDscp;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l4 = this.maxBitRate;
        int hashCode8 = (hashCode7 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str5 = this.maxFrameRate;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.protection;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.resolutions;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.intraRefreshEnable;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.aesIvMask;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.aesKey;
        return hashCode13 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void setAesIvMask(String str) {
        this.aesIvMask = str;
    }

    public final void setAesKey(String str) {
        this.aesKey = str;
    }

    public final void setBitRate(Long l) {
        this.bitRate = l;
    }

    public final void setChannels(Long l) {
        this.channels = l;
    }

    public final void setCodecName(apfp apfpVar) {
        fxxm.f(apfpVar, "<set-?>");
        this.codecName = apfpVar;
    }

    public final void setCodecParameter(String str) {
        this.codecParameter = str;
    }

    public final void setErrorRecoveryMode(String str) {
        fxxm.f(str, "<set-?>");
        this.errorRecoveryMode = str;
    }

    public final void setIndex(long j) {
        this.index = j;
    }

    public final void setIntraRefreshEnable(Boolean bool) {
        this.intraRefreshEnable = bool;
    }

    public final void setLevel(String str) {
        this.level = str;
    }

    public final void setMaxBitRate(Long l) {
        this.maxBitRate = l;
    }

    public final void setMaxFrameRate(String str) {
        this.maxFrameRate = str;
    }

    public final void setProfile(String str) {
        this.profile = str;
    }

    public final void setProtection(String str) {
        this.protection = str;
    }

    public final void setReceiverRtcpDscp(String str) {
        this.receiverRtcpDscp = str;
    }

    public final void setReceiverRtcpEventLog(boolean z) {
        this.receiverRtcpEventLog = z;
    }

    public final void setResolutions(List list) {
        this.resolutions = list;
    }

    public final void setRtpExtensions(List list) {
        fxxm.f(list, "<set-?>");
        this.rtpExtensions = list;
    }

    public final void setRtpPayloadType(long j) {
        this.rtpPayloadType = j;
    }

    public final void setRtpProfile(String str) {
        fxxm.f(str, "<set-?>");
        this.rtpProfile = str;
    }

    public final void setSampleRate(Long l) {
        this.sampleRate = l;
    }

    public final void setSsrc(long j) {
        this.ssrc = j;
    }

    public final void setStoreTime(long j) {
        this.storeTime = j;
    }

    public final void setTargetDelay(long j) {
        this.targetDelay = j;
    }

    public final void setTimeBase(String str) {
        fxxm.f(str, "<set-?>");
        this.timeBase = str;
    }

    public final void setType(apfv apfvVar) {
        fxxm.f(apfvVar, "<set-?>");
        this.type = apfvVar;
    }

    public String toString() {
        return "Stream(index=" + this.index + ", type=" + this.type + ", codecName=" + this.codecName + ", ssrc=" + this.ssrc + ", rtpPayloadType=" + this.rtpPayloadType + ", rtpProfile=" + this.rtpProfile + ", rtpExtensions=" + this.rtpExtensions + ", receiverRtcpEventLog=" + this.receiverRtcpEventLog + ", targetDelay=" + this.targetDelay + ", storeTime=" + this.storeTime + ", timeBase=" + this.timeBase + ", errorRecoveryMode=" + this.errorRecoveryMode + ", channels=" + this.channels + ", bitRate=" + this.bitRate + ", sampleRate=" + this.sampleRate + ", profile=" + this.profile + ", level=" + this.level + ", codecParameter=" + this.codecParameter + ", receiverRtcpDscp=" + this.receiverRtcpDscp + ", maxBitRate=" + this.maxBitRate + ", maxFrameRate=" + this.maxFrameRate + ", protection=" + this.protection + ", resolutions=" + this.resolutions + ", intraRefreshEnable=" + this.intraRefreshEnable + ", aesIvMask=" + this.aesIvMask + ", aesKey=" + this.aesKey + ")";
    }

    public /* synthetic */ Stream(long j, apfv apfvVar, apfp apfpVar, long j2, long j3, String str, List list, boolean z, long j4, long j5, String str2, String str3, Long l, Long l2, Long l3, String str4, String str5, String str6, String str7, Long l4, String str8, String str9, List list2, Boolean bool, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, apfvVar, apfpVar, j2, j3, str, list, z, j4, j5, str2, str3, (i & 4096) != 0 ? null : l, (i & 8192) != 0 ? null : l2, (i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0 ? null : l3, (32768 & i) != 0 ? null : str4, (65536 & i) != 0 ? null : str5, (131072 & i) != 0 ? null : str6, (262144 & i) != 0 ? null : str7, (524288 & i) != 0 ? null : l4, (1048576 & i) != 0 ? null : str8, (2097152 & i) != 0 ? null : str9, (4194304 & i) != 0 ? null : list2, (8388608 & i) != 0 ? null : bool, (16777216 & i) != 0 ? null : str10, (i & 33554432) != 0 ? null : str11);
    }
}
