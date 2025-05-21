package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.aycz;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class RemoteAppScope extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aycz();
    public final AndroidRoleScope a;
    public final AndroidPackageScope b;

    public RemoteAppScope(AndroidRoleScope androidRoleScope, AndroidPackageScope androidPackageScope) {
        this.a = androidRoleScope;
        this.b = androidPackageScope;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteAppScope)) {
            return false;
        }
        RemoteAppScope remoteAppScope = (RemoteAppScope) obj;
        return fvbo.n(this.a, remoteAppScope.a) && fvbo.n(this.b, remoteAppScope.b);
    }

    public final int hashCode() {
        AndroidRoleScope androidRoleScope = this.a;
        int i = androidRoleScope == null ? 0 : androidRoleScope.a;
        AndroidPackageScope androidPackageScope = this.b;
        return (i * 31) + (androidPackageScope != null ? androidPackageScope.hashCode() : 0);
    }

    public final String toString() {
        return "RemoteAppScope(androidRoleScope=" + this.a + ", androidPackageScope=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        AndroidRoleScope androidRoleScope = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, androidRoleScope, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }

    public RemoteAppScope(AndroidPackageScope androidPackageScope) {
        this(null, androidPackageScope);
    }
}
