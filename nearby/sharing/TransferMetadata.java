package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmca;
import defpackage.cmcb;
import defpackage.eiuu;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class TransferMetadata extends AbstractSafeParcelable implements Cloneable, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cmcb();
    public final int a;
    public final float b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final long h;
    public final boolean i;
    public final int j;
    public final List k;
    public final Long l;
    public final boolean m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final long s;
    public final List t;

    public TransferMetadata(int i, float f, String str, boolean z, boolean z2, int i2, int i3, long j, boolean z3, int i4, List list, Long l, boolean z4, int i5, int i6, int i7, int i8, int i9, long j2, List list2) {
        this.a = i;
        this.b = f;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = i2;
        this.g = i3;
        this.h = j;
        this.i = z3;
        this.j = i4;
        this.k = list;
        this.l = l;
        this.m = z4;
        this.n = i5;
        this.o = i6;
        this.p = i7;
        this.q = i8;
        this.r = i9;
        this.s = j2;
        this.t = list2;
    }

    public static String c(int i) {
        switch (i) {
            case ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS /* 1000 */:
                return "UNKNOWN";
            case 1001:
                return "CONNECTING";
            case 1002:
                return "AWAITING_LOCAL_CONFIRMATION";
            case 1003:
                return "AWAITING_REMOTE_ACCEPTANCE";
            case 1004:
                return "AWAITING_REMOTE_ACCEPTANCE_FAILED";
            case 1005:
                return "IN_PROGRESS";
            case 1006:
                return "COMPLETE";
            case 1007:
                return "FAILED";
            case 1008:
                return "REJECTED";
            case 1009:
                return "CANCELLED";
            case 1010:
                return "TIMED_OUT";
            case 1011:
                return "MEDIA_UNAVAILABLE";
            case 1012:
                return "MEDIA_DOWNLOADING";
            case 1013:
                return "NOT_ENOUGH_SPACE";
            case 1014:
                return "UNSUPPORTED_ATTACHMENT_TYPE";
            case 1015:
                return "EXTERNAL_PROVIDER_LAUNCHED";
            case 1016:
                return "QUEUED";
            case 1017:
                return "VERIFYING_FILE";
            case 1018:
                return "REMOTE_CANCELLED";
            case 1019:
                return "STREAM_AVAILABLE";
            case 1020:
                return "CLOSE_FOREGROUND";
            case 1021:
                return "CANCELLING";
            case 1022:
                return "MEDIUM_CHANGED";
            case 1023:
                return "MEDIUM_SUSPENDED";
            default:
                return "INVALID_STATUS";
        }
    }

    public final cmca a() {
        cmca cmcaVar = new cmca(this.a);
        cmcaVar.b = this.b;
        cmcaVar.c = this.c;
        cmcaVar.d = this.d;
        cmcaVar.e = this.f;
        cmcaVar.f = this.g;
        cmcaVar.g = this.i;
        cmcaVar.h = this.m;
        cmcaVar.i = this.j;
        cmcaVar.j.addAll(this.k);
        cmcaVar.s = this.l;
        cmcaVar.k = this.h;
        cmcaVar.l = this.n;
        cmcaVar.m = this.o;
        cmcaVar.n = this.p;
        cmcaVar.o = this.q;
        cmcaVar.p = this.r;
        cmcaVar.q = this.s;
        cmcaVar.r = this.t;
        return cmcaVar;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final TransferMetadata clone() {
        try {
            return (TransferMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean d() {
        return (this.e || this.a == 1000) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TransferMetadata) {
            TransferMetadata transferMetadata = (TransferMetadata) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(transferMetadata.a)) && arwb.b(Float.valueOf(this.b), Float.valueOf(transferMetadata.b)) && arwb.b(this.c, transferMetadata.c) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(transferMetadata.d)) && arwb.b(Boolean.valueOf(this.e), Boolean.valueOf(transferMetadata.e)) && arwb.b(Boolean.valueOf(this.m), Boolean.valueOf(transferMetadata.m)) && arwb.b(Integer.valueOf(this.f), Integer.valueOf(transferMetadata.f)) && arwb.b(Integer.valueOf(this.g), Integer.valueOf(transferMetadata.g)) && arwb.b(Boolean.valueOf(this.i), Boolean.valueOf(transferMetadata.i)) && arwb.b(Integer.valueOf(this.j), Integer.valueOf(transferMetadata.j)) && arwb.b(this.k, transferMetadata.k) && arwb.b(this.l, transferMetadata.l) && arwb.b(Integer.valueOf(this.n), Integer.valueOf(transferMetadata.n)) && arwb.b(Integer.valueOf(this.o), Integer.valueOf(transferMetadata.o)) && arwb.b(Integer.valueOf(this.p), Integer.valueOf(transferMetadata.p)) && arwb.b(Integer.valueOf(this.q), Integer.valueOf(transferMetadata.q)) && arwb.b(Integer.valueOf(this.r), Integer.valueOf(transferMetadata.r)) && arwb.b(Long.valueOf(this.s), Long.valueOf(transferMetadata.s))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Float.valueOf(this.b), this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.m), Integer.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.i), Integer.valueOf(this.j), this.k, this.l, Integer.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(this.q), Integer.valueOf(this.r), Long.valueOf(this.s)});
    }

    public final String toString() {
        String c = c(this.a);
        Locale locale = Locale.US;
        Float valueOf = Float.valueOf(this.b);
        String str = this.c;
        Boolean valueOf2 = Boolean.valueOf(this.d);
        Boolean valueOf3 = Boolean.valueOf(this.e);
        Boolean valueOf4 = Boolean.valueOf(this.m);
        Integer valueOf5 = Integer.valueOf(this.f);
        Integer valueOf6 = Integer.valueOf(this.g);
        Long valueOf7 = Long.valueOf(this.h);
        Boolean valueOf8 = Boolean.valueOf(this.i);
        int i = this.j;
        return String.format(locale, "TransferMetadata<status: %s, progress: %s, token: %s, isOriginal: %s, isFinalStatus: %s, isInitialStatus: %s,  sessionId: %s, position: %s, timeStamp: %s, isSelfShare: %s, useCase: %s, completedAttachmentIds: %s, inProgressAttachmentId: %s, connectionMode: %s, connectionMedium: %s>, mediumFrequency: %s, localStaFrequency: %s, remoteStaFrequency: %s, remainingBytes: %s>", c, valueOf, str, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, i != 0 ? i != 1 ? "INVALID_USE_CASE" : "REMOTE_COPY" : "NEARBY_SHARE", eiuu.G(this.k), this.l, Integer.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(this.q), Integer.valueOf(this.r), Long.valueOf(this.s));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.l(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.e(parcel, 4, this.d);
        arxc.e(parcel, 5, this.e);
        arxc.o(parcel, 6, this.f);
        arxc.o(parcel, 7, this.g);
        arxc.q(parcel, 8, this.h);
        arxc.e(parcel, 9, this.i);
        arxc.o(parcel, 10, this.j);
        arxc.H(parcel, 11, this.k);
        arxc.I(parcel, 12, this.l);
        arxc.e(parcel, 13, this.m);
        arxc.o(parcel, 14, this.n);
        arxc.o(parcel, 15, this.o);
        arxc.o(parcel, 16, this.p);
        arxc.o(parcel, 17, this.q);
        arxc.o(parcel, 18, this.r);
        arxc.q(parcel, 19, this.s);
        arxc.y(parcel, 20, this.t, false);
        arxc.c(parcel, a);
    }
}
