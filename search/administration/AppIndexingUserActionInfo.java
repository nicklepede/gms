package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.ActionImpl;
import defpackage.arxc;
import defpackage.cyju;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class AppIndexingUserActionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cyju();
    public String a;
    public long b;
    public ActionImpl c;

    public AppIndexingUserActionInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.q(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }

    public AppIndexingUserActionInfo(String str, long j, ActionImpl actionImpl) {
        this.a = str;
        this.b = j;
        this.c = actionImpl;
    }
}
