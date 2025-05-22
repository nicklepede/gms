package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vnq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PIMEUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vnq();
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
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.e(parcel, 6, this.f);
        atzr.g(parcel, 8, this.g, false);
        atzr.q(parcel, 9, this.h);
        atzr.q(parcel, 10, this.i);
        atzr.t(parcel, 11, this.j, i, false);
        atzr.c(parcel, a);
    }
}
