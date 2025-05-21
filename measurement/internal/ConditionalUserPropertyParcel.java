package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.cdhp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ConditionalUserPropertyParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdhp();
    public String a;
    public String b;
    public UserAttributeParcel c;
    public long d;
    public boolean e;
    public String f;
    public final EventParcel g;
    public long h;
    public EventParcel i;
    public final long j;
    public final EventParcel k;

    public ConditionalUserPropertyParcel(String str, String str2, UserAttributeParcel userAttributeParcel, long j, boolean z, String str3, EventParcel eventParcel, long j2, EventParcel eventParcel2, long j3, EventParcel eventParcel3) {
        this.a = str;
        this.b = str2;
        this.c = userAttributeParcel;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.g = eventParcel;
        this.h = j2;
        this.i = eventParcel2;
        this.j = j3;
        this.k = eventParcel3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.q(parcel, 5, this.d);
        arxc.e(parcel, 6, this.e);
        arxc.v(parcel, 7, this.f, false);
        arxc.t(parcel, 8, this.g, i, false);
        arxc.q(parcel, 9, this.h);
        arxc.t(parcel, 10, this.i, i, false);
        arxc.q(parcel, 11, this.j);
        arxc.t(parcel, 12, this.k, i, false);
        arxc.c(parcel, a);
    }

    public ConditionalUserPropertyParcel(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        arwm.s(conditionalUserPropertyParcel);
        this.a = conditionalUserPropertyParcel.a;
        this.b = conditionalUserPropertyParcel.b;
        this.c = conditionalUserPropertyParcel.c;
        this.d = conditionalUserPropertyParcel.d;
        this.e = conditionalUserPropertyParcel.e;
        this.f = conditionalUserPropertyParcel.f;
        this.g = conditionalUserPropertyParcel.g;
        this.h = conditionalUserPropertyParcel.h;
        this.i = conditionalUserPropertyParcel.i;
        this.j = conditionalUserPropertyParcel.j;
        this.k = conditionalUserPropertyParcel.k;
    }
}
