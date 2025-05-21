package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.QrCodeMetadata;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmxr;
import defpackage.cmxt;
import defpackage.cnbf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class RegisterReceiveSurfaceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnbf();
    public cmxt a;
    public int b;
    public arbp c;
    public QrCodeMetadata d;
    public Integer e;

    public RegisterReceiveSurfaceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterReceiveSurfaceParams) {
            RegisterReceiveSurfaceParams registerReceiveSurfaceParams = (RegisterReceiveSurfaceParams) obj;
            if (arwb.b(this.a, registerReceiveSurfaceParams.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(registerReceiveSurfaceParams.b)) && arwb.b(this.c, registerReceiveSurfaceParams.c) && arwb.b(this.d, registerReceiveSurfaceParams.d) && arwb.b(this.e, registerReceiveSurfaceParams.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.o(parcel, 2, this.b);
        arxc.D(parcel, 3, this.c.asBinder());
        arxc.t(parcel, 4, this.d, i, false);
        arxc.F(parcel, 5, this.e);
        arxc.c(parcel, a);
    }

    public RegisterReceiveSurfaceParams(IBinder iBinder, int i, IBinder iBinder2, QrCodeMetadata qrCodeMetadata, Integer num) {
        cmxt cmxrVar;
        arbp arbpVar = null;
        if (iBinder == null) {
            cmxrVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
            cmxrVar = queryLocalInterface instanceof cmxt ? (cmxt) queryLocalInterface : new cmxr(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbpVar = queryLocalInterface2 instanceof arbp ? (arbp) queryLocalInterface2 : new arbn(iBinder2);
        }
        this.a = cmxrVar;
        this.b = i;
        this.c = arbpVar;
        this.d = qrCodeMetadata;
        this.e = num;
    }
}
