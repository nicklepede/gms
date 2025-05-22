package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aodm;
import defpackage.aozp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.autk;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
    public static final aozp a = new aozp("MediaLoadRequestData");
    public static final Parcelable.Creator CREATOR = new aodm();

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
        return autk.b(this.i, mediaLoadRequestData.i) && atyq.b(this.b, mediaLoadRequestData.b) && atyq.b(this.c, mediaLoadRequestData.c) && atyq.b(this.d, mediaLoadRequestData.d) && this.e == mediaLoadRequestData.e && this.f == mediaLoadRequestData.f && Arrays.equals(this.g, mediaLoadRequestData.g) && atyq.b(this.j, mediaLoadRequestData.j) && atyq.b(this.k, mediaLoadRequestData.k) && atyq.b(this.l, mediaLoadRequestData.l) && atyq.b(this.m, mediaLoadRequestData.m) && this.n == mediaLoadRequestData.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, Long.valueOf(this.e), Double.valueOf(this.f), this.g, String.valueOf(this.i), this.j, this.k, this.l, this.m, Long.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.i;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int a2 = atzr.a(parcel);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.z(parcel, 4, this.d);
        atzr.q(parcel, 5, this.e);
        atzr.j(parcel, 6, this.f);
        atzr.r(parcel, 7, this.g, false);
        atzr.v(parcel, 8, this.h, false);
        atzr.v(parcel, 9, this.j, false);
        atzr.v(parcel, 10, this.k, false);
        atzr.v(parcel, 11, this.l, false);
        atzr.v(parcel, 12, this.m, false);
        atzr.q(parcel, 13, this.n);
        atzr.c(parcel, a2);
    }
}
