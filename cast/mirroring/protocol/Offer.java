package com.google.android.gms.cast.mirroring.protocol;

import defpackage.aneb;
import defpackage.fvbo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class Offer {
    private aneb castMode;
    private List supportedStreams;
    private final long udpPort;

    public Offer(long j, List list, aneb anebVar) {
        fvbo.f(list, "supportedStreams");
        fvbo.f(anebVar, "castMode");
        this.udpPort = j;
        this.supportedStreams = list;
        this.castMode = anebVar;
    }

    public static /* synthetic */ Offer copy$default(Offer offer, long j, List list, aneb anebVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = offer.udpPort;
        }
        if ((i & 2) != 0) {
            list = offer.supportedStreams;
        }
        if ((i & 4) != 0) {
            anebVar = offer.castMode;
        }
        return offer.copy(j, list, anebVar);
    }

    public final long component1() {
        return this.udpPort;
    }

    public final List component2() {
        return this.supportedStreams;
    }

    public final aneb component3() {
        return this.castMode;
    }

    public final Offer copy(long j, List list, aneb anebVar) {
        fvbo.f(list, "supportedStreams");
        fvbo.f(anebVar, "castMode");
        return new Offer(j, list, anebVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) obj;
        return this.udpPort == offer.udpPort && fvbo.n(this.supportedStreams, offer.supportedStreams) && this.castMode == offer.castMode;
    }

    public final aneb getCastMode() {
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

    public final void setCastMode(aneb anebVar) {
        fvbo.f(anebVar, "<set-?>");
        this.castMode = anebVar;
    }

    public final void setSupportedStreams(List list) {
        fvbo.f(list, "<set-?>");
        this.supportedStreams = list;
    }

    public String toString() {
        return "Offer(udpPort=" + this.udpPort + ", supportedStreams=" + this.supportedStreams + ", castMode=" + this.castMode + ")";
    }

    public /* synthetic */ Offer(long j, List list, aneb anebVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, (i & 4) != 0 ? aneb.a : anebVar);
    }
}
