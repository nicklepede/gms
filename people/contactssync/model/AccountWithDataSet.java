package com.google.android.gms.people.contactssync.model;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cwfk;
import defpackage.ekus;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class AccountWithDataSet extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwfk();
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
        return this.c == accountWithDataSet.c && ekus.a(this.a, accountWithDataSet.a) && ekus.a(this.b, accountWithDataSet.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, account, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.e(parcel, 3, c());
        atzr.c(parcel, a);
    }
}
