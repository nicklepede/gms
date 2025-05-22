package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmmi;
import defpackage.cmmk;
import defpackage.cmnu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UnpublishRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmnu();
    final int a;
    public final MessageWrapper b;
    public final cmmk c;

    @Deprecated
    public final String d;

    @Deprecated
    public final String e;

    @Deprecated
    public final boolean f;

    @Deprecated
    public final ClientAppContext g;

    public UnpublishRequest(int i, MessageWrapper messageWrapper, IBinder iBinder, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        cmmk cmmiVar;
        this.a = i;
        this.b = messageWrapper;
        if (iBinder == null) {
            cmmiVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            cmmiVar = queryLocalInterface instanceof cmmk ? (cmmk) queryLocalInterface : new cmmi(iBinder);
        }
        this.c = cmmiVar;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = ClientAppContext.b(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.D(parcel, 3, this.c.asBinder());
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.e(parcel, 6, this.f);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.c(parcel, a);
    }
}
