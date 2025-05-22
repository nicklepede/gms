package com.google.android.gms.safebrowsing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dagw;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SafeBrowsingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dagw();
    public final String a;
    public final List b;
    public final int c;

    public SafeBrowsingRequest(String str, List list, int i) {
        this.a = str;
        this.b = list;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.E(parcel, 3, this.b);
        atzr.o(parcel, 4, this.c);
        atzr.c(parcel, a);
    }
}
