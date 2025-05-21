package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cesf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GetEsimConfigRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cesf();
    public String a;
    public UserKey b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String[] g;
    public Bundle h;

    public GetEsimConfigRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetEsimConfigRequest) {
            GetEsimConfigRequest getEsimConfigRequest = (GetEsimConfigRequest) obj;
            if (arwb.b(this.a, getEsimConfigRequest.a) && arwb.b(this.b, getEsimConfigRequest.b) && arwb.b(this.c, getEsimConfigRequest.c) && arwb.b(this.d, getEsimConfigRequest.d) && arwb.b(this.e, getEsimConfigRequest.e) && arwb.b(this.f, getEsimConfigRequest.f) && Arrays.equals(this.g, getEsimConfigRequest.g) && arwb.b(this.h, getEsimConfigRequest.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Integer.valueOf(Arrays.hashCode(this.g)), this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.w(parcel, 7, this.g, false);
        arxc.g(parcel, 63, this.h, false);
        arxc.c(parcel, a);
    }

    public GetEsimConfigRequest(String str, UserKey userKey, String str2, String str3, String str4, String str5, String[] strArr, Bundle bundle) {
        this.a = str;
        this.b = userKey;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = strArr;
        this.h = bundle;
    }
}
