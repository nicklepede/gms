package com.google.android.gms.mdd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cepg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FileGroupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cepg();
    public final String a;
    public final String b;
    public final List c;
    public final int d;

    public FileGroupResponse(String str, String str2, int i, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.y(parcel, 2, this.c, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.o(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
