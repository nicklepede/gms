package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ckea;
import defpackage.ckec;
import defpackage.cked;
import defpackage.ckef;
import defpackage.ckfr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class UnsubscribeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckfr();
    final int a;
    public final ckec b;
    public final ckef c;
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
        ckec ckeaVar;
        this.a = i;
        ckef ckefVar = null;
        if (iBinder == null) {
            ckeaVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            ckeaVar = queryLocalInterface instanceof ckec ? (ckec) queryLocalInterface : new ckea(iBinder);
        }
        this.b = ckeaVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            ckefVar = queryLocalInterface2 instanceof ckef ? (ckef) queryLocalInterface2 : new cked(iBinder2);
        }
        this.c = ckefVar;
        this.d = pendingIntent;
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.h = z;
        this.i = ClientAppContext.b(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        ckec ckecVar = this.b;
        arxc.D(parcel, 2, ckecVar == null ? null : ckecVar.asBinder());
        arxc.D(parcel, 3, this.c.asBinder());
        arxc.t(parcel, 4, this.d, i, false);
        arxc.o(parcel, 5, this.e);
        arxc.v(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.e(parcel, 8, this.h);
        arxc.t(parcel, 9, this.i, i, false);
        arxc.c(parcel, a);
    }

    public UnsubscribeRequest(IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent) {
        this(1, iBinder, iBinder2, pendingIntent, 0, null, null, false, null);
    }
}
