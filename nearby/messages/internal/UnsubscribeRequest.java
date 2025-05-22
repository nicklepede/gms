package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmmf;
import defpackage.cmmh;
import defpackage.cmmi;
import defpackage.cmmk;
import defpackage.cmnw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UnsubscribeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmnw();
    final int a;
    public final cmmh b;
    public final cmmk c;
    public final PendingIntent d;

    @Deprecated
    public final int e;

    @Deprecated
    public final String f;

    @Deprecated
    public final String g;

    @Deprecated
    public final boolean h;

    @Deprecated
    public final ClientAppContext i;

    public UnsubscribeRequest(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, int i2, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        cmmh cmmfVar;
        this.a = i;
        cmmk cmmkVar = null;
        if (iBinder == null) {
            cmmfVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            cmmfVar = queryLocalInterface instanceof cmmh ? (cmmh) queryLocalInterface : new cmmf(iBinder);
        }
        this.b = cmmfVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            cmmkVar = queryLocalInterface2 instanceof cmmk ? (cmmk) queryLocalInterface2 : new cmmi(iBinder2);
        }
        this.c = cmmkVar;
        this.d = pendingIntent;
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.h = z;
        this.i = ClientAppContext.b(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        cmmh cmmhVar = this.b;
        atzr.D(parcel, 2, cmmhVar == null ? null : cmmhVar.asBinder());
        atzr.D(parcel, 3, this.c.asBinder());
        atzr.t(parcel, 4, this.d, i, false);
        atzr.o(parcel, 5, this.e);
        atzr.v(parcel, 6, this.f, false);
        atzr.v(parcel, 7, this.g, false);
        atzr.e(parcel, 8, this.h);
        atzr.t(parcel, 9, this.i, i, false);
        atzr.c(parcel, a);
    }

    public UnsubscribeRequest(IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent) {
        this(1, iBinder, iBinder2, pendingIntent, 0, null, null, false, null);
    }
}
