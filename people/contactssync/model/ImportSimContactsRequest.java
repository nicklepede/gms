package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cwfv;
import defpackage.ekus;
import defpackage.ekvg;
import defpackage.ekvh;
import defpackage.elhz;
import defpackage.eqbm;
import java.util.Arrays;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ImportSimContactsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwfv();
    public final Set a;
    public final AccountWithDataSet b;

    public ImportSimContactsRequest(Set set, AccountWithDataSet accountWithDataSet) {
        this.a = elhz.G(set);
        this.b = accountWithDataSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportSimContactsRequest)) {
            return false;
        }
        ImportSimContactsRequest importSimContactsRequest = (ImportSimContactsRequest) obj;
        return ekus.a(this.a, importSimContactsRequest.a) && ekus.a(this.b, importSimContactsRequest.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ekvg b = ekvh.b(this);
        b.b("subscriptionIds", this.a);
        b.b("destinationAccount", this.b);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        atzr.p(parcel, 1, eqbm.m(set), false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
