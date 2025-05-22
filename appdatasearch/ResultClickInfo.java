package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vof;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ResultClickInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vof();
    final String a;
    final DocumentId[] b;
    final int c;

    public ResultClickInfo(String str, DocumentId[] documentIdArr, int i) {
        this.a = str;
        this.b = documentIdArr;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.J(parcel, 2, this.b, i);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
