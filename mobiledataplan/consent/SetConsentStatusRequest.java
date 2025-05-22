package com.google.android.gms.mobiledataplan.consent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgii;
import defpackage.cglb;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class SetConsentStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cglb();
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
            if (atyq.b(this.a, setConsentStatusRequest.a) && atyq.b(this.b, setConsentStatusRequest.b) && atyq.b(this.c, setConsentStatusRequest.c) && atyq.b(this.d, setConsentStatusRequest.d) && atyq.b(Integer.valueOf(this.e), Integer.valueOf(setConsentStatusRequest.e)) && atyq.b(this.f, setConsentStatusRequest.f) && atyq.b(this.g, setConsentStatusRequest.g) && cgii.b(this.h, setConsentStatusRequest.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(this.e), this.f, this.g, Integer.valueOf(cgii.a(this.h))});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("clientCpid", this.a, arrayList);
        atyp.b("sessionId", this.b, arrayList);
        atyp.b("consentStatus", this.c, arrayList);
        atyp.b("consentTime", this.d, arrayList);
        atyp.b("textVersion", Integer.valueOf(this.e), arrayList);
        atyp.b("eventFlowId", this.f, arrayList);
        atyp.b("uniqueRequestId", this.g, arrayList);
        atyp.b("extraInfo", this.h, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.I(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.F(parcel, 6, this.f);
        atzr.I(parcel, 7, this.g);
        atzr.g(parcel, 8, this.h, false);
        atzr.c(parcel, a);
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
