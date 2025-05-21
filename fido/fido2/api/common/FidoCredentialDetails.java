package com.google.android.gms.fido.fido2.api.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bbtc;
import defpackage.feay;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FidoCredentialDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbtc();
    public final String a;
    public final String b;
    public final feay c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final Account g;
    public final boolean h;
    private final feay i;

    public FidoCredentialDetails(String str, String str2, feay feayVar, feay feayVar2, boolean z, boolean z2, long j, Account account, boolean z3) {
        this.a = str;
        this.b = str2;
        this.i = feayVar;
        this.c = feayVar2;
        this.d = z;
        this.e = z2;
        this.f = j;
        this.g = account;
        this.h = z3;
    }

    public final byte[] a() {
        return this.c.M();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        return arwb.b(this.a, fidoCredentialDetails.a) && arwb.b(this.b, fidoCredentialDetails.b) && arwb.b(this.i, fidoCredentialDetails.i) && arwb.b(this.c, fidoCredentialDetails.c) && this.d == fidoCredentialDetails.d && this.e == fidoCredentialDetails.e && this.h == fidoCredentialDetails.h && this.f == fidoCredentialDetails.f && arwb.b(this.g, fidoCredentialDetails.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.i, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.h), Long.valueOf(this.f), this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        feay feayVar = this.i;
        arxc.i(parcel, 3, feayVar == null ? null : feayVar.M(), false);
        arxc.i(parcel, 4, a(), false);
        arxc.e(parcel, 5, this.d);
        arxc.e(parcel, 6, this.e);
        arxc.q(parcel, 7, this.f);
        arxc.t(parcel, 8, this.g, i, false);
        arxc.e(parcel, 9, this.h);
        arxc.c(parcel, a);
    }
}
