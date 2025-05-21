package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.tqz;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CorpusStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tqz();
    public final boolean a;
    public final long b;
    public final long c;
    final long d;
    final Bundle e;
    public final String f;
    public final String g;

    public CorpusStatus() {
        this(false, 0L, 0L, 0L, null, null, null);
    }

    public final Map a() {
        HashMap hashMap = new HashMap();
        Bundle bundle = this.e;
        for (String str : bundle.keySet()) {
            int i = bundle.getInt(str, -1);
            if (i != -1) {
                hashMap.put(str, Integer.valueOf(i));
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CorpusStatus) {
            CorpusStatus corpusStatus = (CorpusStatus) obj;
            if (arwb.b(Boolean.valueOf(this.a), Boolean.valueOf(corpusStatus.a)) && arwb.b(Long.valueOf(this.b), Long.valueOf(corpusStatus.b)) && arwb.b(Long.valueOf(this.c), Long.valueOf(corpusStatus.c)) && arwb.b(Long.valueOf(this.d), Long.valueOf(corpusStatus.d)) && arwb.b(a(), corpusStatus.a()) && arwb.b(this.g, corpusStatus.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), a(), this.g});
    }

    public final String toString() {
        return "CorpusStatus{found=" + this.a + ", contentIncarnation=" + this.g + ", lastIndexedSeqno=" + this.b + ", lastCommittedSeqno=" + this.c + ", committedNumDocuments=" + this.d + ", counters=" + this.e.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, this.a);
        arxc.q(parcel, 2, this.b);
        arxc.q(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.g(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.c(parcel, a);
    }

    public CorpusStatus(boolean z, long j, long j2, long j3, Bundle bundle, String str, String str2) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = bundle == null ? new Bundle() : bundle;
        this.f = str;
        this.g = str2;
    }
}
