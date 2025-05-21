package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cked;
import defpackage.ckef;
import defpackage.ckek;
import defpackage.ckfl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class RegisterStatusCallbackRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckfl();
    final int a;
    public final ckef b;
    public final boolean c;

    @Deprecated
    public final String d;

    @Deprecated
    public final ClientAppContext e;
    public final ckek f;

    public RegisterStatusCallbackRequest(int i, IBinder iBinder, IBinder iBinder2, boolean z, String str, ClientAppContext clientAppContext) {
        ckef ckedVar;
        ckek ckekVar;
        this.a = i;
        if (iBinder == null) {
            ckedVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            ckedVar = queryLocalInterface instanceof ckef ? (ckef) queryLocalInterface : new cked(iBinder);
        }
        this.b = ckedVar;
        if (iBinder2 == null) {
            ckekVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            ckekVar = queryLocalInterface2 instanceof ckek ? (ckek) queryLocalInterface2 : new ckek(iBinder2);
        }
        this.f = ckekVar;
        this.c = z;
        this.d = str;
        this.e = ClientAppContext.b(clientAppContext, null, str, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.D(parcel, 2, this.b.asBinder());
        arxc.D(parcel, 3, this.f.a);
        arxc.e(parcel, 4, this.c);
        arxc.v(parcel, 5, this.d, false);
        arxc.t(parcel, 6, this.e, i, false);
        arxc.c(parcel, a);
    }
}
