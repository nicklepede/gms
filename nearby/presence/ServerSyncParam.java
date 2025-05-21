package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ckkv;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ServerSyncParam extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckkv();
    public final int a;
    public final boolean b;
    public final List c;
    public final String d;
    public final String e;

    public ServerSyncParam(int i, boolean z, List list, String str, String str2) {
        this.a = i;
        this.b = z;
        this.c = list;
        this.d = str;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.e(parcel, 2, this.b);
        arxc.y(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }
}
