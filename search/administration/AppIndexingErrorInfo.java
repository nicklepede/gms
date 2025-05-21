package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;
import defpackage.arxc;
import defpackage.cyjs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class AppIndexingErrorInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cyjs();
    public String a;
    public int b;
    public int c;
    public String d;
    public long e;
    public Thing f;
    public ActionImpl g;

    public AppIndexingErrorInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.q(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.c(parcel, a);
    }

    public AppIndexingErrorInfo(String str, int i, int i2, String str2, long j, Thing thing, ActionImpl actionImpl) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = j;
        this.f = thing;
        this.g = actionImpl;
    }
}
