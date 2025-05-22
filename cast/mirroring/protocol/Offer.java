package com.google.android.gms.cast.mirroring.protocol;

import defpackage.apfo;
import defpackage.fxxm;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class Offer {
    private apfo castMode;
    private List supportedStreams;
    private final long udpPort;

    public Offer(long j, List list, apfo apfoVar) {
        fxxm.f(list, "supportedStreams");
        fxxm.f(apfoVar, "castMode");
        this.udpPort = j;
        this.supportedStreams = list;
        this.castMode = apfoVar;
    }

    public static /* synthetic */ Offer copy$default(Offer offer, long j, List list, apfo apfoVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = offer.udpPort;
        }
        if ((i & 2) != 0) {
            list = offer.supportedStreams;
        }
        if ((i & 4) != 0) {
            apfoVar = offer.castMode;
        }
        return offer.copy(j, list, apfoVar);
    }

    public final long component1() {
        return this.udpPort;
    }

    public final List component2() {
        return this.supportedStreams;
    }

    public final apfo component3() {
        return this.castMode;
    }

    public final Offer copy(long j, List list, apfo apfoVar) {
        fxxm.f(list, "supportedStreams");
        fxxm.f(apfoVar, "castMode");
        return new Offer(j, list, apfoVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) obj;
        return this.udpPort == offer.udpPort && fxxm.n(this.supportedStreams, offer.supportedStreams) && this.castMode == offer.castMode;
    }

    public final apfo getCastMode() {
        return this.castMode;
    }

    public final List getSupportedStreams() {
        return this.supportedStreams;
    }

    public final long getUdpPort() {
        return this.udpPort;
    }

    public int hashCode() {
        int hashCode = this.supportedStreams.hashCode();
        long j = this.udpPort;
        return (((((int) (j ^ (j >>> 32))) * 31) + hashCode) * 31) + this.castMode.hashCode();
    }

    public final void setCastMode(apfo apfoVar) {
        fxxm.f(apfoVar, "<set-?>");
        this.castMode = apfoVar;
    }

    public final void setSupportedStreams(List list) {
        fxxm.f(list, "<set-?>");
        this.supportedStreams = list;
    }

    public String toString() {
        return "Offer(udpPort=" + this.udpPort + ", supportedStreams=" + this.supportedStreams + ", castMode=" + this.castMode + ")";
    }

    public /* synthetic */ Offer(long j, List list, apfo apfoVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, (i & 4) != 0 ? apfo.a : apfoVar);
    }
}
