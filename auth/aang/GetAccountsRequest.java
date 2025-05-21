package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.upc;
import defpackage.upd;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class GetAccountsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new upd();
    public final String a;
    public final List b;
    public final List c;
    public final boolean d;

    public GetAccountsRequest(String str, List list, List list2, boolean z) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = z;
    }

    public static upc a() {
        upc upcVar = new upc();
        upcVar.b = (byte) 1;
        return upcVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.x(parcel, 2, this.b, false);
        arxc.x(parcel, 3, this.c, false);
        arxc.e(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
