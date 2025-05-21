package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.aywc;
import defpackage.aywt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GetMediaTransferEnabledParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aywc();
    public aywt a;

    public GetMediaTransferEnabledParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetMediaTransferEnabledParams) {
            return arwb.b(this.a, ((GetMediaTransferEnabledParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.a);
        arxc.c(parcel, a);
    }

    public GetMediaTransferEnabledParams(IBinder iBinder) {
        aywt aywtVar;
        if (iBinder == null) {
            aywtVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IMediaTransferStatusCallback");
            aywtVar = queryLocalInterface instanceof aywt ? (aywt) queryLocalInterface : new aywt(iBinder);
        }
        this.a = aywtVar;
    }
}
