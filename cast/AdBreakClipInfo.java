package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amab;
import defpackage.amxr;
import defpackage.arxc;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AdBreakClipInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amab();
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public String g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final VastAdsRequest l;
    public JSONObject m;

    public AdBreakClipInfo(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, VastAdsRequest vastAdsRequest) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = j2;
        this.k = str9;
        this.l = vastAdsRequest;
        if (TextUtils.isEmpty(str6)) {
            this.m = new JSONObject();
            return;
        }
        try {
            this.m = new JSONObject(this.g);
        } catch (JSONException e) {
            Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", e.getMessage()));
            this.g = null;
            this.m = new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakClipInfo)) {
            return false;
        }
        AdBreakClipInfo adBreakClipInfo = (AdBreakClipInfo) obj;
        return amxr.u(this.a, adBreakClipInfo.a) && amxr.u(this.b, adBreakClipInfo.b) && this.c == adBreakClipInfo.c && amxr.u(this.d, adBreakClipInfo.d) && amxr.u(this.e, adBreakClipInfo.e) && amxr.u(this.f, adBreakClipInfo.f) && amxr.u(this.g, adBreakClipInfo.g) && amxr.u(this.h, adBreakClipInfo.h) && amxr.u(this.i, adBreakClipInfo.i) && this.j == adBreakClipInfo.j && amxr.u(this.k, adBreakClipInfo.k) && amxr.u(this.l, adBreakClipInfo.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, Long.valueOf(this.j), this.k, this.l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.q(parcel, 4, this.c);
        arxc.v(parcel, 5, this.d, false);
        arxc.v(parcel, 6, this.e, false);
        arxc.v(parcel, 7, this.f, false);
        arxc.v(parcel, 8, this.g, false);
        arxc.v(parcel, 9, this.h, false);
        arxc.v(parcel, 10, this.i, false);
        arxc.q(parcel, 11, this.j);
        arxc.v(parcel, 12, this.k, false);
        arxc.t(parcel, 13, this.l, i, false);
        arxc.c(parcel, a);
    }
}
