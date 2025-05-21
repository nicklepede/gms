package com.google.android.gms.appsearch.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ubl;
import defpackage.ubm;
import defpackage.udy;
import defpackage.uey;
import defpackage.ufb;
import defpackage.ugk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AppSearchBatchResultParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uey();
    final Bundle a;
    private ubm b;

    public AppSearchBatchResultParcel(Bundle bundle) {
        this.a = bundle;
    }

    public final ubm a() {
        if (this.b == null) {
            ubl ublVar = new ubl();
            Bundle bundle = this.a;
            for (String str : bundle.keySet()) {
                AppSearchResultParcel appSearchResultParcel = (AppSearchResultParcel) ugk.b(bundle, str, AppSearchResultParcel.CREATOR);
                if (appSearchResultParcel != null) {
                    ublVar.c(str, appSearchResultParcel.l);
                }
            }
            this.b = ublVar.a();
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            Bundle bundle = this.a;
            for (String str : bundle.keySet()) {
                AppSearchResultParcel appSearchResultParcel = (AppSearchResultParcel) ugk.b(bundle, str, AppSearchResultParcel.CREATOR);
                if (appSearchResultParcel != null) {
                    obtain.writeString(str);
                    ufb.b(appSearchResultParcel, obtain, i);
                }
            }
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            udy.a(parcel, marshall);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
