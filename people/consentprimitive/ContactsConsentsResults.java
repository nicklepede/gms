package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctte;
import defpackage.eihn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ContactsConsentsResults extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctte();
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
        return this.b == contactsConsentsResults.b && eihn.a(this.a, contactsConsentsResults.a) && this.c == contactsConsentsResults.c && this.d == contactsConsentsResults.d && this.e == contactsConsentsResults.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, account, i, false);
        arxc.e(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
