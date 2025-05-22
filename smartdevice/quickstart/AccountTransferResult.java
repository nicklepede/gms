package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dggd;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AccountTransferResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dggd();
    public final ArrayList a;
    public final int b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final ArrayList f;
    public final String g;

    public AccountTransferResult(ArrayList arrayList, int i, String str, String str2, ArrayList arrayList2, ArrayList arrayList3, String str3) {
        this.a = arrayList;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = arrayList2;
        this.f = arrayList3;
        this.g = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, arrayList, false);
        atzr.o(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.y(parcel, 5, this.e, false);
        atzr.y(parcel, 6, this.f, false);
        atzr.v(parcel, 7, this.g, false);
        atzr.c(parcel, a);
    }
}
