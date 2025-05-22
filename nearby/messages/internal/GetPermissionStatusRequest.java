package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmmc;
import defpackage.cmmi;
import defpackage.cmmk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes5.dex */
public class GetPermissionStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmmc();
    final int a;
    public final cmmk b;

    @Deprecated
    public final String c;

    @Deprecated
    public final ClientAppContext d;

    public GetPermissionStatusRequest(int i, IBinder iBinder, String str, ClientAppContext clientAppContext) {
        cmmk cmmiVar;
        this.a = i;
        if (iBinder == null) {
            cmmiVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            cmmiVar = queryLocalInterface instanceof cmmk ? (cmmk) queryLocalInterface : new cmmi(iBinder);
        }
        this.b = cmmiVar;
        this.c = str;
        this.d = ClientAppContext.b(clientAppContext, null, str, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.D(parcel, 2, this.b.asBinder());
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }
}
