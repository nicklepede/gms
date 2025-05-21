package com.google.android.gms.mobiledataplan.consent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdzb;
import defpackage.cebq;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GetConsentInformationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cebq();
    public String a;
    public boolean b;
    public Integer c;
    public Long d;
    public Bundle e;

    public GetConsentInformationRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetConsentInformationRequest) {
            GetConsentInformationRequest getConsentInformationRequest = (GetConsentInformationRequest) obj;
            if (arwb.b(this.a, getConsentInformationRequest.a) && arwb.b(Boolean.valueOf(this.b), Boolean.valueOf(getConsentInformationRequest.b)) && arwb.b(this.c, getConsentInformationRequest.c) && arwb.b(this.d, getConsentInformationRequest.d) && cdzb.b(this.e, getConsentInformationRequest.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), this.c, this.d, Integer.valueOf(cdzb.a(this.e))});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("clientCpid", this.a, arrayList);
        arwa.b("includeConsentTexts", Boolean.valueOf(this.b), arrayList);
        arwa.b("eventFlowId", this.c, arrayList);
        arwa.b("uniqueRequestId", this.d, arrayList);
        arwa.b("extraInfo", this.e, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.e(parcel, 2, this.b);
        arxc.F(parcel, 3, this.c);
        arxc.I(parcel, 4, this.d);
        arxc.g(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }

    public GetConsentInformationRequest(String str, boolean z, Integer num, Long l, Bundle bundle) {
        this.a = str;
        this.b = z;
        this.c = num;
        this.d = l;
        this.e = bundle;
    }
}
