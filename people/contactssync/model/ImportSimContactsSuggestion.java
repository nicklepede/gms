package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctwq;
import defpackage.eihn;
import defpackage.eiib;
import defpackage.eiic;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ImportSimContactsSuggestion extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctwq();
    public final AccountWithDataSet a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final BitSet h;

    public ImportSimContactsSuggestion(AccountWithDataSet accountWithDataSet, int i, int i2, int i3, int i4, int i5, boolean z, BitSet bitSet) {
        this.a = accountWithDataSet;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = z;
        this.h = bitSet;
    }

    public final int a() {
        return this.e - this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportSimContactsSuggestion)) {
            return false;
        }
        ImportSimContactsSuggestion importSimContactsSuggestion = (ImportSimContactsSuggestion) obj;
        return this.b == importSimContactsSuggestion.b && this.c == importSimContactsSuggestion.c && this.d == importSimContactsSuggestion.d && this.e == importSimContactsSuggestion.e && this.f == importSimContactsSuggestion.f && this.g == importSimContactsSuggestion.g && eihn.a(this.a, importSimContactsSuggestion.a) && eihn.a(this.h, importSimContactsSuggestion.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    public final String toString() {
        eiib b = eiic.b(this);
        b.b("destinationAccount", this.a);
        b.f("simSubscriptionId", this.b);
        b.f("efType", this.c);
        b.f("matchingRawContactCount", this.d);
        b.f("totalSimRecordCount", this.e);
        b.f("suggestionCode", this.f);
        b.h("isDeletionSupported", this.g);
        b.b("existingSimRecordsMask", this.h);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AccountWithDataSet accountWithDataSet = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, accountWithDataSet, i, false);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.o(parcel, 6, this.f);
        arxc.e(parcel, 7, this.g);
        BitSet bitSet = this.h;
        arxc.i(parcel, 8, bitSet != null ? bitSet.toByteArray() : null, false);
        arxc.c(parcel, a);
    }
}
