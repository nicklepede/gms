package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.cfqo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ConditionalUserPropertyParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cfqo();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.q(parcel, 5, this.d);
        atzr.e(parcel, 6, this.e);
        atzr.v(parcel, 7, this.f, false);
        atzr.t(parcel, 8, this.g, i, false);
        atzr.q(parcel, 9, this.h);
        atzr.t(parcel, 10, this.i, i, false);
        atzr.q(parcel, 11, this.j);
        atzr.t(parcel, 12, this.k, i, false);
        atzr.c(parcel, a);
    }

    public ConditionalUserPropertyParcel(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        atzb.s(conditionalUserPropertyParcel);
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
