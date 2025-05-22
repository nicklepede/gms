package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgii;
import defpackage.cgjj;
import defpackage.fgub;
import defpackage.fgvq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class MdpDataPlanStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgjj();
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

    public final fgub a() {
        Long l = this.h;
        if (l != null) {
            return fgvq.h(l.longValue());
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
        return atyq.b(this.a, mdpDataPlanStatusResponse.a) && Arrays.equals(this.b, mdpDataPlanStatusResponse.b) && cgii.b(this.c, mdpDataPlanStatusResponse.c) && atyq.b(this.d, mdpDataPlanStatusResponse.d) && atyq.b(this.e, mdpDataPlanStatusResponse.e) && atyq.b(this.f, mdpDataPlanStatusResponse.f) && atyq.b(this.g, mdpDataPlanStatusResponse.g) && atyq.b(this.h, mdpDataPlanStatusResponse.h) && Arrays.equals(this.i, mdpDataPlanStatusResponse.i) && atyq.b(this.j, mdpDataPlanStatusResponse.j) && atyq.b(this.k, mdpDataPlanStatusResponse.k);
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.a, Integer.valueOf(cgii.a(this.c)), this.d, this.e, this.f, this.g, this.h, this.k}) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.i);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("CarrierPlanId", this.a, arrayList);
        atyp.b("DataPlans", Arrays.toString(this.b), arrayList);
        atyp.b("ExtraInfo", this.c, arrayList);
        atyp.b("Title", this.d, arrayList);
        atyp.b("WalletBalanceInfo", this.e, arrayList);
        atyp.b("EventFlowId", this.f, arrayList);
        atyp.b("UniqueRequestId", this.g, arrayList);
        Long l = this.h;
        atyp.b("UpdateTime", l != null ? fgvq.h(l.longValue()) : null, arrayList);
        atyp.b("CellularInfo", Arrays.toString(this.i), arrayList);
        String str = this.j;
        atyp.b("ExpirationTime", str != null ? str : null, arrayList);
        List list = this.k;
        atyp.b("ActionTile", list != null ? list.toString() : "", arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.J(parcel, 2, this.b, i);
        atzr.g(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.F(parcel, 6, this.f);
        atzr.I(parcel, 7, this.g);
        atzr.I(parcel, 8, this.h);
        atzr.J(parcel, 9, this.i, i);
        atzr.v(parcel, 10, this.j, false);
        atzr.y(parcel, 11, this.k, false);
        atzr.c(parcel, a);
    }
}
