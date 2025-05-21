package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdzb;
import defpackage.cdzv;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdpCarrierPlanIdRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdzv();
    public String a;
    public Bundle b;
    public Integer c;
    public Long d;

    public MdpCarrierPlanIdRequest() {
    }

    public final String a() {
        String string;
        Bundle bundle = this.b;
        return (bundle == null || bundle.size() <= 0 || (string = this.b.getString("iccid")) == null) ? "" : string;
    }

    public final String b() {
        String string;
        Bundle bundle = this.b;
        return (bundle == null || (string = bundle.getString("return_test_cpid")) == null) ? "" : string;
    }

    public final boolean c() {
        String string;
        Bundle bundle = this.b;
        return bundle != null && bundle.size() > 0 && (string = this.b.getString("bypass_local_cache")) != null && string.equalsIgnoreCase("true");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpCarrierPlanIdRequest)) {
            return false;
        }
        MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest = (MdpCarrierPlanIdRequest) obj;
        return arwb.b(this.a, mdpCarrierPlanIdRequest.a) && cdzb.b(this.b, mdpCarrierPlanIdRequest.b) && arwb.b(this.c, mdpCarrierPlanIdRequest.c) && arwb.b(this.d, mdpCarrierPlanIdRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(cdzb.a(this.b)), this.c, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("apiKey", this.a.substring(Math.max(r1.length() - 5, 0)), arrayList);
        arwa.b("ExtraInfo", this.b, arrayList);
        arwa.b("EventFlowId", this.c, arrayList);
        arwa.b("UniqueRequestId", this.d, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.g(parcel, 2, this.b, false);
        arxc.F(parcel, 3, this.c);
        arxc.I(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public MdpCarrierPlanIdRequest(String str, Bundle bundle, Integer num, Long l) {
        this.a = str;
        this.b = bundle;
        this.c = num;
        this.d = l;
    }
}
