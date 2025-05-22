package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aobm;
import defpackage.aozc;
import defpackage.atzr;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AdBreakClipInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aobm();
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
        return aozc.u(this.a, adBreakClipInfo.a) && aozc.u(this.b, adBreakClipInfo.b) && this.c == adBreakClipInfo.c && aozc.u(this.d, adBreakClipInfo.d) && aozc.u(this.e, adBreakClipInfo.e) && aozc.u(this.f, adBreakClipInfo.f) && aozc.u(this.g, adBreakClipInfo.g) && aozc.u(this.h, adBreakClipInfo.h) && aozc.u(this.i, adBreakClipInfo.i) && this.j == adBreakClipInfo.j && aozc.u(this.k, adBreakClipInfo.k) && aozc.u(this.l, adBreakClipInfo.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, Long.valueOf(this.j), this.k, this.l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.q(parcel, 4, this.c);
        atzr.v(parcel, 5, this.d, false);
        atzr.v(parcel, 6, this.e, false);
        atzr.v(parcel, 7, this.f, false);
        atzr.v(parcel, 8, this.g, false);
        atzr.v(parcel, 9, this.h, false);
        atzr.v(parcel, 10, this.i, false);
        atzr.q(parcel, 11, this.j);
        atzr.v(parcel, 12, this.k, false);
        atzr.t(parcel, 13, this.l, i, false);
        atzr.c(parcel, a);
    }
}
