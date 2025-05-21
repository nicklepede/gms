package com.google.android.gms.mobiledataplan.consent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdzb;
import defpackage.cebu;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class SetConsentStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cebu();
    public String a;
    public ParcelUuid b;
    public ConsentStatus c;
    public Long d;
    public int e;
    public Integer f;
    public Long g;
    public Bundle h;

    public SetConsentStatusRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetConsentStatusRequest) {
            SetConsentStatusRequest setConsentStatusRequest = (SetConsentStatusRequest) obj;
            if (arwb.b(this.a, setConsentStatusRequest.a) && arwb.b(this.b, setConsentStatusRequest.b) && arwb.b(this.c, setConsentStatusRequest.c) && arwb.b(this.d, setConsentStatusRequest.d) && arwb.b(Integer.valueOf(this.e), Integer.valueOf(setConsentStatusRequest.e)) && arwb.b(this.f, setConsentStatusRequest.f) && arwb.b(this.g, setConsentStatusRequest.g) && cdzb.b(this.h, setConsentStatusRequest.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(this.e), this.f, this.g, Integer.valueOf(cdzb.a(this.h))});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("clientCpid", this.a, arrayList);
        arwa.b("sessionId", this.b, arrayList);
        arwa.b("consentStatus", this.c, arrayList);
        arwa.b("consentTime", this.d, arrayList);
        arwa.b("textVersion", Integer.valueOf(this.e), arrayList);
        arwa.b("eventFlowId", this.f, arrayList);
        arwa.b("uniqueRequestId", this.g, arrayList);
        arwa.b("extraInfo", this.h, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.I(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.F(parcel, 6, this.f);
        arxc.I(parcel, 7, this.g);
        arxc.g(parcel, 8, this.h, false);
        arxc.c(parcel, a);
    }

    public SetConsentStatusRequest(String str, ParcelUuid parcelUuid, ConsentStatus consentStatus, Long l, int i, Integer num, Long l2, Bundle bundle) {
        this.a = str;
        this.b = parcelUuid;
        this.c = consentStatus;
        this.d = l;
        this.e = i;
        this.f = num;
        this.g = l2;
        this.h = bundle;
    }
}
