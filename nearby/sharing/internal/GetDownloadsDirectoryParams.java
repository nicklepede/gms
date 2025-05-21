package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmvn;
import defpackage.cmxo;
import defpackage.cmxq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetDownloadsDirectoryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmvn();
    public cmxq a;

    private GetDownloadsDirectoryParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetDownloadsDirectoryParams) {
            return arwb.b(this.a, ((GetDownloadsDirectoryParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.c(parcel, a);
    }

    public GetDownloadsDirectoryParams(IBinder iBinder) {
        cmxq cmxoVar;
        if (iBinder == null) {
            cmxoVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IStringResultListener");
            cmxoVar = queryLocalInterface instanceof cmxq ? (cmxq) queryLocalInterface : new cmxo(iBinder);
        }
        this.a = cmxoVar;
    }
}
