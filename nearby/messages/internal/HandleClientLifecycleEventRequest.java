package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ckdy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class HandleClientLifecycleEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckdy();
    public final int a;

    @Deprecated
    public final ClientAppContext b;
    public final int c;

    public HandleClientLifecycleEventRequest(int i, ClientAppContext clientAppContext, int i2) {
        this.a = i;
        this.b = clientAppContext;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
