package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.trq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PIMEUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new trq();
    final byte[] a;
    final byte[] b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    final Bundle g;
    public final long h;
    public final long i;
    public final Account j;

    public PIMEUpdate(byte[] bArr, byte[] bArr2, int i, String str, String str2, boolean z, Bundle bundle, long j, long j2, Account account) {
        this.a = bArr;
        this.b = bArr2;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = bundle;
        this.h = j;
        this.i = j2;
        this.j = account;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.i(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.e(parcel, 6, this.f);
        arxc.g(parcel, 8, this.g, false);
        arxc.q(parcel, 9, this.h);
        arxc.q(parcel, 10, this.i);
        arxc.t(parcel, 11, this.j, i, false);
        arxc.c(parcel, a);
    }
}
