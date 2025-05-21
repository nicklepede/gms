package com.google.android.gms.mdd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ccgm;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class FileGroupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccgm();
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.y(parcel, 2, this.c, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.o(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
