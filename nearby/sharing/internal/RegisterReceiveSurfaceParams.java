package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.QrCodeMetadata;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpfz;
import defpackage.cpgb;
import defpackage.cpjn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class RegisterReceiveSurfaceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpjn();
    public cpgb a;
    public int b;
    public atee c;
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
            if (atyq.b(this.a, registerReceiveSurfaceParams.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(registerReceiveSurfaceParams.b)) && atyq.b(this.c, registerReceiveSurfaceParams.c) && atyq.b(this.d, registerReceiveSurfaceParams.d) && atyq.b(this.e, registerReceiveSurfaceParams.e)) {
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
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.o(parcel, 2, this.b);
        atzr.D(parcel, 3, this.c.asBinder());
        atzr.t(parcel, 4, this.d, i, false);
        atzr.F(parcel, 5, this.e);
        atzr.c(parcel, a);
    }

    public RegisterReceiveSurfaceParams(IBinder iBinder, int i, IBinder iBinder2, QrCodeMetadata qrCodeMetadata, Integer num) {
        cpgb cpfzVar;
        atee ateeVar = null;
        if (iBinder == null) {
            cpfzVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
            cpfzVar = queryLocalInterface instanceof cpgb ? (cpgb) queryLocalInterface : new cpfz(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            ateeVar = queryLocalInterface2 instanceof atee ? (atee) queryLocalInterface2 : new atec(iBinder2);
        }
        this.a = cpfzVar;
        this.b = i;
        this.c = ateeVar;
        this.d = qrCodeMetadata;
        this.e = num;
    }
}
