package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ckdx;
import defpackage.cked;
import defpackage.ckef;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes5.dex */
public class GetPermissionStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckdx();
    final int a;
    public final ckef b;

    @Deprecated
    public final String c;

    @Deprecated
    public final ClientAppContext d;

    public GetPermissionStatusRequest(int i, IBinder iBinder, String str, ClientAppContext clientAppContext) {
        ckef ckedVar;
        this.a = i;
        if (iBinder == null) {
            ckedVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            ckedVar = queryLocalInterface instanceof ckef ? (ckef) queryLocalInterface : new cked(iBinder);
        }
        this.b = ckedVar;
        this.c = str;
        this.d = ClientAppContext.b(clientAppContext, null, str, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.D(parcel, 2, this.b.asBinder());
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }
}
