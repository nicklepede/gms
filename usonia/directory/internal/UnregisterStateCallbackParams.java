package com.google.android.gms.usonia.directory.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dkhm;
import defpackage.dkho;
import defpackage.dkhs;
import defpackage.dkhu;
import defpackage.dkiu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class UnregisterStateCallbackParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkiu();
    public dkhu a;
    public String b;
    public dkho c;

    public UnregisterStateCallbackParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnregisterStateCallbackParams) {
            UnregisterStateCallbackParams unregisterStateCallbackParams = (UnregisterStateCallbackParams) obj;
            if (atyq.b(this.a, unregisterStateCallbackParams.a) && atyq.b(this.b, unregisterStateCallbackParams.b) && atyq.b(this.c, unregisterStateCallbackParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.v(parcel, 2, this.b, false);
        atzr.D(parcel, 3, this.c.asBinder());
        atzr.c(parcel, a);
    }

    public UnregisterStateCallbackParams(IBinder iBinder, String str, IBinder iBinder2) {
        dkhu dkhsVar;
        dkho dkhoVar = null;
        if (iBinder == null) {
            dkhsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usonia.directory.internal.IUsoniaStatusCallback");
            dkhsVar = queryLocalInterface instanceof dkhu ? (dkhu) queryLocalInterface : new dkhs(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.usonia.directory.internal.IDirectoryStateCallback");
            dkhoVar = queryLocalInterface2 instanceof dkho ? (dkho) queryLocalInterface2 : new dkhm(iBinder2);
        }
        this.a = dkhsVar;
        this.b = str;
        this.c = dkhoVar;
    }
}
