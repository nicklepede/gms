package com.google.android.gms.mobiledataplan.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdzb;
import defpackage.cecc;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class EventListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cecc();
    public int a;
    public String b;
    public boolean c;
    public Integer d;
    public Long e;
    public Bundle f;

    public EventListenerRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EventListenerRequest) {
            EventListenerRequest eventListenerRequest = (EventListenerRequest) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(eventListenerRequest.a)) && arwb.b(this.b, eventListenerRequest.b) && arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(eventListenerRequest.c)) && arwb.b(this.d, eventListenerRequest.d) && arwb.b(this.e, eventListenerRequest.e) && cdzb.b(this.f, eventListenerRequest.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d, this.e, Integer.valueOf(cdzb.a(this.f))});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("type", Integer.valueOf(this.a), arrayList);
        arwa.b("packageName", this.b, arrayList);
        arwa.b("requestToRegister", Boolean.valueOf(this.c), arrayList);
        arwa.b("eventFlowId", this.d, arrayList);
        arwa.b("uniqueRequestId", this.e, arrayList);
        arwa.b("extraInfo", this.f, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.c);
        arxc.F(parcel, 4, this.d);
        arxc.I(parcel, 5, this.e);
        arxc.g(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }

    public EventListenerRequest(int i, String str, boolean z, Integer num, Long l, Bundle bundle) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = num;
        this.e = l;
        this.f = bundle;
    }
}
