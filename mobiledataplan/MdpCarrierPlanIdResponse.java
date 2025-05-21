package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdzw;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdpCarrierPlanIdResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdzw();
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
        return arwb.b(this.a, mdpCarrierPlanIdResponse.a) && arwb.b(Long.valueOf(this.b), Long.valueOf(mdpCarrierPlanIdResponse.b)) && arwb.b(this.c, mdpCarrierPlanIdResponse.c) && arwb.b(this.d, mdpCarrierPlanIdResponse.d) && arwb.b(Long.valueOf(this.e), Long.valueOf(mdpCarrierPlanIdResponse.e)) && arwb.b(this.f, mdpCarrierPlanIdResponse.f) && arwb.b(Integer.valueOf(this.g), Integer.valueOf(mdpCarrierPlanIdResponse.g)) && arwb.b(this.h, mdpCarrierPlanIdResponse.h) && arwb.b(this.i, mdpCarrierPlanIdResponse.i) && arwb.b(this.j, mdpCarrierPlanIdResponse.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e), Integer.valueOf(this.g), this.h, this.i, this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("CarrierPlanId", this.a, arrayList);
        arwa.b("TTL-in-Seconds", Long.valueOf(this.b), arrayList);
        arwa.b("CarrierName", this.c, arrayList);
        arwa.b("CarrierLogoImageURL", this.d, arrayList);
        arwa.b("CarrierId", Long.valueOf(this.e), arrayList);
        arwa.b("CarrierCpid", this.f, arrayList);
        arwa.b("ResponseSource", Integer.valueOf(this.g), arrayList);
        arwa.b("CarrierSupportInfo", this.h, arrayList);
        arwa.b("EventFlowId", this.i, arrayList);
        arwa.b("UniqueRequestId", this.j, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.q(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.q(parcel, 5, this.e);
        arxc.v(parcel, 6, this.f, false);
        arxc.o(parcel, 7, this.g);
        arxc.t(parcel, 8, this.h, i, false);
        arxc.F(parcel, 9, this.i);
        arxc.I(parcel, 10, this.j);
        arxc.c(parcel, a);
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
