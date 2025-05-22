package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wle;
import defpackage.wlf;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class GetTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wlf();
    public final GoogleAccount a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final int g;
    public final String h;
    public final boolean i;
    public final byte[] j;
    public final String k;
    public final boolean l;

    public GetTokenRequest(GoogleAccount googleAccount, String str, List list, List list2, List list3, List list4, int i, String str2, boolean z, byte[] bArr, String str3, boolean z2) {
        this.a = googleAccount;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = i;
        this.h = str2;
        this.i = z;
        this.j = bArr;
        this.k = str3;
        this.l = z2;
    }

    public static wle a() {
        wle wleVar = new wle();
        wleVar.d(false);
        wleVar.c(0);
        wleVar.e(false);
        return wleVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, googleAccount, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.x(parcel, 3, this.c, false);
        atzr.x(parcel, 4, this.d, false);
        atzr.x(parcel, 5, this.e, false);
        atzr.x(parcel, 6, this.f, false);
        atzr.o(parcel, 7, this.g);
        atzr.v(parcel, 8, this.h, false);
        atzr.e(parcel, 9, this.i);
        atzr.i(parcel, 10, this.j, false);
        atzr.v(parcel, 11, this.k, false);
        atzr.e(parcel, 12, this.l);
        atzr.c(parcel, a);
    }
}
