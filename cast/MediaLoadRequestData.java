package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amcb;
import defpackage.amye;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.aspq;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class MediaLoadRequestData extends AbstractSafeParcelable {
    public final MediaInfo b;
    public final MediaQueueData c;
    public final Boolean d;
    public final long e;
    public final double f;
    public final long[] g;
    String h;
    public final JSONObject i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final long n;
    public static final amye a = new amye("MediaLoadRequestData");
    public static final Parcelable.Creator CREATOR = new amcb();

    public MediaLoadRequestData(MediaInfo mediaInfo, MediaQueueData mediaQueueData, Boolean bool, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j2) {
        this.b = mediaInfo;
        this.c = mediaQueueData;
        this.d = bool;
        this.e = j;
        this.f = d;
        this.g = jArr;
        this.i = jSONObject;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLoadRequestData)) {
            return false;
        }
        MediaLoadRequestData mediaLoadRequestData = (MediaLoadRequestData) obj;
        return aspq.b(this.i, mediaLoadRequestData.i) && arwb.b(this.b, mediaLoadRequestData.b) && arwb.b(this.c, mediaLoadRequestData.c) && arwb.b(this.d, mediaLoadRequestData.d) && this.e == mediaLoadRequestData.e && this.f == mediaLoadRequestData.f && Arrays.equals(this.g, mediaLoadRequestData.g) && arwb.b(this.j, mediaLoadRequestData.j) && arwb.b(this.k, mediaLoadRequestData.k) && arwb.b(this.l, mediaLoadRequestData.l) && arwb.b(this.m, mediaLoadRequestData.m) && this.n == mediaLoadRequestData.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, Long.valueOf(this.e), Double.valueOf(this.f), this.g, String.valueOf(this.i), this.j, this.k, this.l, this.m, Long.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.i;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int a2 = arxc.a(parcel);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.z(parcel, 4, this.d);
        arxc.q(parcel, 5, this.e);
        arxc.j(parcel, 6, this.f);
        arxc.r(parcel, 7, this.g, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.v(parcel, 9, this.j, false);
        arxc.v(parcel, 10, this.k, false);
        arxc.v(parcel, 11, this.l, false);
        arxc.v(parcel, 12, this.m, false);
        arxc.q(parcel, 13, this.n);
        arxc.c(parcel, a2);
    }
}
