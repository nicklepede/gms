package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.upf;
import defpackage.upg;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class GetTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new upg();
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

    public static upf a() {
        upf upfVar = new upf();
        upfVar.d(false);
        upfVar.c(0);
        upfVar.e(false);
        return upfVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, googleAccount, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.x(parcel, 3, this.c, false);
        arxc.x(parcel, 4, this.d, false);
        arxc.x(parcel, 5, this.e, false);
        arxc.x(parcel, 6, this.f, false);
        arxc.o(parcel, 7, this.g);
        arxc.v(parcel, 8, this.h, false);
        arxc.e(parcel, 9, this.i);
        arxc.i(parcel, 10, this.j, false);
        arxc.v(parcel, 11, this.k, false);
        arxc.e(parcel, 12, this.l);
        arxc.c(parcel, a);
    }
}
