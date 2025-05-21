package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.DeviceFilter;
import com.google.android.gms.dtdi.core.InvitationHandle;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.aywr;
import defpackage.ayxk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class StartBroadcastInvitationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayxk();
    public InvitationHandle a;
    public DeviceFilter[] b;
    private arbp c;
    private aywr d;

    private StartBroadcastInvitationParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartBroadcastInvitationParams) {
            StartBroadcastInvitationParams startBroadcastInvitationParams = (StartBroadcastInvitationParams) obj;
            if (arwb.b(this.a, startBroadcastInvitationParams.a) && arwb.b(this.d, startBroadcastInvitationParams.d) && arwb.b(this.c, startBroadcastInvitationParams.c) && Arrays.equals(this.b, startBroadcastInvitationParams.b)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.D(parcel, 2, this.d.a);
        arxc.D(parcel, 3, this.c.asBinder());
        arxc.J(parcel, 4, this.b, i);
        arxc.c(parcel, a);
    }

    public StartBroadcastInvitationParams(InvitationHandle invitationHandle, IBinder iBinder, IBinder iBinder2, DeviceFilter[] deviceFilterArr) {
        aywr aywrVar;
        arbp arbpVar = null;
        if (iBinder == null) {
            aywrVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IInvitationAcceptedCallback");
            aywrVar = queryLocalInterface instanceof aywr ? (aywr) queryLocalInterface : new aywr(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbpVar = queryLocalInterface2 instanceof arbp ? (arbp) queryLocalInterface2 : new arbn(iBinder2);
        }
        this.a = invitationHandle;
        this.d = aywrVar;
        this.c = arbpVar;
        this.b = deviceFilterArr;
    }
}
