package com.google.android.gms.libs.gmscorelogger;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.asot;
import defpackage.brcu;
import defpackage.brfm;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LogBatch extends AbstractSafeParcelable {
    public final int b;
    public final byte[] c;
    public final int d;
    public final List e;
    public static final asot a = brcu.a();
    public static final Parcelable.Creator CREATOR = new brfm();

    public LogBatch(int i, int i2, byte[] bArr, List list) {
        this.b = i;
        this.d = i2;
        this.c = bArr;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.b;
        int a2 = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.i(parcel, 2, this.c, false);
        arxc.o(parcel, 3, this.d);
        arxc.y(parcel, 4, this.e, false);
        arxc.c(parcel, a2);
    }
}
