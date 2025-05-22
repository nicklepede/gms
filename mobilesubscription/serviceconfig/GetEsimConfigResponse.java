package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chbo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GetEsimConfigResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chbo();
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
            if (atyq.b(this.a, getEsimConfigResponse.a) && atyq.b(this.b, getEsimConfigResponse.b) && atyq.b(this.c, getEsimConfigResponse.c) && atyq.b(this.d, getEsimConfigResponse.d) && atyq.b(this.e, getEsimConfigResponse.e) && atyq.b(this.f, getEsimConfigResponse.f) && atyq.b(this.g, getEsimConfigResponse.g)) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.I(parcel, 3, this.c);
        atzr.I(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.g(parcel, 63, this.g, false);
        atzr.c(parcel, a);
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
