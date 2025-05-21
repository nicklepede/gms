package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctwo;
import defpackage.ejdg;
import defpackage.ennt;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetImportSimContactsSuggestionsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctwo();
    public final AccountWithDataSet a;
    public final boolean b;
    private final Set c;

    public GetImportSimContactsSuggestionsRequest(AccountWithDataSet accountWithDataSet, Set set, boolean z) {
        this.a = accountWithDataSet;
        this.c = set;
        this.b = z;
    }

    public static GetImportSimContactsSuggestionsRequest a(AccountWithDataSet accountWithDataSet) {
        return new GetImportSimContactsSuggestionsRequest(accountWithDataSet, new ejdg(1), true);
    }

    public final boolean b(int i) {
        return this.c.contains(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AccountWithDataSet accountWithDataSet = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, accountWithDataSet, i, false);
        arxc.p(parcel, 2, ennt.m(this.c), false);
        arxc.e(parcel, 3, this.b);
        arxc.c(parcel, a);
    }
}
