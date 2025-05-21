package com.google.android.gms.people.contactssync.model;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctwe;
import defpackage.eihn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class AccountWithDataSet extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctwe();
    public final Account a;
    public final String b;

    @Deprecated
    private final boolean c;

    public AccountWithDataSet(Account account, String str, boolean z) {
        this.a = account;
        this.b = str;
        this.c = z;
    }

    public final String a() {
        Account account;
        if (this.c || (account = this.a) == null) {
            return null;
        }
        return account.name;
    }

    public final String b() {
        Account account;
        if (this.c || (account = this.a) == null) {
            return null;
        }
        return account.type;
    }

    public final boolean c() {
        return this.a == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountWithDataSet)) {
            return false;
        }
        AccountWithDataSet accountWithDataSet = (AccountWithDataSet) obj;
        return this.c == accountWithDataSet.c && eihn.a(this.a, accountWithDataSet.a) && eihn.a(this.b, accountWithDataSet.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, account, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, c());
        arxc.c(parcel, a);
    }
}
