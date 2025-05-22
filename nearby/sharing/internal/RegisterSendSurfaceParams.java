package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpfk;
import defpackage.cpfm;
import defpackage.cpfz;
import defpackage.cpgb;
import defpackage.cpjo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class RegisterSendSurfaceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpjo();
    public cpgb a;
    public cpfm b;
    public int c;
    public atee d;
    public String e;
    public int f;

    public RegisterSendSurfaceParams() {
        this.f = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterSendSurfaceParams) {
            RegisterSendSurfaceParams registerSendSurfaceParams = (RegisterSendSurfaceParams) obj;
            if (atyq.b(this.a, registerSendSurfaceParams.a) && atyq.b(this.b, registerSendSurfaceParams.b) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(registerSendSurfaceParams.c)) && atyq.b(this.d, registerSendSurfaceParams.d) && atyq.b(this.e, registerSendSurfaceParams.e) && atyq.b(Integer.valueOf(this.f), Integer.valueOf(registerSendSurfaceParams.f))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.D(parcel, 2, this.b.asBinder());
        atzr.o(parcel, 3, this.c);
        atzr.D(parcel, 4, this.d.asBinder());
        atzr.v(parcel, 5, this.e, false);
        atzr.o(parcel, 6, this.f);
        atzr.c(parcel, a);
    }

    public RegisterSendSurfaceParams(IBinder iBinder, IBinder iBinder2, int i, IBinder iBinder3, String str, int i2) {
        cpgb cpfzVar;
        cpfm cpfkVar;
        atee ateeVar = null;
        if (iBinder == null) {
            cpfzVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
            cpfzVar = queryLocalInterface instanceof cpgb ? (cpgb) queryLocalInterface : new cpfz(iBinder);
        }
        if (iBinder2 == null) {
            cpfkVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IShareTargetDiscoveredCallback");
            cpfkVar = queryLocalInterface2 instanceof cpfm ? (cpfm) queryLocalInterface2 : new cpfk(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            ateeVar = queryLocalInterface3 instanceof atee ? (atee) queryLocalInterface3 : new atec(iBinder3);
        }
        this.a = cpfzVar;
        this.b = cpfkVar;
        this.c = i;
        this.d = ateeVar;
        this.e = str;
        this.f = i2;
    }
}
