package com.google.android.gms.nearby.presence.internal;

import android.app.PendingIntent;
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
import defpackage.ckre;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class BroadcastWithIntentParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckre();
    public arbp a;
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
            if (arwb.b(this.a, broadcastWithIntentParams.a) && arwb.b(this.b, broadcastWithIntentParams.b) && arwb.b(this.c, broadcastWithIntentParams.c) && Arrays.equals(this.d, broadcastWithIntentParams.d)) {
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
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.J(parcel, 4, this.d, i);
        arxc.c(parcel, a);
    }

    public BroadcastWithIntentParams(IBinder iBinder, PendingIntent pendingIntent, PresenceIdentity presenceIdentity, PresenceAction[] presenceActionArr) {
        arbp arbnVar;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        this.a = arbnVar;
        this.b = pendingIntent;
        this.c = presenceIdentity;
        this.d = presenceActionArr;
    }
}
