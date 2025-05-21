package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ayxi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SetMediaTransferEnabledParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayxi();
    public boolean a;
    public arbp b;
    public int c;

    public SetMediaTransferEnabledParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetMediaTransferEnabledParams) {
            SetMediaTransferEnabledParams setMediaTransferEnabledParams = (SetMediaTransferEnabledParams) obj;
            if (arwb.b(Boolean.valueOf(this.a), Boolean.valueOf(setMediaTransferEnabledParams.a)) && arwb.b(this.b, setMediaTransferEnabledParams.b) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(setMediaTransferEnabledParams.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, this.a);
        arxc.D(parcel, 2, this.b.asBinder());
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }

    public SetMediaTransferEnabledParams(boolean z, IBinder iBinder, int i) {
        arbp arbnVar;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        this.a = z;
        this.b = arbnVar;
        this.c = i;
    }
}
