package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.udy;
import defpackage.ufc;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class DocumentsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ufc();
    final List a;
    final List b;

    public DocumentsParcel(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            int a = arxc.a(obtain);
            arxc.y(obtain, 1, this.a, false);
            arxc.y(obtain, 2, this.b, false);
            arxc.c(obtain, a);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            udy.a(parcel, marshall);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
