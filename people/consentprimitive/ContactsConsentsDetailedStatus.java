package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cttd;
import defpackage.eihn;
import defpackage.eito;
import defpackage.eits;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ContactsConsentsDetailedStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cttd();
    public final int a;
    public final Bundle b;

    public ContactsConsentsDetailedStatus(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public final eits a() {
        eito eitoVar = new eito();
        Bundle bundle = this.b;
        for (String str : bundle.keySet()) {
            eitoVar.i(new Account(str, "com.google"), Integer.valueOf(bundle.getInt(str)));
        }
        return eitoVar.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsDetailedStatus)) {
            return false;
        }
        ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = (ContactsConsentsDetailedStatus) obj;
        return this.a == contactsConsentsDetailedStatus.a && eihn.a(a(), contactsConsentsDetailedStatus.a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.g(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
