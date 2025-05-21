package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.TokenWrapper;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ayxc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class RegisterCallIdForContextSyncParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayxc();
    public TokenWrapper a;
    public String b;
    public String c;
    public String d;
    public arbp e;

    private RegisterCallIdForContextSyncParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterCallIdForContextSyncParams) {
            RegisterCallIdForContextSyncParams registerCallIdForContextSyncParams = (RegisterCallIdForContextSyncParams) obj;
            if (arwb.b(this.a, registerCallIdForContextSyncParams.a) && arwb.b(this.b, registerCallIdForContextSyncParams.b) && arwb.b(this.c, registerCallIdForContextSyncParams.c) && arwb.b(this.d, registerCallIdForContextSyncParams.d) && arwb.b(this.e, registerCallIdForContextSyncParams.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.D(parcel, 5, this.e.asBinder());
        arxc.c(parcel, a);
    }

    public RegisterCallIdForContextSyncParams(TokenWrapper tokenWrapper, String str, String str2, String str3, IBinder iBinder) {
        arbp arbnVar;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        this.a = tokenWrapper;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = arbnVar;
    }
}
