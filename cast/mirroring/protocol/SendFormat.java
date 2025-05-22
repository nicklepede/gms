package com.google.android.gms.cast.mirroring.protocol;

import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.apfp;
import defpackage.apfu;
import defpackage.apfv;
import defpackage.eufe;
import defpackage.fxqz;
import defpackage.fxtb;
import defpackage.fxxm;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class SendFormat {
    public static final Companion Companion = new Companion(null);
    private static final Map codecName = fxtb.f(new fxqz(apfp.a, "aac_ld_adts"), new fxqz(apfp.b, "opus"), new fxqz(apfp.c, "h264"), new fxqz(apfp.d, "h265"), new fxqz(apfp.e, "vp8"), new fxqz(apfp.f, "vp9"), new fxqz(apfp.g, "av1"));

    @eufe(a = "aes-iv-mask")
    private final String aesIvMask;

    @eufe(a = "aes-key")
    private final String aesKey;

    @eufe(a = "bit_rate")
    private final Long bitRate;

    @eufe(a = "channels")
    private final Long channels;

    @eufe(a = "codec_name")
    private final String codecName$1;

    @eufe(a = "error_recovery_mode")
    private final String errorRecoveryMode;
    private final long index;

    @eufe(a = "key_frame_refresh_interval")
    private final Long keyFrameRefreshInterval;

    @eufe(a = "max_bit_rate")
    private final Long maxBitRate;

    @eufe(a = "max_frame_rate")
    private final String maxFrameRate;

    @eufe(a = "receiver_events")
    private final Boolean receiverEvents;

    @eufe(a = "remote_rtp_port")
    private final long remoteRtpPort;

    @eufe(a = "remote_ssrc")
    private final Long remoteSsrc;
    private final List resolutions;

    @eufe(a = "rtp_extensions")
    private final List rtpExtensions;

    @eufe(a = "rtp_payload_type")
    private final long rtpPayloadType;

    @eufe(a = "rtp_port")
    private final long rtpPort;

    @eufe(a = "rtp_profile")
    private final String rtpProfile;

    @eufe(a = "sample_rate")
    private final Long sampleRate;
    private final long ssrc;

    @eufe(a = "store_time")
    private final long storeTime;

    @eufe(a = "time_base")
    private final long timeBase;
    private final apfv type;

    @eufe(a = "use_intra_macroblock_cyclic_mode")
    private final Boolean useIntraMacroblockCyclicMode;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Companion {
        private Companion() {
        }

        public final Map getCodecName() {
            return SendFormat.codecName;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SendFormat(apfv apfvVar, long j, long j2, long j3, long j4, long j5, Long l, List list, Boolean bool, String str, String str2, long j6, long j7, String str3, String str4, Long l2, Long l3, Long l4, Long l5, String str5, List list2, String str6, Boolean bool2, Long l6) {
        fxxm.f(apfvVar, "type");
        fxxm.f(str, "codecName");
        fxxm.f(str2, "rtpProfile");
        this.type = apfvVar;
        this.index = j;
        this.ssrc = j2;
        this.rtpPayloadType = j3;
        this.rtpPort = j4;
        this.remoteRtpPort = j5;
        this.remoteSsrc = l;
        this.rtpExtensions = list;
        this.receiverEvents = bool;
        this.codecName$1 = str;
        this.rtpProfile = str2;
        this.timeBase = j6;
        this.storeTime = j7;
        this.aesKey = str3;
        this.aesIvMask = str4;
        this.channels = l2;
        this.sampleRate = l3;
        this.bitRate = l4;
        this.maxBitRate = l5;
        this.maxFrameRate = str5;
        this.resolutions = list2;
        this.errorRecoveryMode = str6;
        this.useIntraMacroblockCyclicMode = bool2;
        this.keyFrameRefreshInterval = l6;
    }

    public static /* synthetic */ SendFormat copy$default(SendFormat sendFormat, apfv apfvVar, long j, long j2, long j3, long j4, long j5, Long l, List list, Boolean bool, String str, String str2, long j6, long j7, String str3, String str4, Long l2, Long l3, Long l4, Long l5, String str5, List list2, String str6, Boolean bool2, Long l6, int i, Object obj) {
        Long l7;
        Boolean bool3;
        apfv apfvVar2 = (i & 1) != 0 ? sendFormat.type : apfvVar;
        long j8 = (i & 2) != 0 ? sendFormat.index : j;
        long j9 = (i & 4) != 0 ? sendFormat.ssrc : j2;
        long j10 = (i & 8) != 0 ? sendFormat.rtpPayloadType : j3;
        long j11 = (i & 16) != 0 ? sendFormat.rtpPort : j4;
        long j12 = (i & 32) != 0 ? sendFormat.remoteRtpPort : j5;
        Long l8 = (i & 64) != 0 ? sendFormat.remoteSsrc : l;
        List list3 = (i & 128) != 0 ? sendFormat.rtpExtensions : list;
        Boolean bool4 = (i & 256) != 0 ? sendFormat.receiverEvents : bool;
        apfv apfvVar3 = apfvVar2;
        String str7 = (i & 512) != 0 ? sendFormat.codecName$1 : str;
        String str8 = (i & 1024) != 0 ? sendFormat.rtpProfile : str2;
        long j13 = j8;
        long j14 = (i & 2048) != 0 ? sendFormat.timeBase : j6;
        long j15 = (i & 4096) != 0 ? sendFormat.storeTime : j7;
        String str9 = (i & 8192) != 0 ? sendFormat.aesKey : str3;
        long j16 = j15;
        String str10 = (i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0 ? sendFormat.aesIvMask : str4;
        Long l9 = (32768 & i) != 0 ? sendFormat.channels : l2;
        Long l10 = (i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0 ? sendFormat.sampleRate : l3;
        Long l11 = (i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) != 0 ? sendFormat.bitRate : l4;
        Long l12 = (i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0 ? sendFormat.maxBitRate : l5;
        String str11 = (i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) != 0 ? sendFormat.maxFrameRate : str5;
        List list4 = (i & 1048576) != 0 ? sendFormat.resolutions : list2;
        String str12 = (i & 2097152) != 0 ? sendFormat.errorRecoveryMode : str6;
        Boolean bool5 = (i & 4194304) != 0 ? sendFormat.useIntraMacroblockCyclicMode : bool2;
        if ((i & 8388608) != 0) {
            bool3 = bool5;
            l7 = sendFormat.keyFrameRefreshInterval;
        } else {
            l7 = l6;
            bool3 = bool5;
        }
        return sendFormat.copy(apfvVar3, j13, j9, j10, j11, j12, l8, list3, bool4, str7, str8, j14, j16, str9, str10, l9, l10, l11, l12, str11, list4, str12, bool3, l7);
    }

    public final apfv component1() {
        return this.type;
    }

    public final String component10() {
        return this.codecName$1;
    }

    public final String component11() {
        return this.rtpProfile;
    }

    public final long component12() {
        return this.timeBase;
    }

    public final long component13() {
        return this.storeTime;
    }

    public final String component14() {
        return this.aesKey;
    }

    public final String component15() {
        return this.aesIvMask;
    }

    public final Long component16() {
        return this.channels;
    }

    public final Long component17() {
        return this.sampleRate;
    }

    public final Long component18() {
        return this.bitRate;
    }

    public final Long component19() {
        return this.maxBitRate;
    }

    public final long component2() {
        return this.index;
    }

    public final String component20() {
        return this.maxFrameRate;
    }

    public final List component21() {
        return this.resolutions;
    }

    public final String component22() {
        return this.errorRecoveryMode;
    }

    public final Boolean component23() {
        return this.useIntraMacroblockCyclicMode;
    }

    public final Long component24() {
        return this.keyFrameRefreshInterval;
    }

    public final long component3() {
        return this.ssrc;
    }

    public final long component4() {
        return this.rtpPayloadType;
    }

    public final long component5() {
        return this.rtpPort;
    }

    public final long component6() {
        return this.remoteRtpPort;
    }

    public final Long component7() {
        return this.remoteSsrc;
    }

    public final List component8() {
        return this.rtpExtensions;
    }

    public final Boolean component9() {
        return this.receiverEvents;
    }

    public final SendFormat copy(apfv apfvVar, long j, long j2, long j3, long j4, long j5, Long l, List list, Boolean bool, String str, String str2, long j6, long j7, String str3, String str4, Long l2, Long l3, Long l4, Long l5, String str5, List list2, String str6, Boolean bool2, Long l6) {
        fxxm.f(apfvVar, "type");
        fxxm.f(str, "codecName");
        fxxm.f(str2, "rtpProfile");
        return new SendFormat(apfvVar, j, j2, j3, j4, j5, l, list, bool, str, str2, j6, j7, str3, str4, l2, l3, l4, l5, str5, list2, str6, bool2, l6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendFormat)) {
            return false;
        }
        SendFormat sendFormat = (SendFormat) obj;
        return this.type == sendFormat.type && this.index == sendFormat.index && this.ssrc == sendFormat.ssrc && this.rtpPayloadType == sendFormat.rtpPayloadType && this.rtpPort == sendFormat.rtpPort && this.remoteRtpPort == sendFormat.remoteRtpPort && fxxm.n(this.remoteSsrc, sendFormat.remoteSsrc) && fxxm.n(this.rtpExtensions, sendFormat.rtpExtensions) && fxxm.n(this.receiverEvents, sendFormat.receiverEvents) && fxxm.n(this.codecName$1, sendFormat.codecName$1) && fxxm.n(this.rtpProfile, sendFormat.rtpProfile) && this.timeBase == sendFormat.timeBase && this.storeTime == sendFormat.storeTime && fxxm.n(this.aesKey, sendFormat.aesKey) && fxxm.n(this.aesIvMask, sendFormat.aesIvMask) && fxxm.n(this.channels, sendFormat.channels) && fxxm.n(this.sampleRate, sendFormat.sampleRate) && fxxm.n(this.bitRate, sendFormat.bitRate) && fxxm.n(this.maxBitRate, sendFormat.maxBitRate) && fxxm.n(this.maxFrameRate, sendFormat.maxFrameRate) && fxxm.n(this.resolutions, sendFormat.resolutions) && fxxm.n(this.errorRecoveryMode, sendFormat.errorRecoveryMode) && fxxm.n(this.useIntraMacroblockCyclicMode, sendFormat.useIntraMacroblockCyclicMode) && fxxm.n(this.keyFrameRefreshInterval, sendFormat.keyFrameRefreshInterval);
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

    public final String getCodecName() {
        return this.codecName$1;
    }

    public final String getErrorRecoveryMode() {
        return this.errorRecoveryMode;
    }

    public final long getIndex() {
        return this.index;
    }

    public final Long getKeyFrameRefreshInterval() {
        return this.keyFrameRefreshInterval;
    }

    public final Long getMaxBitRate() {
        return this.maxBitRate;
    }

    public final String getMaxFrameRate() {
        return this.maxFrameRate;
    }

    public final Boolean getReceiverEvents() {
        return this.receiverEvents;
    }

    public final long getRemoteRtpPort() {
        return this.remoteRtpPort;
    }

    public final Long getRemoteSsrc() {
        return this.remoteSsrc;
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

    public final long getRtpPort() {
        return this.rtpPort;
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

    public final long getTimeBase() {
        return this.timeBase;
    }

    public final apfv getType() {
        return this.type;
    }

    public final Boolean getUseIntraMacroblockCyclicMode() {
        return this.useIntraMacroblockCyclicMode;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Long l = this.remoteSsrc;
        int hashCode2 = l == null ? 0 : l.hashCode();
        long j = this.index;
        long j2 = this.ssrc;
        int a = (hashCode + apfu.a(j)) * 31;
        long j3 = this.rtpPayloadType;
        int a2 = (((((((((a + apfu.a(j2)) * 31) + apfu.a(j3)) * 31) + apfu.a(this.rtpPort)) * 31) + apfu.a(this.remoteRtpPort)) * 31) + hashCode2) * 31;
        List list = this.rtpExtensions;
        int hashCode3 = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.receiverEvents;
        int hashCode4 = (((((((((hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + this.codecName$1.hashCode()) * 31) + this.rtpProfile.hashCode()) * 31) + apfu.a(this.timeBase)) * 31) + apfu.a(this.storeTime)) * 31;
        String str = this.aesKey;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.aesIvMask;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.channels;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.sampleRate;
        int hashCode8 = (hashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.bitRate;
        int hashCode9 = (hashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.maxBitRate;
        int hashCode10 = (hashCode9 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str3 = this.maxFrameRate;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list2 = this.resolutions;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.errorRecoveryMode;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.useIntraMacroblockCyclicMode;
        int hashCode14 = (hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l6 = this.keyFrameRefreshInterval;
        return hashCode14 + (l6 != null ? l6.hashCode() : 0);
    }

    public String toString() {
        return "SendFormat(type=" + this.type + ", index=" + this.index + ", ssrc=" + this.ssrc + ", rtpPayloadType=" + this.rtpPayloadType + ", rtpPort=" + this.rtpPort + ", remoteRtpPort=" + this.remoteRtpPort + ", remoteSsrc=" + this.remoteSsrc + ", rtpExtensions=" + this.rtpExtensions + ", receiverEvents=" + this.receiverEvents + ", codecName=" + this.codecName$1 + ", rtpProfile=" + this.rtpProfile + ", timeBase=" + this.timeBase + ", storeTime=" + this.storeTime + ", aesKey=" + this.aesKey + ", aesIvMask=" + this.aesIvMask + ", channels=" + this.channels + ", sampleRate=" + this.sampleRate + ", bitRate=" + this.bitRate + ", maxBitRate=" + this.maxBitRate + ", maxFrameRate=" + this.maxFrameRate + ", resolutions=" + this.resolutions + ", errorRecoveryMode=" + this.errorRecoveryMode + ", useIntraMacroblockCyclicMode=" + this.useIntraMacroblockCyclicMode + ", keyFrameRefreshInterval=" + this.keyFrameRefreshInterval + ")";
    }

    public /* synthetic */ SendFormat(apfv apfvVar, long j, long j2, long j3, long j4, long j5, Long l, List list, Boolean bool, String str, String str2, long j6, long j7, String str3, String str4, Long l2, Long l3, Long l4, Long l5, String str5, List list2, String str6, Boolean bool2, Long l6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(apfvVar, j, j2, j3, j4, j5, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : bool, str, str2, j6, j7, (i & 8192) != 0 ? null : str3, (i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0 ? null : str4, (32768 & i) != 0 ? null : l2, (65536 & i) != 0 ? null : l3, (131072 & i) != 0 ? null : l4, (262144 & i) != 0 ? null : l5, (524288 & i) != 0 ? null : str5, (1048576 & i) != 0 ? null : list2, (2097152 & i) != 0 ? null : str6, (4194304 & i) != 0 ? null : bool2, (i & 8388608) != 0 ? null : l6);
    }
}
