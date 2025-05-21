package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bghp;
import defpackage.bgky;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GetFileUriRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgky();
    public final bghp a;

    public GetFileUriRequest(IBinder iBinder) {
        bghp bghpVar;
        if (iBinder == null) {
            bghpVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IFileUriCallback");
            bghpVar = queryLocalInterface instanceof bghp ? (bghp) queryLocalInterface : new bghp(iBinder);
        }
        this.a = bghpVar;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "GetFileUriRequest {%s}", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.a);
        arxc.c(parcel, a);
    }
}
