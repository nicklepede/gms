package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgky;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GetConsentInformationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgky();
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
            if (atyq.b(this.a, getConsentInformationResponse.a) && atyq.b(this.b, getConsentInformationResponse.b) && atyq.b(this.c, getConsentInformationResponse.c) && atyq.b(this.d, getConsentInformationResponse.d) && atyq.b(this.e, getConsentInformationResponse.e) && atyq.b(this.f, getConsentInformationResponse.f)) {
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
        atyp.b("ConsentStatus", this.a, arrayList);
        atyp.b("ConsentAgreementText", this.b, arrayList);
        atyp.b("ConsentChangeTime", this.c, arrayList);
        atyp.b("EventFlowId", this.d, arrayList);
        atyp.b("UniqueRequestId", this.e, arrayList);
        atyp.b("ConsentResponseSource", this.f, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.I(parcel, 3, this.c);
        atzr.F(parcel, 4, this.d);
        atzr.I(parcel, 5, this.e);
        atzr.F(parcel, 6, this.f);
        atzr.c(parcel, a);
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
