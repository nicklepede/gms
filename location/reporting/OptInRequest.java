package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cctn;
import defpackage.ccto;
import defpackage.ccue;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class OptInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccto();
    public final Account a;
    public final String b;
    public final String c;
    private final boolean d;

    public OptInRequest(Account account, String str, String str2, boolean z) {
        this.a = account;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final Boolean a() {
        return Boolean.valueOf(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptInRequest)) {
            return false;
        }
        OptInRequest optInRequest = (OptInRequest) obj;
        return this.a.equals(optInRequest.a) && atyq.b(this.b, optInRequest.b) && atyq.b(this.c, optInRequest.c) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(optInRequest.d));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        return "UploadRequest{, account=" + ccue.a(this.a) + ", tag='" + this.b + ", auditToken=" + this.c + ", enableAdsSubconsent=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, account, i, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.e(parcel, 5, a().booleanValue());
        atzr.c(parcel, a);
    }

    public OptInRequest(cctn cctnVar) {
        this.a = cctnVar.a;
        this.b = cctnVar.b;
        this.c = cctnVar.c;
        this.d = false;
    }
}
