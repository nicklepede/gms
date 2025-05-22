package com.google.android.gms.nearby.presence.internal;

import android.app.PendingIntent;
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
import defpackage.cmzj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class BroadcastWithIntentParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmzj();
    public atee a;
    public PendingIntent b;
    public PresenceIdentity c;
    public PresenceAction[] d;

    private BroadcastWithIntentParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BroadcastWithIntentParams) {
            BroadcastWithIntentParams broadcastWithIntentParams = (BroadcastWithIntentParams) obj;
            if (atyq.b(this.a, broadcastWithIntentParams.a) && atyq.b(this.b, broadcastWithIntentParams.b) && atyq.b(this.c, broadcastWithIntentParams.c) && Arrays.equals(this.d, broadcastWithIntentParams.d)) {
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
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.J(parcel, 4, this.d, i);
        atzr.c(parcel, a);
    }

    public BroadcastWithIntentParams(IBinder iBinder, PendingIntent pendingIntent, PresenceIdentity presenceIdentity, PresenceAction[] presenceActionArr) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = atecVar;
        this.b = pendingIntent;
        this.c = presenceIdentity;
        this.d = presenceActionArr;
    }
}
