package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdzb;
import defpackage.ceaa;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdpDataPlanStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ceaa();
    public String a;
    public Bundle b;
    public Integer c;
    public Long d;
    public String e;
    public String f;

    public MdpDataPlanStatusRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpDataPlanStatusRequest)) {
            return false;
        }
        MdpDataPlanStatusRequest mdpDataPlanStatusRequest = (MdpDataPlanStatusRequest) obj;
        return arwb.b(this.a, mdpDataPlanStatusRequest.a) && cdzb.b(this.b, mdpDataPlanStatusRequest.b) && arwb.b(this.c, mdpDataPlanStatusRequest.c) && arwb.b(this.d, mdpDataPlanStatusRequest.d) && arwb.b(this.e, mdpDataPlanStatusRequest.e) && arwb.b(this.f, mdpDataPlanStatusRequest.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(cdzb.a(this.b)), this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("CarrierPlanId", this.a, arrayList);
        arwa.b("ExtraInfo", this.b, arrayList);
        arwa.b("EventFlowId", this.c, arrayList);
        arwa.b("UniqueRequestId", this.d, arrayList);
        arwa.b("MccMnc", this.e, arrayList);
        arwa.b("Iccid", this.f, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.g(parcel, 2, this.b, false);
        arxc.F(parcel, 3, this.c);
        arxc.I(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }

    public MdpDataPlanStatusRequest(String str, Bundle bundle, Integer num, Long l, String str2, String str3) {
        this.a = str;
        this.b = bundle;
        this.c = num;
        this.d = l;
        this.e = str2;
        this.f = str3;
    }
}
