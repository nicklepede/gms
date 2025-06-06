package com.google.android.gms.mobiledataplan.consent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgii;
import defpackage.cgkx;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GetConsentInformationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgkx();
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
            if (atyq.b(this.a, getConsentInformationRequest.a) && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(getConsentInformationRequest.b)) && atyq.b(this.c, getConsentInformationRequest.c) && atyq.b(this.d, getConsentInformationRequest.d) && cgii.b(this.e, getConsentInformationRequest.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), this.c, this.d, Integer.valueOf(cgii.a(this.e))});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("clientCpid", this.a, arrayList);
        atyp.b("includeConsentTexts", Boolean.valueOf(this.b), arrayList);
        atyp.b("eventFlowId", this.c, arrayList);
        atyp.b("uniqueRequestId", this.d, arrayList);
        atyp.b("extraInfo", this.e, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.e(parcel, 2, this.b);
        atzr.F(parcel, 3, this.c);
        atzr.I(parcel, 4, this.d);
        atzr.g(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }

    public GetConsentInformationRequest(String str, boolean z, Integer num, Long l, Bundle bundle) {
        this.a = str;
        this.b = z;
        this.c = num;
        this.d = l;
        this.e = bundle;
    }
}
