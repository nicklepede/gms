package com.google.android.gms.nearby.presence.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.PresenceAction;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cmzi;
import defpackage.cmzs;
import defpackage.cmzu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class BroadcastParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmzi();
    public atee a;
    public cmzu b;
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
            if (atyq.b(this.a, broadcastParams.a) && atyq.b(this.b, broadcastParams.b) && atyq.b(this.c, broadcastParams.c) && Arrays.equals(this.d, broadcastParams.d)) {
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
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.D(parcel, 2, this.b.asBinder());
        atzr.t(parcel, 3, this.c, i, false);
        atzr.J(parcel, 4, this.d, i);
        atzr.c(parcel, a);
    }

    public BroadcastParams(IBinder iBinder, IBinder iBinder2, PresenceIdentity presenceIdentity, PresenceAction[] presenceActionArr) {
        atee atecVar;
        cmzu cmzuVar = null;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.presence.internal.IBroadcastCallback");
            cmzuVar = queryLocalInterface2 instanceof cmzu ? (cmzu) queryLocalInterface2 : new cmzs(iBinder2);
        }
        this.a = atecVar;
        this.b = cmzuVar;
        this.c = presenceIdentity;
        this.d = presenceActionArr;
    }
}
