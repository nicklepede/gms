package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjbn;
import defpackage.cjbp;
import defpackage.cjdt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class SetDownloadsDirectoryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjdt();
    public cjbp a;
    public String b;

    public SetDownloadsDirectoryParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetDownloadsDirectoryParams) {
            SetDownloadsDirectoryParams setDownloadsDirectoryParams = (SetDownloadsDirectoryParams) obj;
            if (arwb.b(this.a, setDownloadsDirectoryParams.a) && arwb.b(this.b, setDownloadsDirectoryParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        cjbp cjbpVar = this.a;
        arxc.D(parcel, 1, cjbpVar == null ? null : cjbpVar.asBinder());
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public SetDownloadsDirectoryParams(IBinder iBinder, String str) {
        cjbp cjbnVar;
        if (iBinder == null) {
            cjbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cjbnVar = queryLocalInterface instanceof cjbp ? (cjbp) queryLocalInterface : new cjbn(iBinder);
        }
        this.a = cjbnVar;
        this.b = str;
    }
}
