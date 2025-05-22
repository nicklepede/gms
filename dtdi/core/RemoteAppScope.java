package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bagz;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class RemoteAppScope extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bagz();
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
        return fxxm.n(this.a, remoteAppScope.a) && fxxm.n(this.b, remoteAppScope.b);
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
        fxxm.f(parcel, "dest");
        AndroidRoleScope androidRoleScope = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, androidRoleScope, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }

    public RemoteAppScope(AndroidPackageScope androidPackageScope) {
        this(null, androidPackageScope);
    }
}
