package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgii;
import defpackage.cgjc;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdpCarrierPlanIdRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgjc();
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
        return atyq.b(this.a, mdpCarrierPlanIdRequest.a) && cgii.b(this.b, mdpCarrierPlanIdRequest.b) && atyq.b(this.c, mdpCarrierPlanIdRequest.c) && atyq.b(this.d, mdpCarrierPlanIdRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(cgii.a(this.b)), this.c, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("apiKey", this.a.substring(Math.max(r1.length() - 5, 0)), arrayList);
        atyp.b("ExtraInfo", this.b, arrayList);
        atyp.b("EventFlowId", this.c, arrayList);
        atyp.b("UniqueRequestId", this.d, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.g(parcel, 2, this.b, false);
        atzr.F(parcel, 3, this.c);
        atzr.I(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public MdpCarrierPlanIdRequest(String str, Bundle bundle, Integer num, Long l) {
        this.a = str;
        this.b = bundle;
        this.c = num;
        this.d = l;
    }
}
