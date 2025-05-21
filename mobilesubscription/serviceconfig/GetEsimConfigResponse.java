package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cesg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GetEsimConfigResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cesg();
    public String a;
    public String b;
    public Long c;
    public Long d;
    public String e;
    public String f;
    public Bundle g;

    public GetEsimConfigResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetEsimConfigResponse) {
            GetEsimConfigResponse getEsimConfigResponse = (GetEsimConfigResponse) obj;
            if (arwb.b(this.a, getEsimConfigResponse.a) && arwb.b(this.b, getEsimConfigResponse.b) && arwb.b(this.c, getEsimConfigResponse.c) && arwb.b(this.d, getEsimConfigResponse.d) && arwb.b(this.e, getEsimConfigResponse.e) && arwb.b(this.f, getEsimConfigResponse.f) && arwb.b(this.g, getEsimConfigResponse.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.I(parcel, 3, this.c);
        arxc.I(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.g(parcel, 63, this.g, false);
        arxc.c(parcel, a);
    }

    public GetEsimConfigResponse(String str, String str2, Long l, Long l2, String str3, String str4, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = l2;
        this.e = str3;
        this.f = str4;
        this.g = bundle;
    }
}
