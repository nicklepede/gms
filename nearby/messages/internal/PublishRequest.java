package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;
import defpackage.atzr;
import defpackage.cmmi;
import defpackage.cmmk;
import defpackage.cmmo;
import defpackage.cmnp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class PublishRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmnp();
    final int a;
    public final MessageWrapper b;
    public final Strategy c;
    public final cmmk d;

    @Deprecated
    public final String e;

    @Deprecated
    public final String f;

    @Deprecated
    public final boolean g;

    @Deprecated
    public final boolean h;

    @Deprecated
    public final ClientAppContext i;
    public final int j;
    public final cmmo k;

    public PublishRequest(int i, MessageWrapper messageWrapper, Strategy strategy, IBinder iBinder, String str, String str2, boolean z, IBinder iBinder2, boolean z2, ClientAppContext clientAppContext, int i2) {
        cmmk cmmiVar;
        this.a = i;
        this.b = messageWrapper;
        this.c = strategy;
        cmmo cmmoVar = null;
        if (iBinder == null) {
            cmmiVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            cmmiVar = queryLocalInterface instanceof cmmk ? (cmmk) queryLocalInterface : new cmmi(iBinder);
        }
        this.d = cmmiVar;
        this.e = str;
        this.f = str2;
        this.g = z;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            cmmoVar = queryLocalInterface2 instanceof cmmo ? (cmmo) queryLocalInterface2 : new cmmo(iBinder2);
        }
        this.k = cmmoVar;
        this.h = z2;
        this.i = ClientAppContext.b(clientAppContext, str2, str, z2);
        this.j = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.D(parcel, 4, this.d.asBinder());
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.e(parcel, 7, this.g);
        cmmo cmmoVar = this.k;
        atzr.D(parcel, 8, cmmoVar == null ? null : cmmoVar.a);
        atzr.e(parcel, 9, this.h);
        atzr.t(parcel, 10, this.i, i, false);
        atzr.o(parcel, 11, this.j);
        atzr.c(parcel, a);
    }
}
