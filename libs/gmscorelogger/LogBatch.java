package com.google.android.gms.libs.gmscorelogger;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.ausn;
import defpackage.btkl;
import defpackage.btnd;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LogBatch extends AbstractSafeParcelable {
    public final int b;
    public final byte[] c;
    public final int d;
    public final List e;
    public static final ausn a = btkl.a();
    public static final Parcelable.Creator CREATOR = new btnd();

    public LogBatch(int i, int i2, byte[] bArr, List list) {
        this.b = i;
        this.d = i2;
        this.c = bArr;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.b;
        int a2 = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.i(parcel, 2, this.c, false);
        atzr.o(parcel, 3, this.d);
        atzr.y(parcel, 4, this.e, false);
        atzr.c(parcel, a2);
    }
}
