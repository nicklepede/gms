package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dduy;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AccountTransferResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dduy();
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
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, arrayList, false);
        arxc.o(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.y(parcel, 5, this.e, false);
        arxc.y(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.c(parcel, a);
    }
}
