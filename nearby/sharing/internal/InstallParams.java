package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpge;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class InstallParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpge();
    public ShareTarget a;
    public long b;
    public atee c;

    public InstallParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InstallParams) {
            InstallParams installParams = (InstallParams) obj;
            if (atyq.b(this.a, installParams.a) && atyq.b(Long.valueOf(this.b), Long.valueOf(installParams.b)) && atyq.b(this.c, installParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.q(parcel, 2, this.b);
        atzr.D(parcel, 3, this.c.asBinder());
        atzr.c(parcel, a);
    }

    public InstallParams(ShareTarget shareTarget, long j, IBinder iBinder) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = shareTarget;
        this.b = j;
        this.c = atecVar;
    }
}
