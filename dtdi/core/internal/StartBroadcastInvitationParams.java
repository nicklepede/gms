package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.DeviceFilter;
import com.google.android.gms.dtdi.core.InvitationHandle;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bbal;
import defpackage.bbbe;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class StartBroadcastInvitationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbbe();
    public InvitationHandle a;
    public DeviceFilter[] b;
    private atee c;
    private bbal d;

    private StartBroadcastInvitationParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartBroadcastInvitationParams) {
            StartBroadcastInvitationParams startBroadcastInvitationParams = (StartBroadcastInvitationParams) obj;
            if (atyq.b(this.a, startBroadcastInvitationParams.a) && atyq.b(this.d, startBroadcastInvitationParams.d) && atyq.b(this.c, startBroadcastInvitationParams.c) && Arrays.equals(this.b, startBroadcastInvitationParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.d, this.c, Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.D(parcel, 2, this.d.a);
        atzr.D(parcel, 3, this.c.asBinder());
        atzr.J(parcel, 4, this.b, i);
        atzr.c(parcel, a);
    }

    public StartBroadcastInvitationParams(InvitationHandle invitationHandle, IBinder iBinder, IBinder iBinder2, DeviceFilter[] deviceFilterArr) {
        bbal bbalVar;
        atee ateeVar = null;
        if (iBinder == null) {
            bbalVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IInvitationAcceptedCallback");
            bbalVar = queryLocalInterface instanceof bbal ? (bbal) queryLocalInterface : new bbal(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            ateeVar = queryLocalInterface2 instanceof atee ? (atee) queryLocalInterface2 : new atec(iBinder2);
        }
        this.a = invitationHandle;
        this.d = bbalVar;
        this.c = ateeVar;
        this.b = deviceFilterArr;
    }
}
