package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.djok;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class InstallationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djok();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public InstallationOptions(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InstallationOptions)) {
            return false;
        }
        InstallationOptions installationOptions = (InstallationOptions) obj;
        return this.a == installationOptions.a && this.b == installationOptions.b && this.c == installationOptions.c && this.d == installationOptions.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("ignoreDeviceIdleCondition", Boolean.valueOf(this.a), arrayList);
        atyp.b("ignoreMaintenanceWindow", Boolean.valueOf(this.b), arrayList);
        atyp.b("ignoreServerPostponeAbInstallationConfig", Boolean.valueOf(this.c), arrayList);
        atyp.b("ignoreOptionalPostInstall", Boolean.valueOf(this.d), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.e(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.e(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
