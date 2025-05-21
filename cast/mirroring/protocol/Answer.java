package com.google.android.gms.cast.mirroring.protocol;

import defpackage.aneb;
import defpackage.fvbo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class Answer {
    private aneb castMode;
    private Display display;
    private List receiverRtcpEventLog;
    private List rtpExtensions;
    private List sendIndexes;
    private List ssrcs;
    private long udpPort;

    public Answer(aneb anebVar, List list, List list2, long j, List list3, List list4, Display display) {
        fvbo.f(anebVar, "castMode");
        fvbo.f(list, "sendIndexes");
        fvbo.f(list2, "ssrcs");
        this.castMode = anebVar;
        this.sendIndexes = list;
        this.ssrcs = list2;
        this.udpPort = j;
        this.receiverRtcpEventLog = list3;
        this.rtpExtensions = list4;
        this.display = display;
    }

    public static /* synthetic */ Answer copy$default(Answer answer, aneb anebVar, List list, List list2, long j, List list3, List list4, Display display, int i, Object obj) {
        if ((i & 1) != 0) {
            anebVar = answer.castMode;
        }
        if ((i & 2) != 0) {
            list = answer.sendIndexes;
        }
        if ((i & 4) != 0) {
            list2 = answer.ssrcs;
        }
        if ((i & 8) != 0) {
            j = answer.udpPort;
        }
        if ((i & 16) != 0) {
            list3 = answer.receiverRtcpEventLog;
        }
        if ((i & 32) != 0) {
            list4 = answer.rtpExtensions;
        }
        if ((i & 64) != 0) {
            display = answer.display;
        }
        Display display2 = display;
        List list5 = list3;
        long j2 = j;
        List list6 = list2;
        return answer.copy(anebVar, list, list6, j2, list5, list4, display2);
    }

    public final aneb component1() {
        return this.castMode;
    }

    public final List component2() {
        return this.sendIndexes;
    }

    public final List component3() {
        return this.ssrcs;
    }

    public final long component4() {
        return this.udpPort;
    }

    public final List component5() {
        return this.receiverRtcpEventLog;
    }

    public final List component6() {
        return this.rtpExtensions;
    }

    public final Display component7() {
        return this.display;
    }

    public final Answer copy(aneb anebVar, List list, List list2, long j, List list3, List list4, Display display) {
        fvbo.f(anebVar, "castMode");
        fvbo.f(list, "sendIndexes");
        fvbo.f(list2, "ssrcs");
        return new Answer(anebVar, list, list2, j, list3, list4, display);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Answer)) {
            return false;
        }
        Answer answer = (Answer) obj;
        return this.castMode == answer.castMode && fvbo.n(this.sendIndexes, answer.sendIndexes) && fvbo.n(this.ssrcs, answer.ssrcs) && this.udpPort == answer.udpPort && fvbo.n(this.receiverRtcpEventLog, answer.receiverRtcpEventLog) && fvbo.n(this.rtpExtensions, answer.rtpExtensions) && fvbo.n(this.display, answer.display);
    }

    public final aneb getCastMode() {
        return this.castMode;
    }

    public final Display getDisplay() {
        return this.display;
    }

    public final List getReceiverRtcpEventLog() {
        return this.receiverRtcpEventLog;
    }

    public final List getRtpExtensions() {
        return this.rtpExtensions;
    }

    public final List getSendIndexes() {
        return this.sendIndexes;
    }

    public final List getSsrcs() {
        return this.ssrcs;
    }

    public final long getUdpPort() {
        return this.udpPort;
    }

    public int hashCode() {
        int hashCode = (((this.castMode.hashCode() * 31) + this.sendIndexes.hashCode()) * 31) + this.ssrcs.hashCode();
        long j = this.udpPort;
        long j2 = j ^ (j >>> 32);
        List list = this.receiverRtcpEventLog;
        int hashCode2 = ((((hashCode * 31) + ((int) j2)) * 31) + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.rtpExtensions;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Display display = this.display;
        return hashCode3 + (display != null ? display.hashCode() : 0);
    }

    public final void setCastMode(aneb anebVar) {
        fvbo.f(anebVar, "<set-?>");
        this.castMode = anebVar;
    }

    public final void setDisplay(Display display) {
        this.display = display;
    }

    public final void setReceiverRtcpEventLog(List list) {
        this.receiverRtcpEventLog = list;
    }

    public final void setRtpExtensions(List list) {
        this.rtpExtensions = list;
    }

    public final void setSendIndexes(List list) {
        fvbo.f(list, "<set-?>");
        this.sendIndexes = list;
    }

    public final void setSsrcs(List list) {
        fvbo.f(list, "<set-?>");
        this.ssrcs = list;
    }

    public final void setUdpPort(long j) {
        this.udpPort = j;
    }

    public String toString() {
        return "Answer(castMode=" + this.castMode + ", sendIndexes=" + this.sendIndexes + ", ssrcs=" + this.ssrcs + ", udpPort=" + this.udpPort + ", receiverRtcpEventLog=" + this.receiverRtcpEventLog + ", rtpExtensions=" + this.rtpExtensions + ", display=" + this.display + ")";
    }

    public /* synthetic */ Answer(aneb anebVar, List list, List list2, long j, List list3, List list4, Display display, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(anebVar, list, list2, j, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : list4, (i & 64) != 0 ? null : display);
    }
}
