package com.google.android.gms.notifications;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.crzw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ReadStateUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crzw();
    final int a;
    public final int b;
    public final Identifier c;

    public ReadStateUpdate(int i, int i2, Identifier identifier) {
        this.a = i;
        this.b = i2;
        this.c = identifier;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }
}
