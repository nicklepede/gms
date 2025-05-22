package com.google.android.gms.appsearch.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.vxk;
import defpackage.vxl;
import defpackage.vzx;
import defpackage.wax;
import defpackage.wba;
import defpackage.wcj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AppSearchBatchResultParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wax();
    final Bundle a;
    private vxl b;

    public AppSearchBatchResultParcel(Bundle bundle) {
        this.a = bundle;
    }

    public final vxl a() {
        if (this.b == null) {
            vxk vxkVar = new vxk();
            Bundle bundle = this.a;
            for (String str : bundle.keySet()) {
                AppSearchResultParcel appSearchResultParcel = (AppSearchResultParcel) wcj.b(bundle, str, AppSearchResultParcel.CREATOR);
                if (appSearchResultParcel != null) {
                    vxkVar.c(str, appSearchResultParcel.l);
                }
            }
            this.b = vxkVar.a();
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            Bundle bundle = this.a;
            for (String str : bundle.keySet()) {
                AppSearchResultParcel appSearchResultParcel = (AppSearchResultParcel) wcj.b(bundle, str, AppSearchResultParcel.CREATOR);
                if (appSearchResultParcel != null) {
                    obtain.writeString(str);
                    wba.b(appSearchResultParcel, obtain, i);
                }
            }
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            vzx.a(parcel, marshall);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
