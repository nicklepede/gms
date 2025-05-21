package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.didr;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new didr();
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    IsReadyToPayRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.E(parcel, 2, this.a);
        arxc.v(parcel, 4, this.b, false);
        arxc.v(parcel, 5, this.c, false);
        arxc.E(parcel, 6, this.d);
        arxc.e(parcel, 7, this.e);
        arxc.v(parcel, 8, this.f, false);
        arxc.c(parcel, a);
    }

    public IsReadyToPayRequest(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z, String str3) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = arrayList2;
        this.e = z;
        this.f = str3;
    }
}
