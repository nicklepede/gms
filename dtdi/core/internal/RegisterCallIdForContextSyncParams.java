package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.TokenWrapper;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bbaw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class RegisterCallIdForContextSyncParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbaw();
    public TokenWrapper a;
    public String b;
    public String c;
    public String d;
    public atee e;

    private RegisterCallIdForContextSyncParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterCallIdForContextSyncParams) {
            RegisterCallIdForContextSyncParams registerCallIdForContextSyncParams = (RegisterCallIdForContextSyncParams) obj;
            if (atyq.b(this.a, registerCallIdForContextSyncParams.a) && atyq.b(this.b, registerCallIdForContextSyncParams.b) && atyq.b(this.c, registerCallIdForContextSyncParams.c) && atyq.b(this.d, registerCallIdForContextSyncParams.d) && atyq.b(this.e, registerCallIdForContextSyncParams.e)) {
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.D(parcel, 5, this.e.asBinder());
        atzr.c(parcel, a);
    }

    public RegisterCallIdForContextSyncParams(TokenWrapper tokenWrapper, String str, String str2, String str3, IBinder iBinder) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = tokenWrapper;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = atecVar;
    }
}
