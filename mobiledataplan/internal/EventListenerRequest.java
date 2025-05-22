package com.google.android.gms.mobiledataplan.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgii;
import defpackage.cglj;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class EventListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cglj();
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
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(eventListenerRequest.a)) && atyq.b(this.b, eventListenerRequest.b) && atyq.b(Boolean.valueOf(this.c), Boolean.valueOf(eventListenerRequest.c)) && atyq.b(this.d, eventListenerRequest.d) && atyq.b(this.e, eventListenerRequest.e) && cgii.b(this.f, eventListenerRequest.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d, this.e, Integer.valueOf(cgii.a(this.f))});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("type", Integer.valueOf(this.a), arrayList);
        atyp.b("packageName", this.b, arrayList);
        atyp.b("requestToRegister", Boolean.valueOf(this.c), arrayList);
        atyp.b("eventFlowId", this.d, arrayList);
        atyp.b("uniqueRequestId", this.e, arrayList);
        atyp.b("extraInfo", this.f, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.e(parcel, 3, this.c);
        atzr.F(parcel, 4, this.d);
        atzr.I(parcel, 5, this.e);
        atzr.g(parcel, 6, this.f, false);
        atzr.c(parcel, a);
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
