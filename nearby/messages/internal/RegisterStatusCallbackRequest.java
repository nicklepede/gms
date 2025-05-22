package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmmi;
import defpackage.cmmk;
import defpackage.cmmp;
import defpackage.cmnq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class RegisterStatusCallbackRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmnq();
    final int a;
    public final cmmk b;
    public final boolean c;

    @Deprecated
    public final String d;

    @Deprecated
    public final ClientAppContext e;
    public final cmmp f;

    public RegisterStatusCallbackRequest(int i, IBinder iBinder, IBinder iBinder2, boolean z, String str, ClientAppContext clientAppContext) {
        cmmk cmmiVar;
        cmmp cmmpVar;
        this.a = i;
        if (iBinder == null) {
            cmmiVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            cmmiVar = queryLocalInterface instanceof cmmk ? (cmmk) queryLocalInterface : new cmmi(iBinder);
        }
        this.b = cmmiVar;
        if (iBinder2 == null) {
            cmmpVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            cmmpVar = queryLocalInterface2 instanceof cmmp ? (cmmp) queryLocalInterface2 : new cmmp(iBinder2);
        }
        this.f = cmmpVar;
        this.c = z;
        this.d = str;
        this.e = ClientAppContext.b(clientAppContext, null, str, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.D(parcel, 2, this.b.asBinder());
        atzr.D(parcel, 3, this.f.a);
        atzr.e(parcel, 4, this.c);
        atzr.v(parcel, 5, this.d, false);
        atzr.t(parcel, 6, this.e, i, false);
        atzr.c(parcel, a);
    }
}
