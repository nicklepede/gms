package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ambx;
import defpackage.amxr;
import defpackage.arxc;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class MediaError extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ambx();
    public final String a;
    public final long b;
    public final Integer c;
    public final String d;
    String e;
    private final JSONObject f;

    public MediaError(String str, long j, Integer num, String str2, JSONObject jSONObject) {
        this.a = str;
        this.b = j;
        this.c = num;
        this.d = str2;
        this.f = jSONObject;
    }

    public static void a(JSONObject jSONObject) {
        jSONObject.optString("type", "ERROR");
        jSONObject.optLong("requestId");
        if (jSONObject.has("detailedErrorCode")) {
            jSONObject.optInt("detailedErrorCode");
        }
        amxr.j(jSONObject, "reason");
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f;
        this.e = jSONObject == null ? null : jSONObject.toString();
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.q(parcel, 3, this.b);
        arxc.F(parcel, 4, this.c);
        arxc.v(parcel, 5, this.d, false);
        arxc.v(parcel, 6, this.e, false);
        arxc.c(parcel, a);
    }
}
