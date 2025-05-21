package com.google.android.gms.cast.mirroring.protocol;

import defpackage.anee;
import defpackage.fvbo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CastMirroringMessage {
    private final Answer answer;
    private final String error;
    private final Offer offer;
    private final String result;
    private final long seqNum;
    private final anee type;

    public CastMirroringMessage(anee aneeVar, long j, Offer offer, Answer answer, String str, String str2) {
        fvbo.f(aneeVar, "type");
        this.type = aneeVar;
        this.seqNum = j;
        this.offer = offer;
        this.answer = answer;
        this.result = str;
        this.error = str2;
    }

    public static /* synthetic */ CastMirroringMessage copy$default(CastMirroringMessage castMirroringMessage, anee aneeVar, long j, Offer offer, Answer answer, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            aneeVar = castMirroringMessage.type;
        }
        if ((i & 2) != 0) {
            j = castMirroringMessage.seqNum;
        }
        if ((i & 4) != 0) {
            offer = castMirroringMessage.offer;
        }
        if ((i & 8) != 0) {
            answer = castMirroringMessage.answer;
        }
        if ((i & 16) != 0) {
            str = castMirroringMessage.result;
        }
        if ((i & 32) != 0) {
            str2 = castMirroringMessage.error;
        }
        return castMirroringMessage.copy(aneeVar, j, offer, answer, str, str2);
    }

    public final anee component1() {
        return this.type;
    }

    public final long component2() {
        return this.seqNum;
    }

    public final Offer component3() {
        return this.offer;
    }

    public final Answer component4() {
        return this.answer;
    }

    public final String component5() {
        return this.result;
    }

    public final String component6() {
        return this.error;
    }

    public final CastMirroringMessage copy(anee aneeVar, long j, Offer offer, Answer answer, String str, String str2) {
        fvbo.f(aneeVar, "type");
        return new CastMirroringMessage(aneeVar, j, offer, answer, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CastMirroringMessage)) {
            return false;
        }
        CastMirroringMessage castMirroringMessage = (CastMirroringMessage) obj;
        return this.type == castMirroringMessage.type && this.seqNum == castMirroringMessage.seqNum && fvbo.n(this.offer, castMirroringMessage.offer) && fvbo.n(this.answer, castMirroringMessage.answer) && fvbo.n(this.result, castMirroringMessage.result) && fvbo.n(this.error, castMirroringMessage.error);
    }

    public final Answer getAnswer() {
        return this.answer;
    }

    public final String getError() {
        return this.error;
    }

    public final Offer getOffer() {
        return this.offer;
    }

    public final String getResult() {
        return this.result;
    }

    public final long getSeqNum() {
        return this.seqNum;
    }

    public final anee getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Offer offer = this.offer;
        int hashCode2 = offer == null ? 0 : offer.hashCode();
        long j = this.seqNum;
        int i = (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + hashCode2) * 31;
        Answer answer = this.answer;
        int hashCode3 = (i + (answer == null ? 0 : answer.hashCode())) * 31;
        String str = this.result;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CastMirroringMessage(type=" + this.type + ", seqNum=" + this.seqNum + ", offer=" + this.offer + ", answer=" + this.answer + ", result=" + this.result + ", error=" + this.error + ")";
    }

    public /* synthetic */ CastMirroringMessage(anee aneeVar, long j, Offer offer, Answer answer, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aneeVar, j, (i & 4) != 0 ? null : offer, (i & 8) != 0 ? null : answer, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2);
    }
}
