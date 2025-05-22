package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkpc;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkpc();
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
        int a = atzr.a(parcel);
        atzr.E(parcel, 2, this.a);
        atzr.v(parcel, 4, this.b, false);
        atzr.v(parcel, 5, this.c, false);
        atzr.E(parcel, 6, this.d);
        atzr.e(parcel, 7, this.e);
        atzr.v(parcel, 8, this.f, false);
        atzr.c(parcel, a);
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
