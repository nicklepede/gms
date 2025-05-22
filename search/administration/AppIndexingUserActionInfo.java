package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.ActionImpl;
import defpackage.atzr;
import defpackage.dats;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class AppIndexingUserActionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dats();
    public String a;
    public long b;
    public ActionImpl c;

    public AppIndexingUserActionInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.q(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }

    public AppIndexingUserActionInfo(String str, long j, ActionImpl actionImpl) {
        this.a = str;
        this.b = j;
        this.c = actionImpl;
    }
}
