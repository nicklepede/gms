package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cwfu;
import defpackage.elqn;
import defpackage.eqbm;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetImportSimContactsSuggestionsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwfu();
    public final AccountWithDataSet a;
    public final boolean b;
    private final Set c;

    public GetImportSimContactsSuggestionsRequest(AccountWithDataSet accountWithDataSet, Set set, boolean z) {
        this.a = accountWithDataSet;
        this.c = set;
        this.b = z;
    }

    public static GetImportSimContactsSuggestionsRequest a(AccountWithDataSet accountWithDataSet) {
        return new GetImportSimContactsSuggestionsRequest(accountWithDataSet, new elqn(1), true);
    }

    public final boolean b(int i) {
        return this.c.contains(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AccountWithDataSet accountWithDataSet = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, accountWithDataSet, i, false);
        atzr.p(parcel, 2, eqbm.m(this.c), false);
        atzr.e(parcel, 3, this.b);
        atzr.c(parcel, a);
    }
}
