package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dadb;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class UserLocationProfile extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dadb();
    public final List a;
    public final List b;
    public final Persona c;
    public final long d;

    public UserLocationProfile(List list, List list2, Persona persona, long j) {
        this.a = list;
        this.b = list2;
        this.c = persona;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.y(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.q(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
