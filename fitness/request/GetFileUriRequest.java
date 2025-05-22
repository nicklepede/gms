package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bimf;
import defpackage.bipo;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GetFileUriRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipo();
    public final bimf a;

    public GetFileUriRequest(IBinder iBinder) {
        bimf bimfVar;
        if (iBinder == null) {
            bimfVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IFileUriCallback");
            bimfVar = queryLocalInterface instanceof bimf ? (bimf) queryLocalInterface : new bimf(iBinder);
        }
        this.a = bimfVar;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "GetFileUriRequest {%s}", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.a);
        atzr.c(parcel, a);
    }
}
