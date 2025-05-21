package com.google.android.gms.accountsettings;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.fvbo;
import defpackage.rqe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class PrewarmingParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rqe();
    public final String a;
    public final byte[] b;
    public final int c;
    public final boolean d;

    public PrewarmingParameters(String str, byte[] bArr, int i, boolean z) {
        fvbo.f(str, "accountName");
        fvbo.f(bArr, "resourceKeyByteArray");
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.i(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
