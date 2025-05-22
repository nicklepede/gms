package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.cfrn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class EventParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cfrn();
    public final String a;
    public final EventParams b;
    public final String c;
    public final long d;

    public EventParcel(String str, EventParams eventParams, String str2, long j) {
        this.a = str;
        this.b = eventParams;
        this.c = str2;
        this.d = j;
    }

    public final String toString() {
        return "origin=" + this.c + ",name=" + this.a + ",params=" + String.valueOf(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cfrn.a(this, parcel, i);
    }

    public EventParcel(EventParcel eventParcel, long j) {
        atzb.s(eventParcel);
        this.a = eventParcel.a;
        this.b = eventParcel.b;
        this.c = eventParcel.c;
        this.d = j;
    }
}
