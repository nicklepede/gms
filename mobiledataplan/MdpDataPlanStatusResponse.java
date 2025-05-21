package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdzb;
import defpackage.ceac;
import defpackage.fefi;
import defpackage.fegx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class MdpDataPlanStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ceac();
    public final String a;
    public final MdpDataPlanStatus[] b;
    public final Bundle c;
    public final String d;
    public final WalletBalanceInfo e;
    public final Integer f;
    public final Long g;
    public final Long h;
    public final CellularInfo[] i;
    public final String j;
    public final List k;

    public MdpDataPlanStatusResponse(String str, MdpDataPlanStatus[] mdpDataPlanStatusArr, Bundle bundle, String str2, WalletBalanceInfo walletBalanceInfo, Integer num, Long l, Long l2, CellularInfo[] cellularInfoArr, String str3, List list) {
        this.a = str;
        this.b = mdpDataPlanStatusArr;
        this.c = bundle;
        this.d = str2;
        this.e = walletBalanceInfo;
        this.f = num;
        this.g = l;
        this.h = l2;
        this.i = cellularInfoArr;
        this.j = str3;
        this.k = list;
    }

    public final fefi a() {
        Long l = this.h;
        if (l != null) {
            return fegx.h(l.longValue());
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpDataPlanStatusResponse)) {
            return false;
        }
        MdpDataPlanStatusResponse mdpDataPlanStatusResponse = (MdpDataPlanStatusResponse) obj;
        return arwb.b(this.a, mdpDataPlanStatusResponse.a) && Arrays.equals(this.b, mdpDataPlanStatusResponse.b) && cdzb.b(this.c, mdpDataPlanStatusResponse.c) && arwb.b(this.d, mdpDataPlanStatusResponse.d) && arwb.b(this.e, mdpDataPlanStatusResponse.e) && arwb.b(this.f, mdpDataPlanStatusResponse.f) && arwb.b(this.g, mdpDataPlanStatusResponse.g) && arwb.b(this.h, mdpDataPlanStatusResponse.h) && Arrays.equals(this.i, mdpDataPlanStatusResponse.i) && arwb.b(this.j, mdpDataPlanStatusResponse.j) && arwb.b(this.k, mdpDataPlanStatusResponse.k);
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.a, Integer.valueOf(cdzb.a(this.c)), this.d, this.e, this.f, this.g, this.h, this.k}) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.i);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("CarrierPlanId", this.a, arrayList);
        arwa.b("DataPlans", Arrays.toString(this.b), arrayList);
        arwa.b("ExtraInfo", this.c, arrayList);
        arwa.b("Title", this.d, arrayList);
        arwa.b("WalletBalanceInfo", this.e, arrayList);
        arwa.b("EventFlowId", this.f, arrayList);
        arwa.b("UniqueRequestId", this.g, arrayList);
        Long l = this.h;
        arwa.b("UpdateTime", l != null ? fegx.h(l.longValue()) : null, arrayList);
        arwa.b("CellularInfo", Arrays.toString(this.i), arrayList);
        String str = this.j;
        arwa.b("ExpirationTime", str != null ? str : null, arrayList);
        List list = this.k;
        arwa.b("ActionTile", list != null ? list.toString() : "", arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.J(parcel, 2, this.b, i);
        arxc.g(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.F(parcel, 6, this.f);
        arxc.I(parcel, 7, this.g);
        arxc.I(parcel, 8, this.h);
        arxc.J(parcel, 9, this.i, i);
        arxc.v(parcel, 10, this.j, false);
        arxc.y(parcel, 11, this.k, false);
        arxc.c(parcel, a);
    }
}
