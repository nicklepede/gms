package com.google.android.gms.nearby.presence.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.PresenceAction;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ckrd;
import defpackage.ckrn;
import defpackage.ckrp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class BroadcastParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckrd();
    public arbp a;
    public ckrp b;
    public PresenceIdentity c;
    public PresenceAction[] d;

    private BroadcastParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BroadcastParams) {
            BroadcastParams broadcastParams = (BroadcastParams) obj;
            if (arwb.b(this.a, broadcastParams.a) && arwb.b(this.b, broadcastParams.b) && arwb.b(this.c, broadcastParams.c) && Arrays.equals(this.d, broadcastParams.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.D(parcel, 2, this.b.asBinder());
        arxc.t(parcel, 3, this.c, i, false);
        arxc.J(parcel, 4, this.d, i);
        arxc.c(parcel, a);
    }

    public BroadcastParams(IBinder iBinder, IBinder iBinder2, PresenceIdentity presenceIdentity, PresenceAction[] presenceActionArr) {
        arbp arbnVar;
        ckrp ckrpVar = null;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.presence.internal.IBroadcastCallback");
            ckrpVar = queryLocalInterface2 instanceof ckrp ? (ckrp) queryLocalInterface2 : new ckrn(iBinder2);
        }
        this.a = arbnVar;
        this.b = ckrpVar;
        this.c = presenceIdentity;
        this.d = presenceActionArr;
    }
}
