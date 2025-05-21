package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.cdio;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class EventParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdio();
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
        cdio.a(this, parcel, i);
    }

    public EventParcel(EventParcel eventParcel, long j) {
        arwm.s(eventParcel);
        this.a = eventParcel.a;
        this.b = eventParcel.b;
        this.c = eventParcel.c;
        this.d = j;
    }
}
