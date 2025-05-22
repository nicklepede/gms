package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chbn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GetEsimConfigRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chbn();
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
            if (atyq.b(this.a, getEsimConfigRequest.a) && atyq.b(this.b, getEsimConfigRequest.b) && atyq.b(this.c, getEsimConfigRequest.c) && atyq.b(this.d, getEsimConfigRequest.d) && atyq.b(this.e, getEsimConfigRequest.e) && atyq.b(this.f, getEsimConfigRequest.f) && Arrays.equals(this.g, getEsimConfigRequest.g) && atyq.b(this.h, getEsimConfigRequest.h)) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.w(parcel, 7, this.g, false);
        atzr.g(parcel, 63, this.h, false);
        atzr.c(parcel, a);
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
