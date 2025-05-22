package com.google.android.gms.fido.fido2.api.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bdwt;
import defpackage.fgpr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FidoCredentialDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdwt();
    public final String a;
    public final String b;
    public final fgpr c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final Account g;
    public final boolean h;
    private final fgpr i;

    public FidoCredentialDetails(String str, String str2, fgpr fgprVar, fgpr fgprVar2, boolean z, boolean z2, long j, Account account, boolean z3) {
        this.a = str;
        this.b = str2;
        this.i = fgprVar;
        this.c = fgprVar2;
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
        return atyq.b(this.a, fidoCredentialDetails.a) && atyq.b(this.b, fidoCredentialDetails.b) && atyq.b(this.i, fidoCredentialDetails.i) && atyq.b(this.c, fidoCredentialDetails.c) && this.d == fidoCredentialDetails.d && this.e == fidoCredentialDetails.e && this.h == fidoCredentialDetails.h && this.f == fidoCredentialDetails.f && atyq.b(this.g, fidoCredentialDetails.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.i, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.h), Long.valueOf(this.f), this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        fgpr fgprVar = this.i;
        atzr.i(parcel, 3, fgprVar == null ? null : fgprVar.M(), false);
        atzr.i(parcel, 4, a(), false);
        atzr.e(parcel, 5, this.d);
        atzr.e(parcel, 6, this.e);
        atzr.q(parcel, 7, this.f);
        atzr.t(parcel, 8, this.g, i, false);
        atzr.e(parcel, 9, this.h);
        atzr.c(parcel, a);
    }
}
