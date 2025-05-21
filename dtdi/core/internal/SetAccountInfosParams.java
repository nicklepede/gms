package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.IntermediateAccountInfo;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.aywz;
import defpackage.ayxh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SetAccountInfosParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayxh();
    public IntermediateAccountInfo[] a;
    public aywz b;

    private SetAccountInfosParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetAccountInfosParams) {
            SetAccountInfosParams setAccountInfosParams = (SetAccountInfosParams) obj;
            if (Arrays.equals(this.a, setAccountInfosParams.a) && arwb.b(this.b, setAccountInfosParams.b)) {
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
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, this.a, i);
        arxc.D(parcel, 2, this.b.a);
        arxc.c(parcel, a);
    }

    public SetAccountInfosParams(IntermediateAccountInfo[] intermediateAccountInfoArr, IBinder iBinder) {
        aywz aywzVar;
        if (iBinder == null) {
            aywzVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.ISetAccountInfosStatusCallback");
            aywzVar = queryLocalInterface instanceof aywz ? (aywz) queryLocalInterface : new aywz(iBinder);
        }
        this.a = intermediateAccountInfoArr;
        this.b = aywzVar;
    }
}
