package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.IntermediateAccountInfo;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bbat;
import defpackage.bbbb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SetAccountInfosParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbbb();
    public IntermediateAccountInfo[] a;
    public bbat b;

    private SetAccountInfosParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetAccountInfosParams) {
            SetAccountInfosParams setAccountInfosParams = (SetAccountInfosParams) obj;
            if (Arrays.equals(this.a, setAccountInfosParams.a) && atyq.b(this.b, setAccountInfosParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, this.a, i);
        atzr.D(parcel, 2, this.b.a);
        atzr.c(parcel, a);
    }

    public SetAccountInfosParams(IntermediateAccountInfo[] intermediateAccountInfoArr, IBinder iBinder) {
        bbat bbatVar;
        if (iBinder == null) {
            bbatVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.ISetAccountInfosStatusCallback");
            bbatVar = queryLocalInterface instanceof bbat ? (bbat) queryLocalInterface : new bbat(iBinder);
        }
        this.a = intermediateAccountInfoArr;
        this.b = bbatVar;
    }
}
