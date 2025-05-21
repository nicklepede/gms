package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cesa;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class CheckAuthStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cesa();
    public String a;
    public ServiceType b;
    public Long c;
    public AuthType d;
    public String e;
    public Bundle f;

    public CheckAuthStatusRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckAuthStatusRequest) {
            CheckAuthStatusRequest checkAuthStatusRequest = (CheckAuthStatusRequest) obj;
            if (arwb.b(this.a, checkAuthStatusRequest.a) && arwb.b(this.b, checkAuthStatusRequest.b) && arwb.b(this.c, checkAuthStatusRequest.c) && arwb.b(this.d, checkAuthStatusRequest.d) && arwb.b(this.e, checkAuthStatusRequest.e) && arwb.b(this.f, checkAuthStatusRequest.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.I(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.g(parcel, 63, this.f, false);
        arxc.c(parcel, a);
    }

    public CheckAuthStatusRequest(String str, ServiceType serviceType, Long l, AuthType authType, String str2, Bundle bundle) {
        this.a = str;
        this.b = serviceType;
        this.c = l;
        this.d = authType;
        this.e = str2;
        this.f = bundle;
    }
}
