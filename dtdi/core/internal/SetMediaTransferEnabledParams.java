package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bbbc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SetMediaTransferEnabledParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbbc();
    public boolean a;
    public atee b;
    public int c;

    public SetMediaTransferEnabledParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetMediaTransferEnabledParams) {
            SetMediaTransferEnabledParams setMediaTransferEnabledParams = (SetMediaTransferEnabledParams) obj;
            if (atyq.b(Boolean.valueOf(this.a), Boolean.valueOf(setMediaTransferEnabledParams.a)) && atyq.b(this.b, setMediaTransferEnabledParams.b) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(setMediaTransferEnabledParams.c))) {
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
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.D(parcel, 2, this.b.asBinder());
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public SetMediaTransferEnabledParams(boolean z, IBinder iBinder, int i) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = z;
        this.b = atecVar;
        this.c = i;
    }
}
