package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cebr;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GetConsentInformationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cebr();
    public ConsentStatus a;
    public ConsentAgreementText b;
    public Long c;
    public Integer d;
    public Long e;
    public Integer f;

    public GetConsentInformationResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetConsentInformationResponse) {
            GetConsentInformationResponse getConsentInformationResponse = (GetConsentInformationResponse) obj;
            if (arwb.b(this.a, getConsentInformationResponse.a) && arwb.b(this.b, getConsentInformationResponse.b) && arwb.b(this.c, getConsentInformationResponse.c) && arwb.b(this.d, getConsentInformationResponse.d) && arwb.b(this.e, getConsentInformationResponse.e) && arwb.b(this.f, getConsentInformationResponse.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("ConsentStatus", this.a, arrayList);
        arwa.b("ConsentAgreementText", this.b, arrayList);
        arwa.b("ConsentChangeTime", this.c, arrayList);
        arwa.b("EventFlowId", this.d, arrayList);
        arwa.b("UniqueRequestId", this.e, arrayList);
        arwa.b("ConsentResponseSource", this.f, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.I(parcel, 3, this.c);
        arxc.F(parcel, 4, this.d);
        arxc.I(parcel, 5, this.e);
        arxc.F(parcel, 6, this.f);
        arxc.c(parcel, a);
    }

    public GetConsentInformationResponse(ConsentStatus consentStatus, ConsentAgreementText consentAgreementText, Long l, Integer num, Long l2, Integer num2) {
        this.a = consentStatus;
        this.b = consentAgreementText;
        this.c = l;
        this.d = num;
        this.e = l2;
        this.f = num2;
    }
}
