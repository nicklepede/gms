package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmta;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ServerSyncParam extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmta();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.e(parcel, 2, this.b);
        atzr.y(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }
}
