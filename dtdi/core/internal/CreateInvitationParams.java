package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.InvitationParam;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ayvt;
import defpackage.ayws;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class CreateInvitationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayvt();
    public InvitationParam a;
    private ayws b;

    private CreateInvitationParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateInvitationParams) {
            CreateInvitationParams createInvitationParams = (CreateInvitationParams) obj;
            if (arwb.b(this.a, createInvitationParams.a) && arwb.b(this.b, createInvitationParams.b)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.D(parcel, 2, this.b.a);
        arxc.c(parcel, a);
    }

    public CreateInvitationParams(InvitationParam invitationParam, IBinder iBinder) {
        ayws aywsVar;
        if (iBinder == null) {
            aywsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IInvitationStatusCallback");
            aywsVar = queryLocalInterface instanceof ayws ? (ayws) queryLocalInterface : new ayws(iBinder);
        }
        this.a = invitationParam;
        this.b = aywsVar;
    }
}
