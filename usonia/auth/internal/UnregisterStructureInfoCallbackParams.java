package com.google.android.gms.usonia.auth.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dkfo;
import defpackage.dkfq;
import defpackage.dkfr;
import defpackage.dkft;
import defpackage.dkgt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class UnregisterStructureInfoCallbackParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkgt();
    public dkfq a;
    public dkft b;

    public UnregisterStructureInfoCallbackParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnregisterStructureInfoCallbackParams) {
            UnregisterStructureInfoCallbackParams unregisterStructureInfoCallbackParams = (UnregisterStructureInfoCallbackParams) obj;
            if (atyq.b(this.a, unregisterStructureInfoCallbackParams.a) && atyq.b(this.b, unregisterStructureInfoCallbackParams.b)) {
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
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        dkft dkftVar = this.b;
        atzr.D(parcel, 2, dkftVar == null ? null : dkftVar.asBinder());
        atzr.c(parcel, a);
    }

    public UnregisterStructureInfoCallbackParams(IBinder iBinder, IBinder iBinder2) {
        dkfq dkfoVar;
        dkft dkftVar = null;
        if (iBinder == null) {
            dkfoVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usonia.auth.internal.IStructureInfoCallback");
            dkfoVar = queryLocalInterface instanceof dkfq ? (dkfq) queryLocalInterface : new dkfo(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.usonia.auth.internal.IUsoniaAuthStatusCallback");
            dkftVar = queryLocalInterface2 instanceof dkft ? (dkft) queryLocalInterface2 : new dkfr(iBinder2);
        }
        this.a = dkfoVar;
        this.b = dkftVar;
    }
}
