package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgjd;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdpCarrierPlanIdResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgjd();
    public final String a;
    public final long b;
    public String c;
    public String d;
    public long e;
    public String f;
    public int g;
    public CarrierSupportInfo h;
    public Integer i;
    public Long j;

    @Deprecated
    public MdpCarrierPlanIdResponse(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpCarrierPlanIdResponse)) {
            return false;
        }
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = (MdpCarrierPlanIdResponse) obj;
        return atyq.b(this.a, mdpCarrierPlanIdResponse.a) && atyq.b(Long.valueOf(this.b), Long.valueOf(mdpCarrierPlanIdResponse.b)) && atyq.b(this.c, mdpCarrierPlanIdResponse.c) && atyq.b(this.d, mdpCarrierPlanIdResponse.d) && atyq.b(Long.valueOf(this.e), Long.valueOf(mdpCarrierPlanIdResponse.e)) && atyq.b(this.f, mdpCarrierPlanIdResponse.f) && atyq.b(Integer.valueOf(this.g), Integer.valueOf(mdpCarrierPlanIdResponse.g)) && atyq.b(this.h, mdpCarrierPlanIdResponse.h) && atyq.b(this.i, mdpCarrierPlanIdResponse.i) && atyq.b(this.j, mdpCarrierPlanIdResponse.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e), Integer.valueOf(this.g), this.h, this.i, this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("CarrierPlanId", this.a, arrayList);
        atyp.b("TTL-in-Seconds", Long.valueOf(this.b), arrayList);
        atyp.b("CarrierName", this.c, arrayList);
        atyp.b("CarrierLogoImageURL", this.d, arrayList);
        atyp.b("CarrierId", Long.valueOf(this.e), arrayList);
        atyp.b("CarrierCpid", this.f, arrayList);
        atyp.b("ResponseSource", Integer.valueOf(this.g), arrayList);
        atyp.b("CarrierSupportInfo", this.h, arrayList);
        atyp.b("EventFlowId", this.i, arrayList);
        atyp.b("UniqueRequestId", this.j, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.q(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.q(parcel, 5, this.e);
        atzr.v(parcel, 6, this.f, false);
        atzr.o(parcel, 7, this.g);
        atzr.t(parcel, 8, this.h, i, false);
        atzr.F(parcel, 9, this.i);
        atzr.I(parcel, 10, this.j);
        atzr.c(parcel, a);
    }

    public MdpCarrierPlanIdResponse(String str, long j, String str2, String str3, long j2, String str4, int i, CarrierSupportInfo carrierSupportInfo, Integer num, Long l) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f = str4;
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException("Response source must be a value in CpidResponseSource");
        }
        this.g = i;
        this.h = carrierSupportInfo;
        this.i = num;
        this.j = l;
    }
}
