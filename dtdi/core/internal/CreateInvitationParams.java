package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.InvitationParam;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bazn;
import defpackage.bbam;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CreateInvitationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bazn();
    public InvitationParam a;
    private bbam b;

    private CreateInvitationParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateInvitationParams) {
            CreateInvitationParams createInvitationParams = (CreateInvitationParams) obj;
            if (atyq.b(this.a, createInvitationParams.a) && atyq.b(this.b, createInvitationParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.D(parcel, 2, this.b.a);
        atzr.c(parcel, a);
    }

    public CreateInvitationParams(InvitationParam invitationParam, IBinder iBinder) {
        bbam bbamVar;
        if (iBinder == null) {
            bbamVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IInvitationStatusCallback");
            bbamVar = queryLocalInterface instanceof bbam ? (bbam) queryLocalInterface : new bbam(iBinder);
        }
        this.a = invitationParam;
        this.b = bbamVar;
    }
}
