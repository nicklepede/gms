package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmmd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class HandleClientLifecycleEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmmd();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
