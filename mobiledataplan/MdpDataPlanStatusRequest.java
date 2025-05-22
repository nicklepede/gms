package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgii;
import defpackage.cgjh;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdpDataPlanStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgjh();
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
        return atyq.b(this.a, mdpDataPlanStatusRequest.a) && cgii.b(this.b, mdpDataPlanStatusRequest.b) && atyq.b(this.c, mdpDataPlanStatusRequest.c) && atyq.b(this.d, mdpDataPlanStatusRequest.d) && atyq.b(this.e, mdpDataPlanStatusRequest.e) && atyq.b(this.f, mdpDataPlanStatusRequest.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(cgii.a(this.b)), this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("CarrierPlanId", this.a, arrayList);
        atyp.b("ExtraInfo", this.b, arrayList);
        atyp.b("EventFlowId", this.c, arrayList);
        atyp.b("UniqueRequestId", this.d, arrayList);
        atyp.b("MccMnc", this.e, arrayList);
        atyp.b("Iccid", this.f, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.g(parcel, 2, this.b, false);
        atzr.F(parcel, 3, this.c);
        atzr.I(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.c(parcel, a);
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
