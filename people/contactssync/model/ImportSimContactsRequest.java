package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctwp;
import defpackage.eihn;
import defpackage.eiib;
import defpackage.eiic;
import defpackage.eiuu;
import defpackage.ennt;
import java.util.Arrays;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ImportSimContactsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctwp();
    public final Set a;
    public final AccountWithDataSet b;

    public ImportSimContactsRequest(Set set, AccountWithDataSet accountWithDataSet) {
        this.a = eiuu.G(set);
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
        return eihn.a(this.a, importSimContactsRequest.a) && eihn.a(this.b, importSimContactsRequest.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        eiib b = eiic.b(this);
        b.b("subscriptionIds", this.a);
        b.b("destinationAccount", this.b);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        arxc.p(parcel, 1, ennt.m(set), false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
