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
import defpackage.ayxq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class UnregisterCallIdForContextSyncParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayxq();
    public String a;
    public arbp b;

    private UnregisterCallIdForContextSyncParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnregisterCallIdForContextSyncParams) {
            UnregisterCallIdForContextSyncParams unregisterCallIdForContextSyncParams = (UnregisterCallIdForContextSyncParams) obj;
            if (arwb.b(this.a, unregisterCallIdForContextSyncParams.a) && arwb.b(this.b, unregisterCallIdForContextSyncParams.b)) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.D(parcel, 2, this.b.asBinder());
        arxc.c(parcel, a);
    }

    public UnregisterCallIdForContextSyncParams(String str, IBinder iBinder) {
        arbp arbnVar;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        this.a = str;
        this.b = arbnVar;
    }
}
