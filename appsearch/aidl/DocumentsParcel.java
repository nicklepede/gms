package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vzx;
import defpackage.wbb;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class DocumentsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wbb();
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
            int a = atzr.a(obtain);
            atzr.y(obtain, 1, this.a, false);
            atzr.y(obtain, 2, this.b, false);
            atzr.c(obtain, a);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            vzx.a(parcel, marshall);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
