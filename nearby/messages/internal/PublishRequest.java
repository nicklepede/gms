package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;
import defpackage.arxc;
import defpackage.cked;
import defpackage.ckef;
import defpackage.ckej;
import defpackage.ckfk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class PublishRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckfk();
    final int a;
    public final MessageWrapper b;
    public final Strategy c;
    public final ckef d;

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
    public final ckej k;

    public PublishRequest(int i, MessageWrapper messageWrapper, Strategy strategy, IBinder iBinder, String str, String str2, boolean z, IBinder iBinder2, boolean z2, ClientAppContext clientAppContext, int i2) {
        ckef ckedVar;
        this.a = i;
        this.b = messageWrapper;
        this.c = strategy;
        ckej ckejVar = null;
        if (iBinder == null) {
            ckedVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            ckedVar = queryLocalInterface instanceof ckef ? (ckef) queryLocalInterface : new cked(iBinder);
        }
        this.d = ckedVar;
        this.e = str;
        this.f = str2;
        this.g = z;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            ckejVar = queryLocalInterface2 instanceof ckej ? (ckej) queryLocalInterface2 : new ckej(iBinder2);
        }
        this.k = ckejVar;
        this.h = z2;
        this.i = ClientAppContext.b(clientAppContext, str2, str, z2);
        this.j = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.D(parcel, 4, this.d.asBinder());
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.e(parcel, 7, this.g);
        ckej ckejVar = this.k;
        arxc.D(parcel, 8, ckejVar == null ? null : ckejVar.a);
        arxc.e(parcel, 9, this.h);
        arxc.t(parcel, 10, this.i, i, false);
        arxc.o(parcel, 11, this.j);
        arxc.c(parcel, a);
    }
}
