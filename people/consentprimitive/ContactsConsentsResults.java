package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cwck;
import defpackage.ekus;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ContactsConsentsResults extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwck();
    public final Account a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;

    public ContactsConsentsResults(Account account, boolean z, int i, int i2, int i3) {
        this.a = account;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsResults)) {
            return false;
        }
        ContactsConsentsResults contactsConsentsResults = (ContactsConsentsResults) obj;
        return this.b == contactsConsentsResults.b && ekus.a(this.a, contactsConsentsResults.a) && this.c == contactsConsentsResults.c && this.d == contactsConsentsResults.d && this.e == contactsConsentsResults.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, account, i, false);
        atzr.e(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
